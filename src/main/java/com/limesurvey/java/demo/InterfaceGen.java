package com.limesurvey.java.demo;

import com.google.common.base.CaseFormat;
import com.limesurvey.remotecotrol.internel.JsonRPC;
import com.limesurvey.remotecotrol.options.GetSessionKeyOptions;
import com.sun.codemodel.*;
import retrofit2.http.POST;
import rx.Observable;

import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

/**
 * Created by berk on 6/1/16.
 */
public class InterfaceGen {


    public static void main(String[] args) throws Exception {


        Observable<ApiInfo> ob = new ApiTxtParser().parse(Paths.get("api.txt"));

        //  new InterfaceGen().generate(Paths.get("/tmp/gen"));

        JCodeModel cm = new JCodeModel();
        JPackage pack = cm._package("com.limesurvey.remotecotrol.feature");

        JDefinedClass clazz = pack._interface("SurveyAdmin");
        JDocComment clazzdoc = clazz.javadoc();
        clazzdoc.append("Generated by " + InterfaceGen.class + ".");

        ob.toBlocking().forEach((info) -> {
            try {
                JDefinedClass options = buildOptions(info.getParams(), info.getFunctionName(), "com.limesurvey.remotecotrol.options");
                buildInterface(cm, clazz, info, options);

            } catch (Exception e) {
                e.printStackTrace();
            }

        });
        cm.build(Paths.get("src/main/java").toFile());

    }

    public static JDefinedClass buildOptions(Set<ApiInfo.ParamInfo> params, String functionName, String packageName)
            throws Exception {


        JCodeModel cm = new JCodeModel();

        JPackage pack = cm._package(packageName);


        String className = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, functionName) + "Options";
        JDefinedClass clazz = pack._class(JMod.PUBLIC, className);
        JDocComment clazzdoc = clazz.javadoc();
        clazzdoc.append("Generated by " + InterfaceGen.class + ".");
        clazz._implements(Serializable.class);
        params.forEach(param -> {

            Class<?> type = getType(param.getType());

            JFieldVar field = clazz.field(JMod.PRIVATE, type, param.getName());

            if (param.getName() == null) {
                System.err.println(param);
                throw new RuntimeException("param [" + param + "] illegal.");
            }

            String setMethodName = "set" + getEndMethodName(param.getName());
            String argName = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, getEndMethodName(param.getName()));
            JMethod setMethod = clazz.method(JMod.PUBLIC, void.class, setMethodName);
            JVar setParam = setMethod.param(type, argName);

            JBlock setbody = setMethod.body();

            setbody.assign(field, setParam);


            String getMethodName = "get" + getEndMethodName(param.getName());
            JMethod getMethod = clazz.method(JMod.PUBLIC, field.type(), getMethodName);
            JBlock getbody = getMethod.body();
            getbody._return(field);


        });
        cm.build(Paths.get("src/main/java").toFile());

        return clazz;
    }

    public static String getEndMethodName(String aaa) {
        if (aaa.matches("^[a-z][A-Z].*")) {
            return aaa.substring(1);
        }
//        aaa.charAt(0);
//        StringBuilder sb = new StringBuilder();
//        sb.append(Ascii.toLowerCase(aaa.charAt(0)));
//        sb.append(aaa.substring(1));
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, aaa);

    }

    public static Class<?> getType(String name) {
        if (name == null) {
            return String.class;
        }
        switch (name) {
            case "array":
                return String.class;
            case "int":
                return Integer.class;
            case "boolean":
                return Boolean.class;
            default:
                return String.class;

        }
    }

    public static JCodeModel buildInterface(JCodeModel cm, JDefinedClass clazz, ApiInfo apiInfo, JDefinedClass options)
            throws Exception {


        ApiInfo.ReturnInfo returnInfo = apiInfo.getReturnInfo();
        JClass returnClass = cm.ref(Observable.class).narrow(getType(returnInfo.getType()));

        String methodName = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, apiInfo.getFunctionName());
        JMethod method = clazz.method(JMod.PUBLIC, returnClass, methodName);
        method.param(options, "options");

        JDocComment javadoc = method.javadoc();


        javadoc.add(String.join("<p>\n", apiInfo.getComments()));

        JAnnotationUse postannotate = method.annotate(POST.class);
        postannotate.param("value", "remotecontrol");

        JAnnotationUse rpcanno = method.annotate(JsonRPC.class);

        rpcanno.param("value", apiInfo.getFunctionName());

        method.params().stream().forEach(javadoc::addParam);

        JCommentPart returndoc = javadoc.addReturn();
        returndoc.add(returnInfo.getComment());

        return cm;
    }

    public void generate(Path dir) throws Exception {

        JCodeModel cm = new JCodeModel();


        JPackage pack = cm._package("com.test.demo");
        JDefinedClass clazz = pack._interface("TestInterface");


        JClass aa = cm.ref(Observable.class).narrow(String.class);


        //JType returnType = JPrimitiveType.parse(cm, "rx.Observable<java.lang.String>");


        JMethod jmethod = clazz.method(JMod.PUBLIC, aa, "getSessionKey");
        JDocComment methoddoc = jmethod.javadoc();
        jmethod.param(GetSessionKeyOptions.class, "options");
        methoddoc.add("RPC routine to create a session key.");


        jmethod.params().stream().forEach(methoddoc::addParam);


        cm.build(dir.toFile());


    }

}

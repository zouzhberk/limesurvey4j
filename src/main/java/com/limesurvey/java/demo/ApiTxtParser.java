package com.limesurvey.java.demo;

import rx.Observable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by berk on 6/1/16.
 */
public class ApiTxtParser
{


    public static void main(String[] args) throws IOException
    {
        new ApiTxtParser().parse(Paths.get("api.txt")).subscribe(System.out::println);
    }

    public Observable<ApiInfo> parse(Path apifile)
    {


        Observable<List<String>> ob = Observable.create(f -> {
            List<String> lines = null;
            try
            {
                lines = Files.readAllLines(apifile);
                List<String> sublines = new ArrayList<String>();
                for (String line : lines)
                {
                    sublines.add(line);
                    if (line.contains("*/"))
                    {
                        f.onNext(sublines);
                        sublines = new ArrayList<String>();
                        continue;
                    }
                }
                f.onCompleted();

            }
            catch (IOException e)
            {
                f.onError(e);
            }

        });

        return ob.map(list -> {
            ApiInfo info = new ApiInfo();
            list.removeIf(s -> s == null || s.trim().isEmpty());
            info.setFunctionName(list.remove(0));
            //"@access";

            Set<ApiInfo.ParamInfo> paramInfos = new LinkedHashSet<ApiInfo.ParamInfo>();

            List<String> comments = new ArrayList<String>();
            ApiInfo.ReturnInfo returnInfo = new ApiInfo.ReturnInfo();

            for (String s : list)
            {
                if (s.contains("@access"))
                {
                    info.setPublic(s.split("@access")[1].contains("public"));
                    continue;
                }

                if (s.contains("@param"))
                {
                    String rawparam = s.split("@param")[1].trim();

                    int typeindex = rawparam.indexOf(" ");
                    ApiInfo.ParamInfo paramInfo = new ApiInfo.ParamInfo();
                    if (typeindex > 0)
                    {

                        paramInfo.setType(rawparam.substring(0, typeindex));

                        int namebeginIndex = rawparam.indexOf("$");
                        int nameendIndex = rawparam.indexOf(" ", namebeginIndex);

                        if (namebeginIndex > 0)
                        {
                            if (nameendIndex > 0)
                            {
                                paramInfo.setName(rawparam.substring(namebeginIndex + 1, nameendIndex));
                            }
                            else
                            {
                                paramInfo.setName(rawparam.substring(namebeginIndex + 1));
                            }

                            paramInfo.setComment(rawparam.substring(nameendIndex + 1));
                        }
                        else
                        {
                            paramInfo.setComment(rawparam.substring(typeindex + 1));
                        }
                        paramInfos.add(paramInfo);
                    }

                    continue;
                }

                if (s.contains("@return "))
                {
                    String rawinfo = s.split("@return")[1].trim();
                    int index = rawinfo.indexOf(" ");
                    if (index < 0)
                    {
                        returnInfo.setComment(rawinfo);
                        returnInfo.setType("object");

                    }
                    else
                    {
                        String type = rawinfo.substring(0, index);
                        returnInfo.setComment(rawinfo.substring(index + 1));
                        returnInfo.setType(type);

                    }

                    continue;
                }
                if (s.trim().isEmpty() || s.contains("/**") || s.contains("*/"))
                {
                    continue;
                }
                comments.add(s.replace("*", ""));

            }
            info.setParams(paramInfos);
            info.setComments(comments.stream().toArray(String[]::new));
            info.setReturnInfo(returnInfo);
            return info;

        }).asObservable();


    }
}

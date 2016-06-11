package com.limesurvey.remotecontrol.internel;

import java.util.Random;

class JsonRPCRequest {
    static final Random RANDOM = new Random();

    final String method;
    final Object params;
    final int id;

    JsonRPCRequest(String method, Object params, int id) {
        this.method = method;
        this.params = params;
        this.id = id;
    }

    static JsonRPCRequest create(String method, Object args) {
        int id =1;// new Random().nextInt(10000);
        return new JsonRPCRequest(method, args, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JsonRPCRequest that = (JsonRPCRequest) o;

        if (id != that.id) return false;
        if (!method.equals(that.method)) return false;
        return params.equals(that.params);
    }

    @Override
    public int hashCode() {
        int result = method.hashCode();
        result = 31 * result + params.hashCode();
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }
}

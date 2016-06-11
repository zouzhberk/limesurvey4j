package com.limesurvey.remotecontrol.internel;

class JsonRPCResponse<T> {
    int id;
    T result;
    Object error;


    public int getId() {
        return id;
    }

    public JsonRPCResponse setId(int id) {
        this.id = id;
        return this;
    }

    public T getResult() {
        return result;
    }

    public JsonRPCResponse setResult(T result) {
        this.result = result;
        return this;
    }

    public Object getError() {
        return error;
    }

    public JsonRPCResponse setError(Object error) {
        this.error = error;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JsonRPCResponse<?> that = (JsonRPCResponse<?>) o;

        if (id != that.id) return false;
        if (result != null ? !result.equals(that.result) : that.result != null) return false;
        return !(error != null ? !error.equals(that.error) : that.error != null);
    }

    @Override
    public int hashCode() {
        int result1 = (int) (id ^ (id >>> 32));
        result1 = 31 * result1 + (result != null ? result.hashCode() : 0);
        result1 = 31 * result1 + (error != null ? error.hashCode() : 0);
        return result1;
    }
}

package com.beijing.zzu.zsxy.api;

/**
 * Created by jiayongkai on 2017/4/18.
 */

public class HttpResult<T> {
    private boolean error;
    private T results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public T getResults() {
        return results;
    }

    public void setResults(T results) {
        this.results = results;
    }
}

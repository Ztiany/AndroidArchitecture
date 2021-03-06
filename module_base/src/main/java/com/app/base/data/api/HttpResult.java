package com.app.base.data.api;


import com.android.sdk.net.core.result.Result;
import com.google.gson.annotations.SerializedName;

import androidx.annotation.NonNull;

public class HttpResult<T> implements Result<T> {

    public HttpResult() {
    }

    HttpResult(int code) {
        this.code = code;
    }

    @SerializedName("msg")
    private String msg;

    @SerializedName("ret")
    private int code;

    @SerializedName("data")
    private T data;

    public T getData() {
        return data;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return msg;
    }

    @Override
    public boolean isSuccess() {
        return ApiHelper.isSuccess(this);
    }

    public boolean hasData() {
        return data != null;
    }

    @NonNull
    @Override
    public String toString() {
        return "HttpResult{" +
                ", code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

}
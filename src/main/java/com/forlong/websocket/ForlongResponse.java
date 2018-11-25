package com.forlong.websocket;

/**
 * Created by Administrator on 2018/11/25.
 */
public class ForlongResponse {
    private String responseMessage;

    public ForlongResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}

package com.gianni.consumer.entity;


public class SomeResponse {

    private String message;

    public SomeResponse() {
    }

    public SomeResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

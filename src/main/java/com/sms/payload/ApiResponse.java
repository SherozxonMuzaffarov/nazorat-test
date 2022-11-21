package com.sms.payload;

import com.sms.model.VagonMalumot;

public class ApiResponse {

    private String message;
    private VagonMalumot vagonMalumot;
    private boolean success;

    public ApiResponse(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public ApiResponse(VagonMalumot vagonMalumot, boolean success) {
        this.vagonMalumot = vagonMalumot;
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getObject() {
        return vagonMalumot;
    }

    public void setObject(VagonMalumot vagonMalumot) {
        this.vagonMalumot = vagonMalumot;
    }
}

package com.greenfoxacademy.trialexam.models;

public class ServiceHelper {

    private boolean success;
    private boolean isExists;
    private boolean redirected;

    public ServiceHelper(boolean success, boolean isExists, boolean redirected) {
        this.success = success;
        this.isExists = isExists;
        this.redirected = redirected;
    }

    public boolean isRedirected() {
        return redirected;
    }

    public void setRedirected(boolean redirected) {
        this.redirected = redirected;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isExists() {
        return isExists;
    }

    public void setExists(boolean exists) {
        isExists = exists;
    }

    public void setHelperBooleansToFalse(){
        isExists = false;
        success = false;
    }

    public void setAllBooleansToFalse(){
        isExists = false;
        success = false;
        redirected = false;
    }

}
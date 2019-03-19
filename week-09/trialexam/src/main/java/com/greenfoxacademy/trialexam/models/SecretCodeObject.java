package com.greenfoxacademy.trialexam.models;

public class SecretCodeObject {

    private String secretCode;

    public SecretCodeObject(String secretCode) {
        this.secretCode = secretCode;
    }

    public SecretCodeObject() {
    }

    public String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }
}
package com.mtfn.solid_example.dependencyInversion.best;

public class Sms implements Message {
    @Override
    public void sendMessage() {
        sendSms();
    }

    private void sendSms() {
        // send Sms
    }
}
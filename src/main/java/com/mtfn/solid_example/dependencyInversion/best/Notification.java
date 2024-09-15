package com.mtfn.solid_example.dependencyInversion.best;

public class Notification {

    private final Message message;

    public Notification(Message message) {
        this.message = message;
    }

    public void sendMessage() {
        message.sendMessage();
    }
}

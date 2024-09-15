package com.mtfn.solid_example.dependencyInversion.best;

//well
//Notification notification = new Notification(new Email());
//notification.sendMessage();

public class Email implements Message{
    @Override
    public void sendMessage() {
        sendEmail();
    }

    private void sendEmail() {
        // send email
    }
}

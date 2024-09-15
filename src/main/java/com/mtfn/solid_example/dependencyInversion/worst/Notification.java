package com.mtfn.solid_example.dependencyInversion.worst;

public class Notification {
    // new is bad and if else very complicated
    public void sender(NotificationType notificationType) {
        if (notificationType == NotificationType.SMS) {
            new Sms().sendSMS();
        } else if (notificationType == NotificationType.EMAIL) {
            new Email().sendEmail();
        }
    }
}

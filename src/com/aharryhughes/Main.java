package com.aharryhughes;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	// write your code here
        EmailNotification emailNotification = new EmailNotification("subject", "body", "recip", "smtpProvide");
        TextNotification textNotification = new TextNotification("sub", "bod", "recipient", "smsProvider");

        emailNotification.transport();
        textNotification.transport();

        emailNotification.showStatus();
        textNotification.showStatus();

        emailNotification.someText();

        try {
            Object emailNotificationClone = emailNotification.clone();
            System.out.println(emailNotification.equals(emailNotificationClone));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }



    }
}

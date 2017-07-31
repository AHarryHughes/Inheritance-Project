package com.aharryhughes;

/**
 * Created by ahhughes8 on 7/19/17.
 */
public class TextNotification extends Notification{

    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        super.someText();
    }

    @Override
    public void transport() {
        System.out.println(getSubject() + " " + getBody() + " " + getRecipient() + " " + getSmsProvider());
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }
}

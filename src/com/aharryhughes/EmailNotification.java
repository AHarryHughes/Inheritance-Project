package com.aharryhughes;

/**
 * Created by ahhughes8 on 7/19/17.
 */
public class EmailNotification extends Notification{
    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        super.status = "no good";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        EmailNotification temporaryClone = new EmailNotification(this.getSubject(), this.getBody(), this.getRecipient(), this.getSmtpProvider());
        return temporaryClone;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected void someText() {
        super.someText();
        System.out.println("some more text");
    }

    @Override
    public void transport() {
        System.out.println(getSubject() + " " + getBody() + " " + getRecipient() + " " + getSmtpProvider());
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }
}

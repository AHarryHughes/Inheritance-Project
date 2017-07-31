package com.aharryhughes;

import java.time.LocalDateTime;

/**
 * Created by ahhughes8 on 7/19/17.
 */
public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "is good";

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
    }

    public void showStatus(){
        System.out.println(this.status);
    }

    protected void someText(){
        System.out.println("some text");
    }

    public void transport(){
        //Throw NoTransportException
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }
}

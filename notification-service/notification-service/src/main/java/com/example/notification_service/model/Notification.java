package com.example.notificationservice.model;

public class Notification {
    private String recipientEmail;
    private String subject;
    private String messageBody;

    // Getters and Setters

    /**
     * @return String return the recipientEmail
     */
    public String getRecipientEmail() {
        return recipientEmail;
    }

    /**
     * @param recipientEmail the recipientEmail to set
     */
    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    /**
     * @return String return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return String return the messageBody
     */
    public String getMessageBody() {
        return messageBody;
    }

    /**
     * @param messageBody the messageBody to set
     */
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

}

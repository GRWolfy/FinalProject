package com.example.finalproject.Models;

public class Chat {
    private String sender;
    private String receiver;
    private String message;
    private boolean Seen;

    public Chat(){}

    public Chat(String sender, String receiver, String message, boolean Seen) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.Seen = Seen;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getSeen() {
        return Seen;
    }

    public void setSeen(boolean seen) {
        Seen = seen;
    }
}

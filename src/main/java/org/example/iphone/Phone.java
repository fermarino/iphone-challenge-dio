package org.example.iphone;

public interface Phone {
    void makeCall(String phoneNumber);
    void receiveCall(String phoneNumber);
    void sendMessage(String phoneNumber, String message);
    void receiveMessage(String phoneNumber, String message);
}


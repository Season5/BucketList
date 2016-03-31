package com.jijjy.grace.thebucket;

/**
 * Created by grace on 3/31/16.
 */
public class ChatMessage {
    private String author;
    private String message;

    public ChatMessage(){

    }

    public ChatMessage(String author, String message){
        this.message = message;
        this.author = author;
    }

    public String getAuthor() {

        return author;
    }

    public String getMessage() {
        return message;
    }
}

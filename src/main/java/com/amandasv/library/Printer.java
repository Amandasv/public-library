package com.amandasv.library;

public class Printer {

    private String content;

    public String getContent(String text){
        this.content = text;
        return content;
    }

    public void print(String text) {
        System.out.println(getContent(text));
    }
}

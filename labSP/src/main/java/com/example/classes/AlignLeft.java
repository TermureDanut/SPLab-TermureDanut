package com.example.classes;

public class AlignLeft implements AlignStrategy{
    @Override
    public void render(String text) {
        System.out.println("#" + text);
    }
}
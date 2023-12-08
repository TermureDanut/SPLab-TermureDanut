package com.example.Classes.service.implementation;


import com.example.Classes.service.AlignStrategy;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(String text) {
        int width = 80;
        int padSize = (width - text.length());
        String pad = String.format("%"+padSize+"s", "");
        System.out.println(pad + text);
    }
}
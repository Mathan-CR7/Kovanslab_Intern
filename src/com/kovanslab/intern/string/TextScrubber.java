package com.kovanslab.intern.string;

public class TextScrubber {

    public static void main(String[] args) {

        String text = "H3ll0 W0rld! Th1s is J4v4.";

        String step1 = text.replaceAll("\\d", "*");

        String res = step1.replaceAll("[^\\w\\s*]", "");

        System.out.println("Previous Text : " + text);
        System.out.println("Final Text : " + res);
    }
}

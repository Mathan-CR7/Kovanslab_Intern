package com.kovanslab.intern.string;

public class Enigma
{
    public static String encrypted(String messages,int key)
    {
        StringBuilder enc=new StringBuilder();

        for(char ch : messages.toCharArray())
        {
            char cipherchar = (char) (ch^key);
            enc.append(cipherchar);
        }
        return enc.toString();
    }
    public static String decrypted(String encrypt,int key)
    {
        StringBuilder dec =new StringBuilder();
        for(char ch : encrypt.toCharArray())
        {
            char originaltext =(char)(ch ^ key);
            dec.append(originaltext);
        }
        return dec.toString();
    }
    public static void main(String[] args)
    {
        String msg = "Hello";
        int key =7;

        String encrypt =encrypted(msg,key);
        String decrypt =decrypted(encrypt,key);

        System.out.println("Original Text : "+ msg);
        System.err.println("Encrypted Text : " + encrypt);
        System.out.println("Decrypted Text : "+ decrypt);


    }
}
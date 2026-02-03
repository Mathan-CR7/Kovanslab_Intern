package com.kovanslab.intern.string;
import java.util.regex.*;
public class EmailValidation {
    static boolean isValid(String email)
    {
        String regex ="^[a-zA-z0-9._+%-]+@[a-zA-z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m =p.matcher(email);

        return m.matches();
    }
    public static void main(String[] args) {

        String[] emails =
                {
                        "mathan@gmail.com",
                        "prashath@gmail.com",
                        "sasuke@gmail.com",
                        "hitman@gmail.com",
                        "pandiya@gmail.com",
                        "mathan @gmail.com",
                        "prashath@.com",
                        "sasuke@gmail.c",
                        "hitman_gamil.com",
                        "pan@diya@gmail.com"
                };

        for(String email : emails)
        {
            System.out.println(email + " -> " + isValid(email));
        }
    }
}

package com.example;

import java.util.regex.Pattern;

public class EmailValidator {
    String regex = "^[a-zA-z0-9]{1,}[\\.+-]?[a-zA-z0-9]+@[a-zA-z0-9]{1,}(\\.[a-zA-z]{2,}){1,2}$";
    private Pattern pattern = Pattern.compile(regex);

    public EmailValidator() {}
    
    public boolean validate(String lastName) {

        return pattern.matcher(lastName).matches();
    }

    public static void main(String[] args) {
        String[] validEmails = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
                "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" };

        String[] invalidEmails = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
                ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
                "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };

        EmailValidator emailValidator = new EmailValidator();

        System.out.println("Validating valid emails: ");
        for (String email : validEmails) {
            System.out.println(email + " :  " + emailValidator.validate(email));
        }

        System.out.println("Validating invalid emails: ");
        for (String email : invalidEmails) {
            System.out.println(email + " :  " + emailValidator.validate(email));
        }
    }
}

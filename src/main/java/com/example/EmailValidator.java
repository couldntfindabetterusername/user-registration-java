package com.example;

import java.util.regex.Pattern;

public class EmailValidator {
    private String regex = "^[a-zA-Z0-9]+([._%+-]+[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})*(\\.[a-zA-Z]{2,})$";
    private Pattern pattern = Pattern.compile(regex);

    public boolean validate(String lastName) {

        return pattern.matcher(lastName).matches();
    }
}

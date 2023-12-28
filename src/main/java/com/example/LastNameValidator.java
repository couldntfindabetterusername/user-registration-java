package com.example;

import java.util.regex.Pattern;

public class LastNameValidator {
    private String regex = "^[A-Z][a-zA-Z]{2,}$";
    private Pattern pattern = Pattern.compile(regex);

    public boolean validate(String lastName) {

        return pattern.matcher(lastName).matches();
    }
}

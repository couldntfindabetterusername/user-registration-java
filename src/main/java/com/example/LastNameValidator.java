package com.example;

import java.util.regex.Pattern;

public class LastNameValidator {
    private String regex = "^[A-Z][a-zA-Z]{2,}$";
    private Pattern pattern = Pattern.compile(regex);

    public LastNameValidator() {
    }

    public boolean validate(String lastName) throws ValidationException {

        boolean isValid = pattern.matcher(lastName).matches();

        if (!isValid)
            throw new ValidationException(ValidationExceptionType.LastNameException, "Lastname is invalid");

        return isValid;
    }

}

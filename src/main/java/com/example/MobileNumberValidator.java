package com.example;

import java.util.regex.Pattern;

public class MobileNumberValidator {
    private String regex = "^\\d{2,3} \\d{10}$";
    private Pattern pattern = Pattern.compile(regex);

    public MobileNumberValidator() {
    }

    public boolean validate(String mobileNumber) throws ValidationException {
        boolean isValid = pattern.matcher(mobileNumber).matches();

        if (!isValid)
            throw new ValidationException(ValidationExceptionType.MobileNumberException, "Mobile number is invalid");

        return isValid;
    }
}

package com.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MobileNumberValidator {
    private String regex = "^\\d{2,3} \\d{10}$";
    private Pattern pattern = Pattern.compile(regex);

    public MobileNumberValidator() {}
    
    public boolean validate(String mobileNumber) {

        return pattern.matcher(mobileNumber).matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the mobile number: ");
        String mobileNumber = scanner.nextLine();

        MobileNumberValidator mobileNumberValidator = new MobileNumberValidator();
        mobileNumberValidator.validate(mobileNumber);

        if (mobileNumberValidator.validate(mobileNumber)) {
            System.out.println("Mobile number is valid");
        } else {
            System.out.println("Mobile number is not valid");
        }

        scanner.close();
    }
}

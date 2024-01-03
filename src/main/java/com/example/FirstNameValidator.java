package com.example;

import java.util.regex.Pattern;
import java.util.Scanner;

public class FirstNameValidator {
    private String regex = "^[A-Z][a-zA-Z]{2,}$";
    private Pattern pattern = Pattern.compile(regex);

    public FirstNameValidator() {}
    
    public boolean validate(String firstName) {

        return pattern.matcher(firstName).matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String firstName = scanner.nextLine();

        FirstNameValidator firstNameValidator = new FirstNameValidator();
        firstNameValidator.validate(firstName);

        if (firstNameValidator.validate(firstName)) {
            System.out.println("First name is valid");
        } else {
            System.out.println("First name is not valid");
        }

        scanner.close();
    }
}

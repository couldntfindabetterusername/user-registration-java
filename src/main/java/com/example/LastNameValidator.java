package com.example;

import java.util.regex.Pattern;
import java.util.Scanner;

public class LastNameValidator {
    private String regex = "^[A-Z][a-zA-Z]{2,}$";
    private Pattern pattern = Pattern.compile(regex);

    public LastNameValidator() {}
    
    public boolean validate(String lastName) {

        return pattern.matcher(lastName).matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the last name: ");
        String lastName = scanner.nextLine();

        LastNameValidator lastNameValidator = new LastNameValidator();
        lastNameValidator.validate(lastName);

        if (lastNameValidator.validate(lastName)) {
            System.out.println("Last name is valid");
        } else {
            System.out.println("Last name is not valid");
        }

        scanner.close();
    }
}

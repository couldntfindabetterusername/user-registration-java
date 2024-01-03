package com.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidator {
    private String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=[a-zA-Z0-9]*[@#$%^&+=!])(?!.*[@#$%^&+=!].*[@#$%^&+=!]).{8,}$";
    private Pattern pattern = Pattern.compile(regex);

    public PasswordValidator() {
    }

    public boolean validate(String password) {

        return pattern.matcher(password).matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the password: ");
        String password = scanner.nextLine();

        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.validate(password);

        if (passwordValidator.validate(password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password number is not valid");
        }

        scanner.close();
    }
}

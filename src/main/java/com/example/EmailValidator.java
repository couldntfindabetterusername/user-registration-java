package com.example;

import java.util.regex.Pattern;
import java.util.Scanner;

public class EmailValidator {
    private String regex = "^[a-zA-Z0-9]+([._%+-]+[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})*(\\.[a-zA-Z]{2,})$";
    private Pattern pattern = Pattern.compile(regex);

    public boolean validate(String lastName) {

        return pattern.matcher(lastName).matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the email: ");
        String email = scanner.nextLine();

        EmailValidator emailValidator = new EmailValidator();
        emailValidator.validate(email);

        if (emailValidator.validate(email)) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is not valid");
        }

        scanner.close();
    }
}

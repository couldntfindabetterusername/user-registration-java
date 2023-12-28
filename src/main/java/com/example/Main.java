package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------ User registration application ------");

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
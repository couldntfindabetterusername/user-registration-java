package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("------ User registration application ------");

        FirstNameValidator.main(args);
        LastNameValidator.main(args);
        EmailValidator.main(args);
        MobileNumberValidator.main(args);
    }
}
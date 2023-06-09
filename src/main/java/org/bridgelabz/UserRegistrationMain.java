package org.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        System.out.println("************ Welcome to User Registration!!! ************");
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println();
            System.out.println("1: Validate name.");
            System.out.println("2: Validate last name.");
            System.out.println("3: Validate E-mail.");
            System.out.println("4: Validate phone number.");
            System.out.println("5: Validate password rule 1.");
            System.out.println("6: Validate password rule 2.");
            System.out.println("7: Validate password rule 3.");
            System.out.println("8: Validate password rule 4.");
            System.out.println("9: Validate a simple Gmail address.");
            System.out.println("0: Exit.");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    UserRegistration.validateFirstName();
                    break;

                case 2:
                    UserRegistration.validateLastName();
                    break;

                case 3:
                    UserRegistration.validateEmail();
                    break;
                case 4:
                    UserRegistration.validateMobileNumber();
                    break;

                case 5:
                    UserRegistration.validatePasswordRule1();
                    break;

                case 6:
                    UserRegistration.validatePasswordRule2();
                    break;

                case 7:
                    UserRegistration.validatePasswordRule3();
                    break;

                case 8:
                    UserRegistration.validatePasswordRule4();
                    break;
                case 9:
                    UserRegistration.emailSamples();
                    break;

                default:
                    System.out.println("Enter valid input.");
            }
        } while (choice != 0);
    }
}
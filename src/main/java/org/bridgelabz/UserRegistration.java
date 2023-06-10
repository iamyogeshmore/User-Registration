package org.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);

    //validateFirstName method.
    public static void validateFirstName() {
        System.out.print("Enter first name: ");
        String fName = sc.next();
        String regex = "^[A-Z]{1}[a-z]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fName);
        boolean r = matcher.matches();
        if (r) System.out.println("It is a valid first name.");
        else System.out.println("It is invalid first name.");
    }

    //validateLastName method.
    public static void validateLastName() {
        System.out.print("Enter last name: ");
        String lName = sc.next();
        String regex1 = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(lName);
        boolean r = matcher1.matches();
        if (r) System.out.println("It is a valid last name.");
        else System.out.println("It is invalid last name.");
    }

    //validateEmail method.
    public static void validateEmail() {
        System.out.print("Enter your E-mail: ");
        String email = sc.next();
        String regex2 = "^[a-zA-Z0-9]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";
        // {1,}^[a-z]+[0-9]+[@]+gmail.com
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(email);
        boolean r = matcher2.matches();
        if (r) System.out.println("It is a valid E-mail.");
        else System.out.println("It is invalid E-mail.");
    }

    //validateMobileNumber method.
    public static void validateMobileNumber() {
        System.out.print("Enter your mobile number: ");
        String mobileNo = sc.next();
        String regex3 = "(91|0)?\\s?[6-9][0-9]{9}$";

        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(mobileNo);
        boolean r = matcher3.matches();
        if (r) System.out.println("It is a valid Mobile Number.");
        else System.out.println("It is invalid Mobile Number.");
    }

    //validatePasswordRule1 method.
    public static void validatePasswordRule1() {
        System.out.print("Enter your password: ");
        String password = sc.next();
        String regex = "^[A-Z a-z 0-9]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.find()) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }

    //validatePasswordRule2 method (Enter The Password At Least Eight Character One Upper Case).
    public static void validatePasswordRule2() {
        System.out.print("Enter The Password At Least Eight Character One Upper Case: ");
        String password2 = sc.nextLine();
        String regex2 = "^[A-Z]{1}+[a-z 0-9]{7,}$";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(password2);
        boolean r = matcher2.matches();
        if (r) System.out.println("It is a valid password.");
        else System.out.println("It is a invalid password.");
    }

    //validatePasswordRule3 method (Enter The Password At Least One Uppercase And One Numeric).
    public static void validatePasswordRule3() {
        System.out.print("Enter The Password At Least One Uppercase And One Numeric: ");
        String password3 = sc.nextLine();
        String regex3 = "^(?=.*[A-Z])(?=).+$";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(password3);
        boolean r = matcher3.matches();
        if (r) System.out.println("It is a valid password.");
        else System.out.println("It is a invalid password.");
    }

    //validatePasswordRule3 method (Enter The Password At Least One Uppercase & One Numeric & One Special Character).
    public static void validatePasswordRule4() {
        System.out.print("Enter The Password At Least One Uppercase & One Numeric & One Special Character: ");
        String password4 = sc.nextLine();
        String regex4 = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*?&]{5,}$";
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(password4);
        boolean r = matcher4.matches();
        if (r) System.out.println("It is a valid password.");
        else System.out.println("It is a invalid password.");
    }

    //validate Sample Email method.
    public static void emailSamples() {
        System.out.print("Enter the email :");
        String emailSample = sc.next();
        String regex = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailSample);
        boolean r = matcher.matches();
        if (r) System.out.println("Valid G-mail Address");
        else System.out.println("Invalid G-mail Address");
    }

    //Junit UC1: Take First Name And Check It Is Getting Matched With Regex/Regular
    public static boolean validateFirstName(String fname) throws UserRegistrationException {
        String regex = "^[A-Z]{1}[a-z]*";
        if (Pattern.matches(regex, fname) == true)
            return Pattern.matches(regex, fname);
        else {
            throw new UserRegistrationException("Send a proper First Name.");
        }
    }

    //Junit UC2: Take Last Name And Check It Is Getting Matched With Regex/Regular
    public static boolean validateLastName(String lName) throws UserRegistrationException {
        String regex1 = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex1);
        if (Pattern.matches(regex1, lName) == true)
            return Pattern.matches(regex1, lName);
        else {
            throw new UserRegistrationException("Send a proper Last Name.");
        }
    }
    //Junit UC3: Take Email And Check It Is Getting Matched With Regex/Regular

    public boolean validateEmail(String email) throws UserRegistrationException {
        String regex2 = "^[a-zA-Z0-9]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";
        // {1,}^[a-z]+[0-9]+[@]+gmail.com
        Pattern pattern = Pattern.compile(regex2);
        if (Pattern.matches(regex2, email) == true)
            return Pattern.matches(regex2, email);
        else {
            throw new UserRegistrationException("Send a proper Email");
        }
    }

    //Junit UC4: Take Mobile Number And Check It Is Getting Matched With Regex/Regular
    public boolean validateMobileNumber(String mobileNo) throws UserRegistrationException {
        String regex3 = "(91|0)?\\s?[6-9][0-9]{9}$";
        Pattern pattern3 = Pattern.compile(regex3);
        if (Pattern.matches(regex3, mobileNo) == true)
            return Pattern.matches(regex3, mobileNo);
        else {
            throw new UserRegistrationException("Send a proper Mobile Number");
        }
    }

    //Junit UC5: Take Password (Minimum 8 characters) And Check It Is Getting Matched With Regex/Regular
    public boolean validatePasswordRule1(String password) throws UserRegistrationException {
        String regex4 = "^[A-Z a-z 0-9]{8,}$";
        Pattern pattern4 = Pattern.compile(regex4);
        if (Pattern.matches(regex4, password) == true)
            return Pattern.matches(regex4, password);
        else {
            throw new UserRegistrationException("Enter password according to rule 1 " +
                    "(Minimum 8 characters)");
        }
    }

    /*Junit UC6: Take Password (Password At least Eight Character one Upper case) And
      Check It Is Getting Matched With Regex/Regular*/
    public boolean validatePasswordRule2(String password) throws UserRegistrationException {
        String regex5 = "^[A-Z]{1}+[a-z 0-9]{7,}$";
        Pattern pattern5 = Pattern.compile(regex5);
        if (Pattern.matches(regex5, password) == true)
            return Pattern.matches(regex5, password);
        else {
            throw new UserRegistrationException("Enter password according to rule 2 " +
                    "(Password At least Eight Character one Upper case)");
        }
    }

    /*Junit UC7: Take Password (Password At least one Upper case and one numeric) And
      Check It Is Getting Matched With Regex/Regular.*/
    public boolean validatePasswordRule3(String password) throws UserRegistrationException {
        String regex6 = "^(?=.*[A-Z])(?=).+$";
        Pattern pattern6 = Pattern.compile(regex6);
        if (Pattern.matches(regex6, password) == true)
            return Pattern.matches(regex6, password);
        else {
            throw new UserRegistrationException("Enter password according to rule 3 " +
                    "(Password At least one Upper case and one numeric)");
        }
    }

    /*Junit UC8: Take Password (Password At least One Upper Case & One Numeric & One Special Character) And
     Check It Is Getting Matched With Regex/Regular.*/
    public boolean validatePasswordRule4(String password) throws UserRegistrationException {
        String regex7 = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*?&]{5,}$";
        Pattern pattern7 = Pattern.compile(regex7);
        if (Pattern.matches(regex7, password) == true)
            return Pattern.matches(regex7, password);
        else {
            throw new UserRegistrationException("Enter password according to rule 4 " +
                    "(Password At least One Upper Case & One Numeric & One Special Character)");
        }
    }

    //Junit UC9: Take Email And Check It Is Getting Matched With Regex/Regular
    public boolean emailSamples(String emailSample) throws UserRegistrationException {
        String regex8 = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        Pattern pattern8 = Pattern.compile(regex8);
        if (Pattern.matches(regex8, emailSample) == true)
            return Pattern.matches(regex8, emailSample);
        else {
            throw new UserRegistrationException("Invalid Email format");
        }
    }
}
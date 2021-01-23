/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorials;

import java.util.Scanner;

/**
 *
 * @author Adebowale
 */
public class ValidateInputAssignment {

    public static boolean validateDateOfBirth(String dateOfBirth) {

        return dateOfBirth.matches("[0-9]\\d{2}-[A-Z]\\w{3}-[0-9]\\d{4}");

    }

    public static boolean validatephoneNumber(String phoneNumber) {

        return phoneNumber.matches("[0-9]\\d{4}-\\d{4}-\\d{4}");

    }

    public static boolean validateMaticNumber(String matricNumber) {

        return matricNumber.matches("[0-9]\\d{9}");

    }

    public static boolean validateEmailAddress(String emailAddress) {

        return emailAddress.matches("^(.+)@(.+)$");

    }

    public static boolean validateAddress(String address) {

        return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");

    }

    public static boolean validatebloodGroup(String bloodGroup) {

        return bloodGroup.matches("[A|B|AB|O][+|-]");

    }

    public static boolean validateGenotype(String genotype) {

        return genotype.matches("[AA|AO|BB|BO|OO|AB]");

    }

    public static void main(String[] argz) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Date of birth:");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Please enter phone number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please enter matric number:");
        String matricNumber = scanner.nextLine();
        System.out.println("Please enter email address:");
        String emailAddress = scanner.nextLine();
        System.out.println("Please enter address:");
        String address = scanner.nextLine();
        System.out.println("Please enter Blood group:");
        String bloodGroup = scanner.nextLine();
        System.out.println("Please enter genotype:");
        String genotype = scanner.nextLine();

        // validate user input and display error message
        System.out.println("\nValidate Result:");

        if (!validateDateOfBirth(dateOfBirth)) {
            System.out.println("Invalid date of birth");
        } else if (!validateAddress(address)) {
            System.out.println("Invalid address");
        } else if (!validateEmailAddress(emailAddress)) {
            System.out.println("Invalid email address");
        } else if (!validateGenotype(genotype)) {
            System.out.println("Invalid genotype");
        } else if (!validatebloodGroup(bloodGroup)) {
            System.out.println("Invalid blood group");
        } else if (!validateMaticNumber(matricNumber)) {
            System.out.println("Invalid matric Number");
        } else if (!validatephoneNumber(phoneNumber)) {
            System.out.println("Valid input. Thank you.");
        } else {
            System.out.println("Invalid phone number");
        }
    }
}

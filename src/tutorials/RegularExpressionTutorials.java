/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorials;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Adebowale
 */
public class RegularExpressionTutorials {
    
    
    
    
    public static void validateFirstName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your firstname:");
        String firstName = scanner.nextLine();
        
        boolean valid = firstName.matches("[a-zA-z]+([ '-][a-zA-Z]+)*");
        System.out.println("Firstname:"+firstName);
        System.out.println(valid);
        if(valid){
            System.out.println("Congratulations, welcome to the programming class");
        }else{
            System.out.println("Error, Invalid name");
        }
    }
    
    public static void validateDigits(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Input:");
        String input = scanner.nextLine();
        
        boolean valid = input.matches("[0-9]");
        System.out.println("Phone:"+input);
        System.out.println(valid);
        if(valid){
            System.out.println("Congratulations, welcome to the programming class");
        }else{
            System.out.println("Error, Invalid phone number");
        }
    }
    
    public static void validateDigits2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 digit Numbers:");
        String input = scanner.nextLine();
        
        boolean valid = input.matches("\\d{5}");
        System.out.println("Digits:"+input);
        System.out.println(valid);
        if(valid){
            System.out.println("Congratulations, welcome to the programming class");
        }else{
            System.out.println("Error, Invalid phone number");
        }
    }
    
     public static void validateNonDigitInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Non Digit Input:");
        String input = scanner.nextLine();
        
        boolean valid = input.matches("\\D{6}");
        System.out.println("Input:"+input);
        System.out.println(valid);
        if(valid){
            System.out.println("Congratulations, welcome to the programming class");
        }else{
            System.out.println("Error, Invalid Non Digit Value");
        }
    }
     
     public static void validateWordCharacters(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word characters:");
        String input = scanner.nextLine();
        
        boolean valid = input.matches("\\w{7}");
        System.out.println("Input:"+input);
        System.out.println(valid);
        if(valid){
            System.out.println("Congratulations, welcome to the programming class");
        }else{
            System.out.println("Error, Invalid word characters");
        }
    }
     
     public static void validateAddress(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Address:");
        String input = scanner.nextLine();
        
        boolean valid = input.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+\\s[a-zA-Z]+)\\s[a-zA-Z]+");
        System.out.println("Input:"+input);
        System.out.println(valid);
        if(valid){
            System.out.println("Congratulations, welcome to the programming class");
        }else{
            System.out.println("Error, Invalid address");
        }
    }
     
     public static void validateCity(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Address:");
        String input = scanner.nextLine();
        
        boolean valid = input.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+\\s[a-zA-Z]+)\\s[a-zA-Z]+");
        System.out.println("Input:"+input);
        System.out.println(valid);
        if(valid){
            System.out.println("Congratulations, welcome to the programming class");
        }else{
            System.out.println("Error, Invalid address");
        }
    }
     
     public static void validateInputName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Address:");
        String input = scanner.nextLine();
        
        boolean valid = input.matches("[a-zA-Z]+");
        System.out.println("Input:"+input);
        System.out.println(valid);
        if(valid){
            System.out.println("Congratulations, welcome to the programming class");
        }else{
            System.out.println("Error, Invalid name");
        }
    }
     
     public static void validateNames(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String input = scanner.nextLine();
        
        boolean valid = input.matches("[a-zA-Z0-9]+\\s[a-zA-Z]+");
        System.out.println("Input:"+input);
        System.out.println(valid);
        if(valid){
            System.out.println("Congratulations, welcome to the programming class");
        }else{
            System.out.println("Error, Invalid name");
        }
    }
     
     public static void patternMatching(){
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the search crteria:");
        String input = scanner.nextLine();
         Pattern pattern = Pattern.compile(input,Pattern.CASE_INSENSITIVE);
         
         Matcher matcher = pattern.matcher("Welcom to university of Lagos, the only university by lagoon");
         
         if(matcher.find()){
             
             System.out.println(input +" Found ");
         }else{
             System.out.println(input +" Not Found");
         }
     }
    
    
    public static void main(String[] args){
        patternMatching();
    }
}

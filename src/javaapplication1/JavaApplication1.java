/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Adebowale
 */
public class JavaApplication1 {

    private static final String email = "abey@gmail.com";
    private static int score = 25;

    /**
     * @param args the command line arguments
     */

    public static void forOperaton() {
        List<Person> persons = new ArrayList<>();

        for (Person person1 : persons) {
            System.out.println("Person:" + person1.getPhoneNumber());
        }
    }

    public static void doWhileOperation() {
        do {
            System.out.println("Congratulation, you have scored grade A:");
            break;
        } while (score < 70);
    }

    public static void whileOperation() {

        while (score > 70) {
            System.out.println("Congratulation, you have scored grade A:");
            break;
        }

    }

    public static void incrementOperation() {
        int counter = 0;
        int total = 0;

        while (counter < 20) {
            total = total += counter;
            System.out.println("Total:" + total);
            counter++;

        }
    }

    public static void continueOperation() {
        for (int i = 0; i < 10; ++i) {
            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }
    }
    
    public static void ifesleOperation(){
        int a = 20;
        int b = 50;
        if(a == b){
            System.out.println("A is equal to B");
        }else {
            System.out.println("A and  B are not equal");
        }
    }
    
    public static void nestedIfesleOperation(){
        int a = 20;
        int b = 50;
        if(a == b){
            System.out.println("A is equal to B");
        }else if(a > b){
            System.out.println("A is greater than  B");
        }else if(a < b){
            System.out.println("A is less than B");
        }
        
    }
    
    public static void switchCaseOperation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Score >>>");
        int score = scanner.nextInt();
        
        score = score/10;
        switch(score){
            case 10:
            case 9:
            case 8:
            case 7:
                System.out.println("Dinstiction student");
                break;
            case 6:
                System.out.println("Good student");
                break;
            case 5:
                System.out.println("Average Student");
                break;
            case 4:
                System.out.println("Dull student");
                break;
            case 3:
                System.out.println("Failed student");
                break;
            default:
                System.out.println("Advice to withdraw");
        }
    }

    public static void integerOperation(){
      Integer integer = new Integer(16);
      double doubleValue = integer.doubleValue();
      System.out.println("DoubleValue:"+doubleValue);
      int compareValue = integer.compareTo(16);
      System.out.println("CompareValue:"+compareValue);
      float floatValue = integer.floatValue();
      System.out.println("FloatValue:"+floatValue);
      int intValue = integer.intValue();
      System.out.println("IntValue:"+intValue);
      long longValue = integer.longValue();
      System.out.println("LongValue:"+longValue);
    }
    
    public static void doubleOperation(){
      Double double2 = new Double(23.01672526277);
      double doubleValue = double2.doubleValue();
      System.out.println("DoubleValue:"+doubleValue);
      int compareValue = double2.compareTo(16.7865);
      System.out.println("CompareValue:"+compareValue);
      float floatValue = double2.floatValue();
      System.out.println("FloatValue:"+floatValue);
      int intValue = double2.intValue();
      System.out.println("IntValue:"+intValue);
      long longValue = double2.longValue();
      System.out.println("LongValue:"+longValue);
      
      double ab = 34.7865;
      int ab1 = (int)ab;
    }
    
    public static void charOperation(){
        char ch = 'a';
        
        char[] chArray = {'a','b','c','d'};
        
        Character.valueOf(ch);
        Character caCharacter = new Character(ch);
        caCharacter.charValue();
        caCharacter.compareTo('b');
        
        
        
    }
    public static void helloOperation(){
        
        System.out.println("She said \"Hello!\" to me.");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Person person = new Person();
        person.setEmail(email);
        score += 55;
        System.out.println("Score:" + score);
        
        //doubleOperation();
        helloOperation();
        
        String str1 = new String();
        String str2 = new String("abbey");
        
        

    }

}

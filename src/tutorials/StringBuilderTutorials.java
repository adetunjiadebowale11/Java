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
public class StringBuilderTutorials {

    public static void stringBuilderConstructor() {

        StringBuilder builder1 = new StringBuilder("Welcome To Lagos");

        StringBuilder builder = new StringBuilder();

        builder.append("Firstname:").
                append("Debo")
                .append("\n")
                .append("Lastname:")
                .append("Adetunji")
                .append("\n")
                .append("Email:")
                .append("debo4real@gmail.com")
                .append("\n")
                .append("PhoneNumber:")
                .append("09039287865");

        System.out.println(builder.toString());
    }

    public static void stringBuilderInsertionAndDeletion() {
        StringBuilder builder = new StringBuilder();

        Object objectRef = "hello";
        String string = "goodbye";
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'K';
        int integerValue = 7;
        long longValue = 10000000;
        float floatValue = 2.5f; // f suffix indicates that 2.5 is a float
        double doubleValue = 33.333;
        String message = " welcome ";

        StringBuilder buffer = new StringBuilder();

        buffer.insert(0, objectRef);
        buffer.insert(0, " "); // each of these contains two spaces
        buffer.insert(0, string);;

        buffer.insert(0, " ");
        buffer.insert(0, charArray);
        buffer.insert(0, " ");
        buffer.insert(0, charArray, 3, 3);
        buffer.insert(0, " ");
        buffer.insert(0, booleanValue);
        buffer.insert(0, " ");
        buffer.insert(0, characterValue);
        buffer.insert(0, " ");
        buffer.insert(0, integerValue);
        buffer.insert(0, " ");
        buffer.insert(0, longValue);
        buffer.insert(0, " ");
        buffer.insert(0, floatValue);
        buffer.insert(0, " ");
        buffer.insert(0, doubleValue);

        System.out.printf(
                "buffer after inserts:\n%s\n\n", buffer.toString());

        buffer.deleteCharAt(10); // delete 5 in 2.5
        buffer.delete(2, 6); // delete .333 in 33.333
        buffer.insert(48, message);
        System.out.printf(
                "buffer after deletes:\n%s\n", buffer.toString());
        System.out.println("Size:"+buffer.length());
    }
    
    public static void tokenizeString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence and press enter:");
        String sentence = scanner.nextLine();
        String[] tokens = sentence.split("@");
        for(String token:tokens){
            System.out.println(token);
        }
    }

    public static void main(String[] args) {

        tokenizeString();
    }
}

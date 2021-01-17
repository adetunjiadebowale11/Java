/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorials;

/**
 *
 * @author Adebowale
 */
public class StringTutorials {

    public static void stringConstructors() {

        //STRING CONTRUCTORS
        String s1 = new String("debo");

        char[] charArray = {'u', 'n', 'i', 'v', 'e', 'r', 's', 'i', 't', 'y'};

        String s = new String("Hello, welcome to string class");

        char[] msgArray = new char[29];

        int length = s.length();
        char c20 = s.charAt(20);
        s.getChars(0, 29, msgArray, 0);

        for (char characters : msgArray) {
            System.out.print(characters);
        }

        System.out.println();

        System.out.printf("CharAtPosition20=%s\n", c20);
        System.out.printf("Length=%s\n", length);
        String s2 = new String(s);

        String s3 = new String(charArray);

        String s4 = new String(charArray, 6, 3);

        System.out.printf("s1=%s\ns2=%s\ns3=%s\ns4=%s\n", s1, s2, s3, s4);
    }

    public static void stringCompare() {

        String str1 = new String("Lagos");
        String str2 = new String("lagos");

        int result = str1.compareTo(str2);
        if (str1.compareToIgnoreCase(str2) == 0) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
    }

    public static void equalCase() {
        String str1 = new String("Lagos");
        String str2 = new String("lagos");

        boolean result = str1.equals(str2);
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
    }

    public static void startWith() {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (String month : months) {
            if (month.startsWith("J")) {
                System.out.println(month);
            }

        }
    }

    public static void endWith() {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (String month : months) {
            if (month.endsWith("er")) {
                System.out.println(month);
            }

        }
    }

    public static void stringIndexOf() {
        String jan = "January";

        int index = jan.indexOf("a", 2);

        System.out.println(index);
    }

    public static void stringLastIndexOf() {
        String jan = "Januarya";

        int index = jan.lastIndexOf("a");

        System.out.println(index);
    }

    public static void extractingSubstringsFromStrings() {
        String message = "Welcome to Master In Information Technology, University of Lagos";

        message = message.substring(11);

        System.out.println(message);
    }

    public static void concatenatingString() {
        String s1 = "Happy ";
        String s2 = "Birthday";

        String s3 = s1.concat(s2);

        System.out.println(s3);
    }

    public static void stringValueOf() {
        int amount = 50000;

        String stringValue = String.valueOf(amount);

        System.out.println(stringValue);
    }

    public static void main(String[] args) {
        stringLastIndexOf();
        stringValueOf();

    }
}

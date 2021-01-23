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
public class StringDeitelPractice {
    
    
        public static void StringConstructors(){
            
        
        char[] charArray = {'b','i','r','t','h',' ', 'd','a','y'};
        String s = new String("hello");
        
        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(charArray);
        String s4 = new String(charArray,6,3);
        
        
        System.out.printf("s1=%s\ns2=%s\ns3=%s\ns4=%s\n",s1,s2,s3,s4);
    
}
        public static void StringMiscellineous(){   //length, charAt, getChar
            
            String s1 = "Adebowale";
            char[] charArray = new char[5];
            System.out.printf("The length of String s1 is %d\n",s1.length());
            
            System.out.println("Reverse print of s1 ");
            for(int i=s1.length()-1;i>=0;i--)
                System.out.printf("%c",s1.charAt(i));
            System.out.println();
            
            System.out.println("Copy String to char array");
            
            s1.getChars(0, 5, charArray, 0);
            
            for(char ch:charArray)
                System.out.print(ch);
            
            System.out.println();
        }
        
        public static void StringCompare(){
            
            String s1= new String("hello");
            String s2 = "happy birthday";
            String s3 = "HAPPY BIRTHDAY";
            String s4 = "goodbye";
            
            //test for equality
            if(s1.equals("hello")){
                System.out.println("s1 equals \"hello\"");
            }
            else {
                System.out.println("s1 is not equal to \"hello\"");
            }
            
            if(s1=="hello"){
                System.out.println("s1 is the same object as \"hello\"");
            }
            else {
                System.out.println("s1 is not the same object as \"hello\"");
            }
            if (s2.equalsIgnoreCase(s3)){
                System.out.println("s2 equals s3");
            }
            else {
                System.out.println("s2 is not equals to s3");
            }
            
            if(s2.regionMatches(0, s3, 0, 5)){
                System.out.println("The first five characters in the string s2 and s3 match");
            }
            else {
                System.out.println("They do not match!");
            }
             if(s2.regionMatches(true,0, s3, 0, 5)){
                System.out.println("The first five characters in the string s2 and s3 match");
            }
            else {
                System.out.println("They do not match!");
            }
        }
        
        public static void StringIndexMethod(){
            
            String s1= "Adebowale Adetunji";
            
            System.out.printf("Index of a in string s1 is %d\n",s1.indexOf('a',7));
            System.out.printf("Last index of e in string s1 is %d\n",s1.lastIndexOf('e'));
            
        }
        
        public static void SubString(){
            
            String s1= "Adebowale Adetunji";
            
            System.out.printf("Substring of index 15 to the end is %s\n",s1.substring(15));
            System.out.printf("Substring of index 3 to 6 is %s\n",s1.substring(3,6));
            
        }
        
          public static void StringConcantenation(){
            
            String s1= "Adebowale ";
            String s2= "Adetunji";
            
            System.out.printf("s1 and s2 concantenated gives %s\n",s1.concat(s2));
            
            
        }
          
            public static void StringMiscelleneous(){ //replace,toUpperCase,toLowerCase,toCharArray
            
            String s1= "Adebowale ";
            String s2= "Adetunji";
            String s3= "  emman ";
            
            System.out.printf("To replace a with A in s1 gives %s",s1.replace('a', 'A'));
            System.out.printf("s1 to upperCase gives %s\n",s1.toUpperCase());
            System.out.printf("s1 to lowercase gives %s\n",s1.toLowerCase());
            System.out.printf("s3 trimmed gives \"%s\"\n", s3.trim());
            
            
            }
            
            public static void StringBulder(){
                
                StringBuilder buffer = new StringBuilder( "Hello Adebowale, how are you?" );

                System.out.printf( "buffer = %s\nlength = %d\ncapacity = %d\n\n",
                buffer.toString(),buffer.length(),buffer.capacity());
                
                buffer.ensureCapacity(100);
                System.out.printf( "New capacity = %d\n\n",buffer.capacity() );

                System.out.printf( "New length = %d\nbuffer = %s\n",buffer.length(), buffer.toString() );
                } // end main} // end class StringBuilderCapLen
            
            public static void StringBuilderChar(){
                
                StringBuilder buffer = new StringBuilder("Adebowale Adetunji");
                
                //charAt()
                
                System.out.printf("buffer is = %s",buffer.toString());
                System.out.printf("\nCharAt(10) and CharAt(15) is %c and %c\n",buffer.charAt(10),buffer.charAt(15));
                
                //getChars()
                
                char[] newCharArray = new char[buffer.length()];
                
                buffer.getChars(0, buffer.length(), newCharArray, 0);
                
                for(char character: newCharArray)
                    System.out.print(character);
                
                //setCharAt()
                buffer.setCharAt(2, 'E');
                buffer.setCharAt(8, 'E');
                
                System.out.printf("\nbuffer is %s",buffer.toString());
                
                //reverse()
                
                buffer.reverse();
                System.out.printf("\nbuffer reversed is %s",buffer.toString());
                
                buffer.append(" Emmanuel");
                
                System.out.printf("\nbuffer is %s",buffer.toString());
                
                
                
                
            }
public static void main(String[] argz){
        
   // StringConstructors();
   
   // StringMiscellineous();
   //StringCompare();
   //StringIndexMethod();
   //SubString();
   //StringConcantenation();
   //StringMiscelleneous();
   //StringBulder();
     StringBuilderChar();
    }
}  

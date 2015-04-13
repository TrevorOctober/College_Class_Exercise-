
package palindrome;

import java.util.Scanner;

public class Palindrome {

   
    public static void main(String[] args) {
     Scanner kb=new Scanner(System.in);
     
     System.out.println("Please enter the word to determine if its a palindrome...");
     String word =kb.next();
     
     if (Palindrome (word)==true)
         System.out.println("its a palindrome");
     else 
         System.out.println("Not a palindrome");
    }
    public static boolean Palindrome (String original){
        String reverse ="";
        
        for (int i=original.length()-1; i>=0;i--)
            
          reverse= (reverse+original.charAt(i));
        
        if (original.equalsIgnoreCase(reverse))
            return true;
        else  
            return false;
        
        
    }
}

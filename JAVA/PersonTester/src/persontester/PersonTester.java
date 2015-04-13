/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persontester;
import java.util.Scanner;
/**
 *
 * @author TREVOR
 */
public class PersonTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner kb=new Scanner (System.in);
         String name,surname;
         int age;
         
         System.out.println("Please enter name");
         name=kb.next();
         
        System.out.println("Please enter surname");
        surname=kb.next();
        
        System.out.println("Please enter age");
        age=kb.nextInt();
        
        person person1=new person(name,surname,age);
        person1.display();
        
    }
}

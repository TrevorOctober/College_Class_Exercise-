/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salary;
import java.util.*;
/**
 *
 * @author Trevor October
 */
public class Salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner trevor=new Scanner(System.in);
        double salary;
        double rate,hours;
        rate=trevor.nextDouble();
        hours=trevor.nextDouble();
       
        salary=rate*hours;
        System.out.println("Your salary is  R"+salary);
    }
}

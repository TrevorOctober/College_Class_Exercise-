/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salariedemployee;
import java.util.*;
/** 
 *
 * @author TREVOR
 */
public class SalariedEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     EmployeeSalaryAndDetails employee=new EmployeeSalaryAndDetails();
     Scanner kb=new Scanner(System.in);
     String name;
     double rate;
     double hours;
     
     System.out.println("Please enter your name");
     name=kb.next();
     System.out.println("Enter your rate per hour");
     rate=kb.nextDouble();
     System.out.println("Enter hours worked");
     hours=kb.nextDouble();
     
     System.out.printf(" ",employee.getClass());
    }
}

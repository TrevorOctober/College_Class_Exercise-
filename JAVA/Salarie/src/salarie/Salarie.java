/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salarie;
import java.util.*;
/**
 *
 * @author TREVOR
 */
public class Salarie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner kb =new Scanner(System.in);
     System.out.println("Please enter hourly pay rate");
     double HourlyPayRate=kb.nextDouble();
     
     System.out.println("Please enter regular hours");
    double RegularHours=kb.nextDouble();
     
     System.out.println("Please enter overtime hours");
     double Overtime=kb.nextDouble();
     
     double salary=ovatime(HourlyPayRate,RegularHours,Overtime);
     System.out.println("Your weekly salary is R"+salary);  
    }
    public static double ovatime(double HourlyPayRate,double RegularHours,double Overtime){
       
        return (HourlyPayRate * RegularHours)+(Overtime *1.5);
    }
}

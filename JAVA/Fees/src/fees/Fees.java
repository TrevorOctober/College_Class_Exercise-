/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fees;

/**
 *
 * @author Trevor October
 */
public class Fees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double StudentsTotalFees;
        double CreditPerHour=85;
        double Books=5000;
        double AthleticFee=65;
        
        StudentsTotalFees=CreditPerHour+Books+AthleticFee;
        System.out.println("The student's total fees is: R"+StudentsTotalFees);
          
    }
}

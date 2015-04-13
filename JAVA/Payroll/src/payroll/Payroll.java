/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author Trevor October
 */
public class Payroll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double Hours=8;
        double Rate=14;
        double GrossPay;
        double Tax;
        double NetPay;        
        
        GrossPay=Hours*Rate;
                
        Tax=GrossPay*15/100;
       
        NetPay=GrossPay-Tax;
        
        System.out.println("Hourly Rate of Pay:      R"+Rate);
        System.out.println("Number of Hours Worked:   "+Hours);
        System.out.println("You worked "+Hours+" hours at the rate of R"+Rate+ "per Hour.");
        System.out.println("Gross Pay:               R"+GrossPay);
        System.out.println("Tax:                     R"+Tax);
        System.out.println("Net pay:                 R"+NetPay);
        
    }
}


package investment;
import java.util.*;


public class Investment {

    final static double invester=0.05;
    
    public static void main(String[] args) {
     Scanner kb=new Scanner(System.in);
     System.out.println("Plz enter the amount you wld lyk to invest");
     double amount=kb.nextDouble();
     
     double interest=CalcInterest(amount);
     System.out.println("your interest is R"+interest);
     System.out.println("your amount is R"+(amount +interest));
    }
    public static double CalcInterest (double amount){
        
        return (amount * invester );
        
    }
}

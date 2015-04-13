/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofarray;

import java.util.Scanner;

/**
 *
 * @author NTU2KO
 */
public class SumOfArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner key = new Scanner(System.in);
        try{
        int Arr [] = {1,2,3,4,5};
       System.out.println( arraySum(Arr));
       System.out.println( "Average is "+arraySum(Arr)/5);
        }
       catch (ArrayIndexOutOfBoundsException ex){
       System.out.println("Oops, array index does not exist");
       
       }
       catch (ArithmeticException ex){
       System.out.println("Something wrong with formula you gave");
       
       }
       finally{
        System.out.println("DONE!!!!");
        }
        
    }
    
    public static int arraySum(int A[]){
    int sum = 0;
    for (int i=0;i<A.length;i++){
        
    sum = sum + A[i];
    }
    
    return sum;
    }
    
    
    
}


import java.util.Scanner;


public class Tutorial{
    
    public static void main(String args []){
        
        Scanner scn=new Scanner(System.in);
        
        
        int x=1;
        
        do{
        try{
        int num1,num2;
        
        System.out.println("Enter first Number");
        num1=scn.nextInt();
        System.out.println("Enter second number");
        num2=scn.nextInt();
        int sum=num1/num2;
      
        System.out.println("Sum: "+sum);
        x=2;
        
    }catch(Exception e){
    System.out.println("You cant do that");
    }
     }while(x==1);
        
   
}
   
}

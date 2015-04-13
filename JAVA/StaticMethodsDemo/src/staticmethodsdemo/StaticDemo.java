/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package staticmethodsdemo;

/**
 *
 * @author NTU2KO
 */
public class StaticDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //System.out.println(Max (-5,-1));
        
       int ArrA[] = {2,4,6};
        int ArrB[] = {1,2,3};
        
        swap(ArrA,ArrB);
        
       
        
    //System.out.println(DiceRoll());
    
    }
    
   public static double Max(double x, double y){
        double max;
        
        if (x > y)
            max = x;
        else
            max =y;
   
   return max;
   
   } 
   
   public static int DiceRoll(){
   
       return (int)(Math.random() *6)+1;
   }
   
   
   
   public static void swap(int A[], int B[]){
   
       int temp[] = new int [B.length];
       
       for(int i =0; i<A.length; i++){
           
       temp[i] = A[i];
       A[i] = B[i];
       B[i] = temp[i];
       
       }
       
       System.out.println("A: ");
       for(int i=0; i<A.length;i++)
           System.out.print(A[i]+" ");
       
        System.out.println("\nB: ");
       for(int i=0; i<B.length;i++)
           System.out.print(B[i]+" ");
   
   }
   
   
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swap.arrayz;


public class SwapArrayz {

    
    public static void main(String[] args) {
        
    int arrayA []= {1991,1992,1993};
    int arrayB []= {1994,1995,1996};
    Swap(arrayA,arrayB);    
    }
public static void Swap(int a [], int b []){
          
         
        int temp []=new int[b.length];
        for(int i= 0; i<a.length;i++){
        temp [i] =a [i];
        a [i]=b[i];
        b [i]=temp [i];
    }
        System.out.print("A : ");
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
        
        System.out.print("\nB : ");
        for(int i=0;i<b.length;i++)
        System.out.print(b[i]+" ");
}

    
}
            
        
        
    
    
    
    

  
    


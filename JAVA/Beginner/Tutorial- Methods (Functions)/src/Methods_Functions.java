
public class Methods_Functions{
    
public static void main(String[]args){
    
  //print("CornVirgo");
  
  /*int ans=add(15,3);
  print("Your answer is " +ans);*/
  
  swapp();
  
 
}   
static void print(String cv){
 
    System.out.println(cv);
}
static int add(int a,int b){
    
 int c= a * b;
 return c;
}
//Swapping numbers 

static void swapp(){
    
 int x=10;
 int y=20;
 
 System.out.println("B4 Swapp");
 System.out.println("Int X: "+x);
 System.out.println("Int y: "+y);
 
 int temp=x;
 
 x=y;
 y=temp;
 
 System.out.println("After Swapp");
 System.out.println("Int X: "+x);
 System.out.println("Int y: "+y);
}
}
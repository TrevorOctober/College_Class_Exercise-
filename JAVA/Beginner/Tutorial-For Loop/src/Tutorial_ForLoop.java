
public class Tutorial_ForLoop{
    
 public static void main(String[]args){
 
   String [] Prog_Languages=new String[5];
   
   Prog_Languages [0]="Java";
   Prog_Languages [1]="C#";
   Prog_Languages [2]="VB.net";
   Prog_Languages [3]="C++";
   Prog_Languages [4]="C";
   
   for(String languages:Prog_Languages){
     System.out.println(languages);   
   }
       
   
     /*for (int i = 0; i <Prog_Languages.length; i++) {
      System.out.println(Prog_Languages[i]);   
     }*/
 }   
}
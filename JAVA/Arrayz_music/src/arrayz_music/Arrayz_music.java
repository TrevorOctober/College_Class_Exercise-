/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayz_music;

/**
 *
 * @author TREVOR
 */
public class Arrayz_music {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      //String music []=new String [4];
     // music [0]="House music";
      //music [1]="Deep House";
     // music [2]="Soulful House";
      //music [3]="Afro House";
      
      
     // for(int i=0;i<4; i++)
     // System.out.println(music[i]);
      
        char starz [][]=new char[7][4];
        
        starz[0][0]='*';
        starz[0][1]=' ';
        starz[0][2]=' ';
        starz[0][3]=' ';
         
        starz[1][0]='*';
        starz[1][1]='*';
        starz[1][2]=' ';
        starz[1][3]=' '; 
        
        starz[2][0]='*';
        starz[2][1]='*';
        starz[2][2]='*';
        starz[2][3]=' ';
        
        starz[3][0]='*';
        starz[3][1]='*';
        starz[3][2]='*';
        starz[3][3]='*';
        
        starz[4][0]='*';
        starz[4][1]='*';
        starz[4][2]='*';
        starz[4][3]=' ';
        
        starz[5][0]='*';
        starz[5][1]='*';
        starz[5][2]=' ';
        starz[5][3]=' ';
        
        starz[6][0]='*';
        starz[6][1]=' ';
        starz[6][2]=' ';
        starz[6][3]=' ';
        
        
     
       
      for(int rows=0;rows<7;rows++){
          
      for(int cols=0;cols<4;cols++){
          
          
       System.out.print(starz[rows][cols]+" ");
          
    }
   System.out.println(); 
}

    }
    
}

   

    

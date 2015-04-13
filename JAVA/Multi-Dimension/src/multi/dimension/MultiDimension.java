/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multi.dimension;

/**
 *
 * @author Trevor October
 */
public class MultiDimension {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][]numbers=new int[6][5];
        numbers[0][0]=10;
        numbers[0][1]=20;
        numbers[0][2]=30;
        numbers[0][3]=40;
        numbers[0][4]=50;
        
        numbers[1][0]=60;
        numbers[1][1]=70;
        numbers[1][2]=80;
        numbers[1][3]=90;
        numbers[1][4]=100;
       
        numbers[2][0]=110;
        numbers[2][1]=120;
        numbers[2][2]=130;
        numbers[2][3]=140;
        numbers[2][4]=150;
        
        numbers[3][0]=160;
        numbers[3][1]=170;
        numbers[3][2]=180;
        numbers[3][3]=190;
        numbers[3][4]=200;
       
        numbers[4][0]=210;
        numbers[4][1]=220;
        numbers[4][2]=240;   
        numbers[4][3]=240;
        numbers[4][4]=250;
        
        numbers[5][0]=260;
        numbers[5][1]=270;
        numbers[5][2]=280;
        numbers[5][3]=290;
        numbers[5][4]=300;
          
     //  int rows=6;
     //  int colums=5;
       int i=0;
       int j=0; 
       
       for( i=0;i<6;i++){
       for( j=0;j<5;j++){
          
          
       System.out.print(numbers[i][j]+" ");

       } 
       System.out.println();
       }
       
    }
}

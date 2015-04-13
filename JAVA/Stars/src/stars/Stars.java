/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stars;

/**
 *
 * @author Trevor October
 */
public class Stars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char [][] stars=new char[3][5];
        stars [0][0]=' ';
        stars [0][1]=' ';
        stars [0][2]='*';
        stars [0][3]=' ';
        stars [0][4]=' ';
        
        stars [1][0]=' ';
        stars [1][1]='*';
        stars [1][2]='*';
        stars [1][3]='*';
        stars [1][4]=' ';
     
        stars [2][0]='*';
        stars [2][1]='*';
        stars [2][2]='*';
        stars [2][3]='*';
        stars [2][4]='*';
     
        int ntuthuko,trevor;
        for(ntuthuko=0;ntuthuko<3;ntuthuko ++){
        for(trevor=0;trevor<5;trevor ++){   
     
        System.out.print(stars[ntuthuko][trevor]+" ");    
             
        } 
        System.out.println();
        }
    }
}

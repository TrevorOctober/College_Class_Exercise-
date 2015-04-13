/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multidimension.strings;

/**
 *
 * @author Trevor October
 */
public class MultiDimensionStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [][] TopThirtyDJs  =new String[6][5];
        
        TopThirtyDJs [0][0]="Culoe";
        TopThirtyDJs [0][1]="Rocco";
        TopThirtyDJs [0][2]="Vinny";
        TopThirtyDJs [0][3]="Kojo";
        TopThirtyDJs [0][4]="Bonnie";
        
        TopThirtyDJs [1][0]="Manoo";
        TopThirtyDJs [1][1]="Rob Hages";
        TopThirtyDJs [1][2]="Dolls Combers";
        TopThirtyDJs [1][3]="Andy Compton";
        TopThirtyDJs [1][4]="Stimming";
        
        TopThirtyDJs [2][0]="Timmy Reg";
        TopThirtyDJs [2][1]="Zulu Mafia";
        TopThirtyDJs [2][2]="Real People";
        TopThirtyDJs [2][3]="Layabouts";
        TopThirtyDJs [2][4]="Key Snow";
        
        TopThirtyDJs [3][0]="QB";
        TopThirtyDJs [3][1]="AtJazz";
        TopThirtyDJs [3][2]="Chymusique";
        TopThirtyDJs [3][3]="Boddhi Satva";
        TopThirtyDJs [3][4]="DA Capo";
        
        TopThirtyDJs [4][0]="Real Soul";
        TopThirtyDJs [4][1]="Deep Soul";
        TopThirtyDJs [4][2]="Robert Owens";
        TopThirtyDJs [4][3]="Detroit Swindle";
        TopThirtyDJs [4][4]="Distant People";
        
        TopThirtyDJs [5][0]="Roland Clark";
        TopThirtyDJs [5][1]="Mindlo";
        TopThirtyDJs [5][2]="Black Coffee";
        TopThirtyDJs [5][3]="Sai Ribatones";
        TopThirtyDJs [5][4]="Ralf gum";
        
        
        int i=0;
        int j=0;
        
        for(i=0;i<6;i++){
        for(j=0;j<5;j++){
        System.out.print( TopThirtyDJs[i][j]+" ");    
           
        }
        System.out.println();
        }   
    }
}

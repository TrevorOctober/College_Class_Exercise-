
public class Tutorial_Arrays{
    
    public static void main(String [] args){
    /* //Single array
        String [] names={"Trevor","Pearl","Ntu2ko","Nomusa","CornVirgo"};
        /*names [0]="Trevor";
        names [1]="Pearl";
        names [2]="Ntu2ko";
        names [3]="Nomusa";
        names [4]="CornVirgo";*/
        
        //System.out.println(names[4]);
       /* for (int i = 0; i <names.length; i++) {
        System.out.println(names[i]);    
        }*/
        DoubleArray();
    }
    static void DoubleArray(){
     String names [][]=new String[2][2];
     names [0][0]="Trevor";
     names [0][1]="Pearl";
     names [1][0]="Ntuthuko";
     names [1] [1]="Nomusa";
     int r=0;
     int c=0;
      
     for(r=0;r<names.length;r++){
         
     for(c=0;c<names.length; c++){
             
      System.out.print(names[r][c]+" "); 
      
     }
          System.out.println();
     }   
      }   
    
    } 

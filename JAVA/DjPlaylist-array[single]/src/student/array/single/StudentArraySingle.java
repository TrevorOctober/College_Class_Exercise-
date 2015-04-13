/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package student.array.single;


/**
 *
 * @author Trevor October
 */
public class StudentArraySingle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String[] DjPlaylist =new String [10];
      DjPlaylist[0]="Peter James Kahn – Could You Be [Sofitone Recordings]";
      DjPlaylist[1]="DJ Roland Clark pres. Urban Soul – My Urban Soul [Street King]";
      DjPlaylist[2]="Robbert Mendez & Leo Caetano – Deepanema [Panama Red Records]";
      DjPlaylist[3]="Jerk House Connection – New York Style [Nightbird Music]";
      DjPlaylist[4]="Sage – Naked On Da DanceFloor [Mantree]";  
      DjPlaylist[5]="Profound Nation – Midnight [FOMP]"; 
      DjPlaylist[6]="Mark Light – Fire Up [To Be Records]"; 
      DjPlaylist[7]="Rob Hayes – The Chant [Solar Sounds]"; 
      DjPlaylist[8]="RedDeep – Your Vision [RealD Records]"; 
      DjPlaylist[9]="DJ Tumza – You Are [RealD Records]"; 
       
      
      System.out.println("DJ Playlist");
      System.out.println("__________");
      
      
      int i=0;
      while(i<10){
           
        System.out.println(DjPlaylist[i]);
       i++;
       }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dj.vs.producer;

/**
 *
 * @author TREVOR
 */
public class DJ {
  private String DjName;
  private String MixTape;

    public DJ(String DjName, String MixTape) {
        this.DjName = DjName;
        this.MixTape = MixTape;
    }
 
  public DJ (){
   DjName="Menzinto";
   MixTape="October Mix";
   
  }

    public String getMixTape() {
        return MixTape;
    }

    public String getDjName() {
        return DjName;
   
    }
      public void Display(){  
        System.out.println(getDjName()+" "+getMixTape());  
         
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package area.circle;
import java.util.*;

/**
 *
 * @author Trevor October
 */
public class AreaCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keybrd=new Scanner(System.in);
        double p1;
        double CircleArea,r;
        
        p1=keybrd.nextDouble();
        r=keybrd.nextDouble();
        CircleArea=p1*r*r;
        
        System.out.println("CircleArea is" +CircleArea  );
    }
    
}

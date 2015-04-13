/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheittocelsius;
import java.util.*;
/**
 *
 * @author Trevor October
 */
public class FahrenheitToCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keybrd=new Scanner(System.in);
        double temperature;
        double fahrenheit;
        double celcuis=32;
        
        
        fahrenheit=keybrd.nextDouble();
        
        temperature=fahrenheit-celcuis*5/9;
        
        System.out.println("Your temperature is "+temperature);
    }
}

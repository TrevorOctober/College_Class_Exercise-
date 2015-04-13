/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package device;

/**
 *
 * @author LUCKY MBUTHO
 */
public class DeviceTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Device dev = new Device("round",25);
        //System.out.println(dev.toString());
        dev.showDevice();
        
        CD mycd = new CD("DJ Hhashi","Loving soul",5,"paper disc",59.89);
        mycd.showDevice();
        
    }
}

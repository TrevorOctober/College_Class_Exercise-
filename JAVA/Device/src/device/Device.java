/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package device;

/**
 *
 * @author LUCKY MBUTHO
 */
public class Device {
    
    protected String name;
    protected double size;

    public Device() {
        name = "flat";
        size =10;
    }

    public Device(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "my device name is"+getName()+
                "\nThe size is "+getSize();
    }
      
    
    public void showDevice(){
    
   System.out.println("my device name is"+getName());
   System.out.println("The size is "+getSize()+"MB");
    }
    
    
    
    
}

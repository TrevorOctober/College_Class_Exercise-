/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p3rsontester.h;

/**
 *
 * @author TREVOR
 */
public class P3rsonTesterH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("**************************\n");
        person per=new person();
        per.showPerson();
         
        person per2=new person();
        per2.showPerson();
        
        
        student stu=new student("1234",22,"Ntuthuko",30);
        stu.showPerson();
        System.out.println("**************************\n");
    }
}

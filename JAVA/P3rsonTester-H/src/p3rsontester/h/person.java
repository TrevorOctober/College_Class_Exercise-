/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p3rsontester.h;

/**
 *
 * @author TREVOR
 */
public class person {
    
    private String name;
    private int age;

    public person() {
    
    name="Trevor";
    age =21;
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public void showPerson(){
        System.out.println(getName()+" "+getAge());
    }
}

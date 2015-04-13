/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persontester;

/**
 *
 * @author TREVOR
 */
public class person {
    private String name;
    private String surname;
    private int age;

    public person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public void display(){
        
         System.out.println("the person's name is "+ getName());
         System.out.println("the person's surname is "+getSurname());
         System.out.println("the person's age is "+getAge());
       
    }
}

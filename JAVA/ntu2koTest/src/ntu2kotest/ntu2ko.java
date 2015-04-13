/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ntu2kotest;

/**
 *
 * @author TREVOR
 */
public class ntu2ko {
    String name;
    int dob;
    int age;

    public ntu2ko(String name, int dob, int age) {
        this.name = name;
        this.dob = dob;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDob() {
        return dob;
    }

    public String getName() {
        return name;
    }
    public void display(){
     System.out.println("Name: "+getName());   
     System.out.println("DOB "+getDob()) ;
     System.out.println("Age: "+getAge()); 
    }
}

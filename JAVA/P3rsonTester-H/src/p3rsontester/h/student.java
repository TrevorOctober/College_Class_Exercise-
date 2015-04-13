/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p3rsontester.h;

/**
 *
 * @author TREVOR
 */
public class student extends person {
    
    private String StudNo;
    private int marks;

    public student(String StudNo, int marks, String name, int age) {
        super(name, age);
        this.StudNo = StudNo;
        this.marks = marks;
    }

    public String getStudNo() {
        return StudNo;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public void showPerson() {
        super.showPerson();
        System.out.println(getStudNo()+" "+getMarks() );
    }
    
    
    
}

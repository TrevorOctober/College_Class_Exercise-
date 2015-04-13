/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author TREVOR
 */
public class EmployeeDetails {
  String Name;
  String Surname;
  int SocialNumber;
  int EmployeeNumber;
  
// overloading constructor  - polymorphism
    public EmployeeDetails(String Name, String Surname, int SocialNumber, int EmployeeNumber) {
        this.Name = Name;
        this.Surname = Surname;
        this.SocialNumber = SocialNumber;
        this.EmployeeNumber = EmployeeNumber;
    }
  
  // overloading constructor  - polymorphism
  public EmployeeDetails(){
  
         
  }

    public int getEmployeeNumber() {
        return EmployeeNumber;
    }

    public String getName() {
        return Name;
    }

    public int getSocialNumber() {
        return SocialNumber;
    }

    public String getSurname() {
        return Surname;
    }
    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("SurName: "+getSurname());
        System.out.println("Social Number: "+getSocialNumber());
        System.out.println("Employee Number: "+getEmployeeNumber());
    }
  }


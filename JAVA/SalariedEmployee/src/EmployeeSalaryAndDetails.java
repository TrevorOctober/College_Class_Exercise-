import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author TREVOR
 */
public class EmployeeSalaryAndDetails {
    private String name;
    private double rate;
    private double hours;
    private double weeksalary;
   
    public EmployeeSalaryAndDetails(String empName){
        name=empName;
        if (hours>40)
         weeksalary=hours*rate;
    }
        public void setname( String empName ){
         name=empName;
        }
         public String getname(){
             return name;
         }
        
    
        public void Othersalary(double overtime){
        weeksalary=hours+1.*rate;
        }
        public double getweeksalary(){
           
           return weeksalary;
        }
           public void displayMessage(){
           System.out.printf(name, weeksalary);
        }   
       } 

     
    


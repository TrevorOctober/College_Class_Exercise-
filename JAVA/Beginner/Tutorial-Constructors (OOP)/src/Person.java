
public class Person {
 String Name;
 String Surname;
 int age;

    public Person(String Name, String Surname, int age) {
        this.Name = Name;
        this.Surname = Surname;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
 public void display(){
     
 System.out.println("**************************");    
 System.out.println("Person1 \n"
         + "Name: "+getName()+"\n"
         + "Surname: "+getSurname()+"\n"
         + "Age: "+getAge());    
   
 }
}

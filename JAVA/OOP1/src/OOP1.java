//introduction to OOP

public class OOP1 {

   
    public static void main(String[] args) {
       
       Person person1= new Person();
       Person person2= new Person();
       Person person3= new Person(); 
       
       person1.name="Trevor";
       person1.surname="October";
       person1.age=21;
       
       person2.name="Culoe de song";
       person2.surname="Zulu";
       person2.age=23;
       
       person3.name="Ntuthuko";
       person3.surname="Dlamini";
       person3.age=20;
       
       System.out.println("Person1:\n"
               +"Name :"+ person1.name+ "\n"
               +"Surname :"+ person1.surname+ "\n"
               +"Age :" +person1.age+"\n");
       
       System.out.println("Person:\n"
               +"Name :"+ person2.name+ "\n"
               +"Surname :"+ person2.surname+ "\n"
               +"Age :" +person2.age+"\n");
       
       System.out.println("Person3:\n"
               +"Name :"+ person3.name+ "\n"
               +"Surname :"+ person3.surname+ "\n"
               +"Age :" +person3.age+"\n");
       
        
    }
}

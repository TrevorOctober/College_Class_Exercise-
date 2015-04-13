
public class Tutorial_Constructors_OOP{
    
    public static void main(String []args){
        
        /*Contructors_OOP person1=new Contructors_OOP("Trevor","October",22);
        Contructors_OOP person2=new Contructors_OOP("Pearl","Montana",20);
        
        System.out.println("********************************");
        System.out.println("Person 1 \n"
                + "Name: "+person1.Name+ "\n"
                + "Surname: "+person1.Surname+"\n"
                + "Age: "+person1.age);
        System.out.println("********************************");
        System.out.println("Person 2 \n"
                + "Name: "+person2.Name+ "\n"
                + "Surname: "+person2.Surname+"\n"
                + "Age: "+person2.age);
        System.out.println("********************************");*/
        
        Person per=new Person("Zama","Mkhize",19);
        Person per2=new Person("S'ne","Masondo",23);
        
        per.display();
        per2.display();  
    }
}

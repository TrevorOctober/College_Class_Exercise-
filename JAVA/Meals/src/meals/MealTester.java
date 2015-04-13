
package meals;


public class MealTester {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Food plate = new Food();
        plate.eat();
        plate.eat("Chips");
        
        System.err.print("\n----------------------------------\n");
        
        Cake choc = new Cake();
        choc.eat();
        choc.eat("Vanilla cake");
        
        
    }
}

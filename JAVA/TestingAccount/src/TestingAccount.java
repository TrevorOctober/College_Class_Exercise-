import java.util.Scanner;



public class TestingAccount {

    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
  

        System.out.print("Enter the number for account #1: ");
        int accountNo = kb.nextInt();

        System.out.print("Enter the balance for account #1: ");
        double balance = kb.nextDouble();

        CheckingAccount account1 = new CheckingAccount(accountNo, balance);

        System.out.print("Enter the number for account #2: ");
        accountNo = kb.nextInt();

        System.out.print("Enter the balance for account #2: ");
        balance = kb.nextDouble();

        CheckingAccount account2 = new CheckingAccount(accountNo, balance);

        System.out.println(" ACCOUNT1 ");
        System.out.println(account1);

        System.out.println(" ACCOUNT2 ");
        System.out.println(account2);
    }
} 
 
 


 

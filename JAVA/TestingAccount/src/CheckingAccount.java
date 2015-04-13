/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TREVOR
 */
public class CheckingAccount {
     // Data fields for an account number and a balance
    private int accountNo;
    private double balance;

    // It will be true if the initial balance is below the required 200.00 minimum
    // for an account.
    private boolean reducedToZero;

    // Include a constructor that takes arguments for each field
    public CheckingAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
        // The Constructor sets the balance to 0 if its below the required
        // 200.00 minimum for an account
        if (this.balance < 200.00) {
            this.balance = 0; 
            reducedToZero = true;
        }
    }

    // Include a method that displays account details, including an explanation
    // if the balance was reduced to 0
    @Override
    public String toString() {
        String details = "Account Number: " + accountNo + "\nBalance: $"
               + balance;
        if (reducedToZero) {
            details += "\nNOTE: The balance was reduced to 0 "
                    + "because it was below the required $200.00 minimum.";
        }
        return details;
    };
} 
 
 




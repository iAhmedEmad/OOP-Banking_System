import java.util.Scanner;

public class BankAccount {
                    /****Attributes****/
    private long accountNumber;
    private static int numberOfAccountsCreated = 10000000;
    private String accountHolderName;
    private double balance;


                    /****Default Constructor****/
    public BankAccount(){
        accountNumber = ++numberOfAccountsCreated;
    }


                    /****Setters & Getters Methods****/
    public long getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public static int getNumberOfAccountCreated() {
        return numberOfAccountsCreated;
    }
                    /****Disabled Setters Methods For Read-Only Attributes****/
    /*public void setBalance(double balance) {
        Balance = balance;
    }*/
    /**the balance setter methods will be disabled to add extra layer of protection to balance variable, we can change it with deposit & withdraw methods only**/

    /*public static void setNumberOfAccountCreated(int numberOfAccountCreated) {
        BankAccount.numberOfAccountCreated = numberOfAccountCreated;
    }*/
    /**the number of accounts created setter methods will be disabled to add extra layer of protection to this variable, it will be automatically incremented while constructing the object**/

    /*public void setAccountNumber() {
        accountNumber += numberOfAccountCreated;
    }*/
    /**the account number will be automatically created while constructing the object starting from 10000002**/



    /****Class Methods****/
    public void deposit(double amount){
        if(amount>=0){
            balance += amount;
            System.out.println("                "+amount+" EGP Deposited successfully!");
        }
        else{
            System.out.println("        please enter a valid amount to deposit");
            Scanner userInput = new Scanner(System.in);
            double newAmount = userInput.nextDouble();
            deposit(newAmount);
        }
    }
    public void withdraw(double amount){
        if(amount>=0 && amount<= balance){
            balance -= amount;
            System.out.println("                "+amount+" EGP withdrawn successfully!");
        }
        else {
            System.out.println("        please enter a valid amount to withdraw");
            Scanner userInput = new Scanner(System.in);
            double newAmount = userInput.nextDouble();
            withdraw(newAmount);
        }
    }
}

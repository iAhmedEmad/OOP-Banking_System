import java.util.Scanner;

public class CheckingAccount extends Account{
                    /****Attributes****/
    private int maxCheckValue;
                    /****Setters & Getters Methods****/
    public int getMaxCheckValue() {
        return maxCheckValue;
    }

    public void setMaxCheckValue(int maxCheckValue) {
        this.maxCheckValue = maxCheckValue;
    }

                    /****Class Methods****/
    public void issueCheck(Bank bank){
        System.out.println("                Please enter the value of the check:");
        Scanner userInput = new Scanner(System.in);
        double amount = userInput.nextDouble();
        if(bank.getBalance() >= amount){
            bank.withdraw(amount);
            System.out.println("                A new check with "+amount+" EGP issued successfully");
        }
        else {
            System.out.println("                Out of balance!, please try again with valid check value (max. "+getBalance()+" EGP.)");
            issueCheck(bank);
        }

    }
}

public class Account extends BankAccount {
                    /****Attributes****/

    private String bankName;
    private float iScore; //it is possible for a banking i-score to be a decimal number & let's assume that the initial i-score for any new account is 100

                    /****Default Constructor****/
    public Account(){
        iScore = 100;
    }
                    /****Setters & Getters Methods****/
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public float getiScore() {
        return iScore;
    }
    public void setiScore(float iScore) {
        this.iScore = iScore;
    }

                    /****Class Methods****/
    public void displayAccountSummary() {

            System.out.println("This is a " + getAccountHolderName() + "'s account and the current balance is " + getBalance() + " EGP");

    }

}

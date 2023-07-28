public class SavingsAccount extends Account{
                    /****Attributes****/
    private float interestRate;
    private String maturityDate;
                    /****Setters & Getters Methods****/
    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public String getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }

                 /****Class Methods****/
    public double calculateInterest(Account account){
        return account.getBalance()*(interestRate/100);
    }
}

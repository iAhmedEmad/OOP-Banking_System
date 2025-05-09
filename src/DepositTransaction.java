public class DepositTransaction extends Transaction{
    @Override
    public void performTransaction(Account account, double amount) {
        account.deposit(amount);
    }
}

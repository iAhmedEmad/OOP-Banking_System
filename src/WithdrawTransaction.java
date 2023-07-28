public class WithdrawTransaction extends Transaction{
    @Override
    public void performTransaction(Account account, double amount) {
        account.withdraw(amount);
    }
}

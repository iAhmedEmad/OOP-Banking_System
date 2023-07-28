import java.util.Scanner;

public class Bank extends CheckingAccount implements BankingSystem {
    @Override
    public void bankServices(Bank bank) {
        System.out.println("                Hi There! let's create your bank account");
        createAccount();
        System.out.println("                let's deposit some money first");
        deposit(bank);
        int service = 0;
        while (true) {
            int endProgramFlag = 0;
            do {
                Scanner userInput = new Scanner(System.in);
                System.out.println("                please choose the service number you want:\n1- Withdraw Money\n2- Deposit Money\n3- View My Balance\n4- Issue a Check\n5- End Program");
                service = userInput.nextInt();
                switch (service) {
                    case 1 -> withdraw(bank);
                    case 2 -> deposit(bank);
                    case 3 -> viewBalance(bank);
                    case 4 -> issueCheck(bank);
                    case 5 -> endProgramFlag = 1;
                    default -> System.out.println("             please enter a valid service (1/2/3/4)");
                }
            }
            while (!(service == 1 || service == 2 || service == 3 || service == 4 || service == 5));
            if(endProgramFlag == 1){
                System.out.println("                ****Thanks for using our bank services!****");
                break;
            }
        }
    }

    @Override
    public void createAccount() {
        Account c = new Account();
        boolean correctNameFlag = false;
        do {
            Scanner userInput = new Scanner(System.in);
            String name;

            System.out.println("please enter your full name: ");
            if (userInput.hasNext("[A-Za-z]*") == true) {
                c.setAccountHolderName(userInput.nextLine());
                correctNameFlag = true;
            }
            else{
                System.out.println("            Please Enter a Valid name");
            }
        }
        while (!correctNameFlag);

        do {
            Scanner userInput = new Scanner(System.in);
            System.out.println("                please choose your bank (1 or 2 or 3): \n1- CIB\n2- HSBC\n3- QNB");
            int bankName = userInput.nextInt();
            switch (bankName) {
                case 1 -> c.setBankName("CIB");
                case 2 -> c.setBankName("HSBC");
                case 3 -> c.setBankName("QNB");
                default -> System.out.println("            please enter a valid number (1 or 2 or 3)");
            }
        }
        while (!(c.getBankName() == "CIB" || c.getBankName() == "HSBC" || c.getBankName() == "QNB"));

        System.out.println("            ***Congratulation! Your account was created successfully!***            ");
        System.out.println("- Account Number: "+c.getAccountNumber());
        System.out.println("- Account Holder Name: "+c.getAccountHolderName().toUpperCase());
        System.out.println("- Balance: "+c.getBalance());
        System.out.println("- Bank Name: "+c.getBankName());
        System.out.println("- i-Score: "+c.getiScore());
        System.out.println("===========================================================================");
    }


    @Override
    public void deposit(Bank bank) {
        System.out.println("                Please enter the amount to be deposited:                ");
        Scanner userInput = new Scanner(System.in);
        double amount = userInput.nextDouble();
        bank.deposit(amount);
    }

    @Override
    public void withdraw(Bank bank) {
        System.out.println("                Please enter the amount to be withdrawn:");
        Scanner userInput = new Scanner(System.in);
        double amount = userInput.nextDouble();
        bank.withdraw(amount);
    }

    @Override
    public void viewBalance(Bank bank) {
        System.out.println("                Your current balance is "+bank.getBalance()+" EGP.");
    }
}

package P11DefiningClasses.P03BankAccount;

public class BankAccount {
    private static final double DEFAULT_INTEREST_RATE = 0.02;
    private static double interestRate = DEFAULT_INTEREST_RATE;

    private static int accountsCount = 0;

    private int id;
    private double balance;


    public void deposit(double balance) {
        this.balance += balance;
    }

    public double getInterest(int years) {
        return this.balance * interestRate * years;
    }

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public BankAccount() {
        accountsCount++;
        this.id = accountsCount;
        this.balance = 0;
    }

    public int getId() {
        return this.id;
    }
}

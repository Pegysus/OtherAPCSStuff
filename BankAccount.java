public class BankAccount implements Comparable<BankAccount> {
    private double balance;
    public BankAccount(double b) {
        balance = b;
    }
    public double getBalance() {
        return balance;
    }
    /**
    Compares two bank accounts.
    @param other the other BankAccount
    @return 1 if this bank account has a greater balance than the other
    one,
    -1 if this bank account is has a smaller balance than the other one,
    and 0 if both bank accounts have the same balance
    */
    public int compareTo(BankAccount other) {
        if(this.getBalance() > other.getBalance()) return 1;
        if(this.getBalance() < other.getBalance()) return -1;
        return 0;
    }
}
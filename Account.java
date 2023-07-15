public class Account {
    
    private String name;
    private int accountID;
    private int pin;
    private double balance;

    public Account(String name, int accountID, int pin) {
        this.name = name;
        this.accountID = accountID;
        this.pin = pin;
        this.balance = 0.00;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountID() {
        return this.accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getPin() {
        return this.pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
}

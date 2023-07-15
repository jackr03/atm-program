// Import required packages
import java.util.Scanner;
import java.util.ArrayList;

// Driver for ATM program
class ATM {

    public static Scanner inputScanner = new Scanner(System.in);
    private static ArrayList<Account> accountList = new ArrayList<>();
    private static Account currentAccount;

    public static void main(String args[]) {
        Account testAccount = new Account("Jack Rong", 10803904, 3714);
        accountList.add(testAccount);

        for (Account i : accountList) {
            if (i.getAccountID() == 10803904) {
                currentAccount = i;
            }
        }

        currentAccount.setBalance(1000.00);

        while (true) {
            System.out.println("\n-----------------");
            System.out.println("|      ATM      |");
            System.out.println("-----------------\n");

            System.out.println("Select 1 to withdraw");
            System.out.println("Select 2 to deposit");
            System.out.println("Select 3 to check balance");
            System.out.println("Select 4 to exit\n");

            System.out.print("Please choose the desired operation: ");
            int choice = inputScanner.nextInt();   

            userChoice(choice);
        }
    }

    public static void userChoice(int choice) {
        switch(choice) {
            case 1:
                System.out.println("\nCurrent balance: £" + String.format("%.2f", currentAccount.getBalance()));
                System.out.print("Enter the amount of money to withdraw: £");
                double moneyToWithdraw = inputScanner.nextDouble();

                if (moneyToWithdraw > currentAccount.getBalance()) {
                    System.out.println("Not enough money to withdraw, please enter an appropriate amount.");
                } else {
                    System.out.println("Successful withdrawal. New balance: £" + String.format("%.2f", withdraw(currentAccount, moneyToWithdraw)));     
                }

                break;
            case 2:
                System.out.print("\nEnter the amount of money to deposit: £");
                double moneyToDeposit = inputScanner.nextDouble();
                
                System.out.println("Successful deposit. New balance: £" + String.format("%.2f", deposit(currentAccount, moneyToDeposit)));
                break;
            case 3:
                System.out.println("\nCurrent balance: £" + String.format("%.2f", checkBalance(currentAccount)));
                break;
            case 4:
                exit();
            default:
                System.out.print("Invalid option. ");
        }
    }

    public static double withdraw(Account account, double money) {
        account.setBalance(account.getBalance() - money);

        return currentAccount.getBalance();
    }

    public static double deposit(Account account, double money) {
        account.setBalance(account.getBalance() + money);

        return currentAccount.getBalance();
    }

    public static double checkBalance(Account account) {
        return currentAccount.getBalance();
    }

    public static void exit() {
        System.out.println("\nThank you for using our services. Have a nice day!");
        inputScanner.close();
        System.exit(0);
    }
    
}
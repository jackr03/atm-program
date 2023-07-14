// Import required packages
import java.util.Scanner;

// Driver for ATM program
class ATM {
    public static Scanner inputScanner = new Scanner(System.in);
    private static double balance = 1000.00;

    public static void main(String args[]) {
        while (true) {
            System.out.println("\nATM\n");

            System.out.println("Select 1 to withdraw");
            System.out.println("Select 2 to deposit");
            System.out.println("Select 3 to check balance");
            System.out.println("Select 4 to exit\n");

            userChoice();
        }
    }

    public static void userChoice() {
        System.out.print("Please choose the desired operation: ");
        int choice = inputScanner.nextInt();
        
        switch(choice) {
            case 1 -> withdraw();
            case 2 -> deposit();
            case 3 -> System.out.println("\nCurrent balance: £" + String.format("%.2f", checkBalance()));
            case 4 -> exit();
            default -> System.out.print("Invalid option. ");
        }
    }

    public static void withdraw() {
        System.out.println("\nCurrent balance: £" + String.format("%.2f", checkBalance()));

        while (true) {
            System.out.print("Enter amount of money to withdraw: £");
            double money = inputScanner.nextDouble();

            if (money < balance) {
                balance -= money;
                System.out.println("\nSuccessful withdrawal. New balance: £" + String.format("%.2f", checkBalance()));
                return;         
            } else {
                System.out.println("\nInvalid amount of money to withdraw. Please try again.");
                return;
            }
        }
    }

    public static void deposit() {
        System.out.print("\nEnter amount of money to deposit: £");

        double money = inputScanner.nextDouble();

        balance += money;

        System.out.println("\nSuccessful deposit. New balance: £" + String.format("%.2f", checkBalance()));
        return;
    }

    public static double checkBalance() {
        return balance;
    }

    public static void exit() {
        System.out.println("\nThank you for using our services. Have a nice day!");
        inputScanner.close();
        System.exit(0);
    }
    
}
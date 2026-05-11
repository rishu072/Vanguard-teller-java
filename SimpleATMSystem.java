import java.util.Scanner;

class ATM {
    private double balance;

    public ATM(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance; 
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrawn: ₹" + amount);
        }
    }
}

public class SimpleATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(5000);
        int choice;

        do {
            System.out.println("\n===== SIMPLE ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1-4.");
                sc.next();
                System.out.print("Enter your choice: ");
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: ₹" + atm.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    if (sc.hasNextDouble()) {
                        double depositAmount = sc.nextDouble();
                        atm.deposit(depositAmount);
                    } else {
                        System.out.println("Invalid input! Please enter a numeric value.");
                        sc.next();
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    if (sc.hasNextDouble()) {
                        double withdrawAmount = sc.nextDouble();
                        atm.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Invalid input! Please enter a numeric value.");
                        sc.next();
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1-4.");
            }
        } while (choice != 4);

        sc.close();
    }
}

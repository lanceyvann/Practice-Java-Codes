import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner jw = new Scanner(System.in);
        ArrayList<SavingsAccount> accounts = new ArrayList<>();
        
        int systemChoice = 0;
        System.out.println("\nBANKING SYSTEM");
        while (systemChoice != 3) {
            System.out.println("\nChoose from:");
            System.out.println("1. Create New Account");
            System.out.println("2. Access Existing Account");
            System.out.println("3. Shut Down System");
            System.out.print("Enter choice: ");
            systemChoice = jw.nextInt();
            jw.nextLine(); 

            SavingsAccount activeAccount = null;

            switch (systemChoice) {
                case 1: 
                    System.out.print("Enter account holder name: ");
                    String accountName = jw.nextLine();
                    System.out.print("Enter account number: ");
                    String accountNumber = jw.nextLine();
                    System.out.print("Enter initial balance: ");
                    double balance = jw.nextDouble();
                    System.out.print("Enter interest rate (e.g., 0.05 for 5%): ");
                    double interestRate = jw.nextDouble();

                    activeAccount = new SavingsAccount(accountName, accountNumber, balance, interestRate);
                    accounts.add(activeAccount);
                    System.out.println("\nAccount successfully registered!");
                    break;

                case 2: 
                    if (accounts.isEmpty()) {
                        System.out.println("\nError: Please register an account first.");
                        break;
                    }
                    System.out.print("Enter Account Number to access: ");
                    String searchNumber = jw.nextLine();
                    
                    for (SavingsAccount acc : accounts) {
                        if (acc.getAccountNumber().equals(searchNumber)) {
                            activeAccount = acc;
                            break;
                        }
                    }

                    if (activeAccount == null) {
                        System.out.println("\nError: Account number does not exist.");
                    }
                    break;

                case 3:
                    System.out.println("\nGoodbye!");
                    break;

                default:
                    System.out.println("\nInvalid choice. Try again.");
            }

            if (activeAccount != null) {
                int choice = 0;
                while (choice != 5) {
                    System.out.println("\nACCOUNT OPERATIONS: " + activeAccount.getAccountName().toUpperCase());
                    System.out.println("\n1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Check Balance");
                    System.out.println("4. Add Interest");
                    System.out.println("5. Log Out / Main Menu");
                    System.out.print("\nEnter Choice: ");
                    choice = jw.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter deposit amount: ");
                            double deposit = jw.nextDouble();
                            if (deposit > 0) {
                                System.out.println(activeAccount.deposit(deposit));
                            } else {
                                System.out.println("Invalid deposit amount.");
                            }
                            break;

                        case 2:
                            System.out.print("Enter withdrawal amount: ");
                            double withdrawal = jw.nextDouble();
                            if (withdrawal <= 0) {
                                System.out.println("Invalid withdrawal amount.");
                            } else if (withdrawal > activeAccount.getBalance()) {
                                System.out.println("Insufficient balance.");
                            } else {
                                System.out.println(activeAccount.withdraw(withdrawal));
                            }
                            break;

                        case 3:
                            activeAccount.displayBalance();
                            break;

                        case 4:
                            activeAccount.addInterest();
                            System.out.println("Interest applied.");
                            System.out.println("Updated Balance: PHP " + activeAccount.getBalance());
                            break;

                        case 5:
                            System.out.println("Logging out of " + activeAccount.getAccountName() + "'s terminal...");
                            break;

                        default:
                            System.out.println("Invalid operational choice.");
                    }
                }
            }
        }
    }
}

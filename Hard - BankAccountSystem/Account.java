public class Account {
	private String accountName, accountNumber;
	protected double balance;

	public Account(String accountName, String accountNumber, double balance) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getAccountName() {
		return accountName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}

	public void displayBalance() {
        	System.out.println("\nAccount Holder: " + accountName);
        	System.out.println("Account Number: " + accountNumber);
        	System.out.println("Current Balance: " + balance);
	}
	
}

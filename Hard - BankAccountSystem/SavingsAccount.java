public class SavingsAccount extends Account {
	private double interestRate;
	
	public SavingsAccount(String accountName, String accountNumber, double balance, double interestRate) {
		super(accountName, accountNumber, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

 	public void addInterest() {
 		double interest = getBalance() * interestRate;
 		this.balance += interest;
 	}

	public String deposit(double amount) {
		this.balance += amount;
		return "Succesfully depo'ed Php" + amount;
	}

	public String withdraw(double amount) {
		this.balance -= amount;
            	return "You have successfully withdrawn PHP " + amount;
	}
}

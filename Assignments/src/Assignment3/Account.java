package Assignment3;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public abstract class Account {
		    protected String accountHolderName;
		    protected double balance;

		    public Account(String accountHolderName, double balance) {
		        this.accountHolderName = accountHolderName;
		        this.balance = balance;
		        Bank.incrementAccountCount();
		    }

		    public abstract void deposit(double amount);
		    public abstract void withdraw(double amount);
		    public abstract double getBalance();

		    public void displayAccountInfo() {
		        System.out.println("Account Holder: " + accountHolderName);
		        System.out.println("Current Balance: ₹" + balance);
		    }
		}
	}

}

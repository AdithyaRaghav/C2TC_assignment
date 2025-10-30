package Assignment3;

public class CheckingAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class CheckingAccount extends Account {
		    private double overdraftLimit = 5000;

		    public CheckingAccount(String name, double balance) {
		        super(name, balance);
		    }

		    @Override
		    public void deposit(double amount) {
		        balance += amount;
		        System.out.println("Deposited ₹" + amount + ". New Balance: ₹" + balance);
		    }

		    @Override
		    public void withdraw(double amount) {
		        if (balance + overdraftLimit >= amount) {
		            balance -= amount;
		            System.out.println("Withdrew ₹" + amount + ". New Balance: ₹" + balance);
		        } else {
		            System.out.println("Overdraft limit exceeded!");
		        }
		    }

		    @Override
		    public double getBalance() {
		        return balance;
		    }
		}
	}

}

package bankSystem;

public class Arrays {
	public static void main(String[] args) {
		Account[] accounts = new Account[10];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new CurrentAccount();
			try {
				accounts[i].deposit(100 * i);
			} catch (InvalidValueException exception) {
				System.out.println(exception);
			}
		}
		double totalBalance = 0;
		for (Account account : accounts) {
			totalBalance += account.getBalance();
		}
		System.out.println("Total Balance: " + totalBalance + "\nAvarage Balance: " + totalBalance / accounts.length);
	}
}
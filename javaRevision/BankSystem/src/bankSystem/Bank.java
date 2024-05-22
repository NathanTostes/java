package bankSystem;

public class Bank {
	private String name;
	private int number;
	private Account[] accounts;
	private static int numberOfAccounts;
	
	public Bank(String name, int number) {
		this.name = name;
		this.number = number;
		accounts = new Account[10];
	}
	
	public void addAccount(Account account) throws BankFullException {
		if(numberOfAccounts >= 10) {
			throw new BankFullException("The bank is full");
		} else {
			accounts[numberOfAccounts] = account;
		}
	}
	
	public void showAccounts(){
		for(Account account : accounts) {
			System.out.println(account.toString());
		}
	}
	
	public boolean containsAccount(Account compareAccount) {
		for(Account account : accounts) {
			if(account.getAccountNumber() == compareAccount.getAccountNumber()) {
				return true;
			}
		}
		return false;
	}
}

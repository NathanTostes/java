package bankSystem;

public class ArrayAccounts {
	public static void main(String[] args) {
		Account[] accounts = new Account[5];
		accounts[0] = new CurrentAccount("Goku", "93824837621", 8001);
		accounts[1] = new CurrentAccount("Johan", "93824883621", 8001);
		accounts[2] = new CurrentAccount("Luffy", "93872487621", 8001);
		accounts[3] = new CurrentAccount("Ash", "93224837621", 8001);
		accounts[4] = new CurrentAccount("Asta", "93524837621", 8001);
		for(Account account : accounts) {
			System.out.println(account.getOwnerName());
		}
	}
}
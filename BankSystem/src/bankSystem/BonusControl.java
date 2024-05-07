package bankSystem;

public class BonusControl {
	private static double bonusTotal = 0;
	
	public static double getBonusTotal() {
		return BonusControl.bonusTotal;
	}
	
	public static void registerBonus(EmployeeAuthenticable enployee) {
		BonusControl.bonusTotal += enployee.getSalaryBonus();		
	}
}
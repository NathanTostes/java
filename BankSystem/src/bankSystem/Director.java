package bankSystem;

public class Director implements EmployeeAuthenticable {
	private String name;
	private String cpf;
	private double salary;
	private String password;

	public Director(String name, String cpf, double salary, String password) {
		this.name = name;
		this.cpf = cpf;
		this.salary = salary;
		this.password = password;
	}

	@Override
	public boolean autentification(String password) {
		if (this.password == password) {
			return true;
		} else {
			return false;
		}
	}

	public double getSalaryBonus() {
		return (this.salary * 0.1) * 2000;
	}
}

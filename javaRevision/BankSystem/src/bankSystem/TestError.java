package bankSystem;

public class TestError {
	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 0;
		int result = 0;
		try {
			result = number1 / number2;
		} catch (ArithmeticException exception) {
			System.out.println("Erro: " + exception);
		}
		System.out.println(result);
	}
}
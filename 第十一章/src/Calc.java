public class Calc {
	int num1;
	int num2;
	String op;

	void result() {
		int result = 0;
		switch (op) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;

		}
		System.out.println(num1 + op + num2 + "=" + result);
	}
}

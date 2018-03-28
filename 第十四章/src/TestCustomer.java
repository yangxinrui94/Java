import java.util.Scanner;

public class TestCustomer {
	public static void main(String[] args) {
		CustomerBiz a = new CustomerBiz();
		Scanner input = new Scanner(System.in);
		boolean con = true;
		while (con) {
			System.out.println("请输入姓名：");
			String name = input.next();
			a.addName(name);
			System.out.print("继续输入吗？(y/n)：");
			String answer = input.next();
			if (answer.equals("n")) {
				con = false;
			}

		}
		a.show();
	}
}

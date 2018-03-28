import java.util.Scanner;


public class 简答题3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calc a = new Calc();
		System.out.print("请输入第一个数：");
		a.num1 = input.nextInt();
		System.out.print("请输入第二个数：");
		a.num2 = input.nextInt();
		System.out.print("请输入运算符：");
		a.op = input.next();
		a.result();

	}
}

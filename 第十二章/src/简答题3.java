import java.util.Scanner;


public class �����3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calc a = new Calc();
		System.out.print("�������һ������");
		a.num1 = input.nextInt();
		System.out.print("������ڶ�������");
		a.num2 = input.nextInt();
		System.out.print("�������������");
		a.op = input.next();
		a.result();

	}
}

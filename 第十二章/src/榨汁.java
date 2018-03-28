import java.util.Scanner;


public class 榨汁 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		榨汁机  a = new 榨汁机();
		System.out.print("客观喜欢什么口味？");
		String name = input.next();
		System.out.print("需要几杯：");
		int num = input.nextInt();
		a.榨汁(name, num);
	}
}

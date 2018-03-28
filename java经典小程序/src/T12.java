import java.util.Scanner;
/**
 * 
 *斐波那契数列
 *
 */
public class T12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个数：");
		int n = input.nextInt();
		int a = 1, b = 1, c = 0;
		for (int i = 0; i < n - 2; i++) {
			c = a;
			a = b;
			b += c;
			
		}
		System.out.println(b);
	}
}

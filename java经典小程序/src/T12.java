import java.util.Scanner;
/**
 * 
 *쳲���������
 *
 */
public class T12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ������");
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

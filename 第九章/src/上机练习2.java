import java.util.Scanner;


public class �ϻ���ϰ2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rows =0;
		System.out.print("������ֱ�������ε�������");
		rows = input.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}

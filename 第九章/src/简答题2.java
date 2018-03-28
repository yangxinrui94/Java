import java.util.Scanner;


public class 简答题2 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("请输入图案的行数：");
	int rows = input.nextInt();
	for (int i = 1; i <= rows; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print(j+" ");
			System.out.print(j-i+" ");
		}
		System.out.println();
	}
	}
}

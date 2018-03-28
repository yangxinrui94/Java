import java.util.Scanner;


public class 上机练习4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rows = 0;
		System.out.print("请输入等腰三角形的行数：");
		rows = input.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j=rows-2; j>=i-1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}

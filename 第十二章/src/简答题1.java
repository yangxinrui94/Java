import java.util.Scanner;


public class 简答题1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Season a = new Season();
		System.out.print("请输入月份：");
		int num = input.nextInt();
		a.season(num);
	}
}

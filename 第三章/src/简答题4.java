import java.util.Scanner;


public class 简答题4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int a =input.nextInt();
		int b = a%3 ;
		int c = a%5;
		if (b==0 || c==0) {
			System.out.println("该整数是3或5的倍数。");
		}else {
				System.out.println("该数不能被3或5中任何一个数整除。");
			}
		
	}
}

import java.util.Scanner;


public class 简答题4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num[] = new int[10];
		int a = 0, b = 0, c = 0;
		System.out.println("请输入10个数");
		for (int i = 0; i < num.length; i++) {
			num[i] = input.nextInt();
			switch (num[i]) {
			case 1:
				a++;
				break;
			case 2:
				b++;
				break;
			case 3:
				c++;
				break;

			default:
				break;
			}
		}
		System.out.println("数字1 的个数："+a);
		System.out.println("数字2 的个数："+b);
		System.out.println("数字3 的个数："+c);
		System.out.println("非法数字的个数："+(10-a-b-c));
	}
}

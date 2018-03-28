import java.util.Scanner;

public class 上机练习4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = 0;
		System.out.println("青鸟迷你游戏平台> 游戏点击率\n");
		for (int i = 1; i < 5; i++) {
			System.out.print("请输入第" + i + "个游戏的点击率：");
			int num = input.nextInt();

			if (num > 100) {

				a++;

				continue;
			}

		}

		System.out.println("点击率大于100的游戏数是：" + a);
		System.out.println("点击率大于100的游戏所占的比例为：" + (a / 4.0 * 100) + "%");

	}
}

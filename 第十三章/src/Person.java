import java.util.Scanner;

public class Person {
	Scanner input = new Scanner(System.in);
	String name;
	int score = 0;

	int showFist() {
		System.out.print("请出拳：1.剪刀 2.石头 3.布(请输入相应数字：)");
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.println("你出拳: 剪刀");
			break;
		case 2:
			System.out.println("你出拳: 石头");
			break;
		case 3:
			System.out.println("你出拳: 布");
			break;
		default:
			System.out.println("输入有误，请重新输入：");
			break;
		}
		return num;
	}
}

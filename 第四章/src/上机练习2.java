import java.util.Scanner;

public class 上机练习2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入消费金额：");
		double money = input.nextDouble();
		System.out.println("是否参加换购活动：");
		System.out.println("1：满50元，加2元换购百事可乐饮料1瓶");
		System.out.println("2：满100元，加3元换购500ml可乐一瓶");
		System.out.println("3：满100元，加10元换购5公斤面粉");
		System.out.println("4：满200元，加10元可换购1个苏泊尔炒菜锅");
		System.out.println("5：满200元，加20元可换购欧莱雅爽肤水一瓶");
		System.out.println("0：不换购");
		System.out.println("请选择");
		int num = input.nextInt();
		if (money >= 200) {
			switch (num) {
			case 1:
				System.out.println(money + 2);
				System.out.println("百事可乐饮料1瓶");
				break;
			case 2:
				System.out.println(money + 3);
				System.out.println("500ml可乐一瓶");
				break;
			case 3:
				System.out.println(money + 10);
				System.out.println("5公斤面粉");
				break;
			case 4:
				System.out.println(money + 10);
				System.out.println("1个苏泊尔炒菜锅");
				break;
			case 5:
				System.out.println(money + 20);
				System.out.println("欧莱雅爽肤水一瓶");
				break;
			default:
				System.out.println(money);
				System.out.println("不换购");
				break;
			}
		} else if (money >= 100) {
			switch (num) {

			case 1:
				System.out.println(money + 2);
				System.out.println("百事可乐饮料1瓶");
				break;
			case 2:
				System.out.println(money + 3);
				System.out.println("500ml可乐一瓶");
				break;
			case 3:
				System.out.println(money + 10);
				System.out.println("5公斤面粉");
				break;
			default:
				System.out.println(money);
				System.out.println("不换购");
				break;
			}
		} else if (money >= 50) {
			switch (num) {
			case 1:
				System.out.println(money + 2);
				System.out.println("百事可乐饮料1瓶");
				break;

			default:
				System.out.println(money);
				System.out.println("不换购");
				break;

			}

		}

	}

}


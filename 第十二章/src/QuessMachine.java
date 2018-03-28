import java.util.Scanner;

public class QuessMachine {
	Scanner input = new Scanner(System.in);

	void Guess() {
		String name = "";
		int price = 0;
		int num = (int) (1 + Math.random() * 5);
		switch (num) {
		case 1:
			name = "电视机";
			price = 4500;
			break;
		case 2:
			name = "电冰箱";
			price = 3000;
			break;

		case 3:
			name = "电动车";
			price = 2000;
			break;

		case 4:
			name = "笔记本";
			price = 4800;
			break;

		case 5:
			name = "洗衣机";
			price = 1000;
			break;

		}
		System.out.print("请猜测" + name + "的价格：");
		for (int i = 4; i >= 0; i--) {
			int money = input.nextInt();
			if (i == 0) {
				System.out.println("4次内没有猜对，下次努力吧！");
				break;
			}
			if (money == price) {
				System.out.println("恭喜您获得" + name);
				break;
			} else if (money > price) {
				System.out.println("大了点，再来！");
				System.out.print("再猜一次吧：");
			} else if (money < price) {
				System.out.println("小了点，再来！");
				System.out.print("再猜一次吧：");

			}
			
		}

	}
}

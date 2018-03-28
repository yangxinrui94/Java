import java.util.Scanner;

public class Game {
	Scanner input = new Scanner(System.in);
	Person person = new Person();
	Computer computer = new Computer();
	int count = 0;

	void Start() {
		System.out.println("-----------欢迎进入游戏世界-----------");
		System.out.println("\t******************");
		System.out.println("\t**    猜拳，开始          **");
		System.out.println("\t******************");
		System.out.println("\n出拳规则：1.剪刀 2.石头 3.布");
		System.out.print("请选择对方角色：(1.刘备 2.孙权 3.曹操):");
		int num = input.nextInt();
		System.out.print("请输入您的名字：");
		person.name = input.next();
		switch (num) {
		case 1:
			computer.name = "刘备";
			break;
		case 2:
			computer.name = "孙权";
			break;
		case 3:
			computer.name = "曹操";
			break;
		}
		System.out.println(computer.name + " VS " + person.name + "\n");
		System.out.println("要开始了吗？(y/n)");
		String answer = input.next();
		int perNum;
		int comNum;
		while (answer.equals("y")) {
			perNum = person.showFist();
			comNum = computer.showFist();
			if (perNum == comNum) {
				System.out.println("结果：平局，真衰！\n");
				count++;
			} else if (perNum == 1 && comNum == 2 || perNum == 2 && comNum == 3
					|| perNum == 3 && comNum == 1) {
				System.out.println("结果：^_^，你输了，真笨！\n");
				computer.score++;
				count++;
			} else {
				System.out.println("结果：恭喜，你赢了！");
				person.score++;
				count++;
			}
			System.out.println("是否开始下一轮?(y/n)");
			answer = input.next();
		}
		System.out.println("---------------------------------");
		System.out.println(computer.name + " VS " + person.name);
		System.out.println("对战次数：" + count);
		System.out.println(computer.score + "    " + person.score);
		if (computer.score > person.score) {
			System.out.println("辣鸡，你输了！！！");
		} else if (computer.score == person.score) {
			System.out.println("平局，有本事再来！！！");
		} else {
			System.out.println("你小子还很厉害嘛，恭喜你，你赢了！！！");
		}
	}

}

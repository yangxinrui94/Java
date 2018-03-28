public class Computer {
	String name;
	int score = 0;

	int showFist() {
		int num = (int) (1 + Math.random() * 3);
		switch (num) {
		case 1:
			System.out.println(name+"出拳: 剪刀");
			break;
		case 2:
			System.out.println(name+"出拳: 石头");
			break;
		case 3:
			System.out.println(name+"出拳: 布");
			break;
		default:
			System.out.println("输入有误，请重新输入：");
		}
		return num;

	}
}

public class Computer {
	String name;
	int score = 0;

	int showFist() {
		int num = (int) (1 + Math.random() * 3);
		switch (num) {
		case 1:
			System.out.println(name+"��ȭ: ����");
			break;
		case 2:
			System.out.println(name+"��ȭ: ʯͷ");
			break;
		case 3:
			System.out.println(name+"��ȭ: ��");
			break;
		default:
			System.out.println("�����������������룺");
		}
		return num;

	}
}

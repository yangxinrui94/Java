import java.util.Scanner;

public class T5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����λ����");
		int num = input.nextInt();
		int gewei = num % 10;
		int shiwei = num / 10 % 10;
		int baiwei = num / 100;
		if (num == gewei * gewei * gewei + shiwei * shiwei * shiwei + baiwei
				* baiwei * baiwei) {
			System.out.println(num + "��ˮ�ɻ���");

		} else {
			System.out.println(num + "����ˮ�ɻ���");
		}
	}
}

import java.util.Scanner;

public class �����4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 0, b = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.println("�������" + i + "���༶����ѧԱ�ĳɼ���");
			System.out.println("������4��ѧԱ�ĳɼ���");
			for (int j = 1; j <= 4; j++) {
				int score = input.nextInt();
				if (score > 85) {
					a++;
					b = b + score;
				}
			}
		}
		System.out.println("3�������Բ���ѧԱ�гɼ�����85�ֵ�ѧԱ��ƽ����Ϊ��" + b / a);
	}
}

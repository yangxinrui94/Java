import java.util.Scanner;

public class �ϻ���ϰ2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] pays = new double[5];
		double a = 0.0;
		System.out.println("�������Ա���µ����Ѽ�¼");
		for (int i = 0; i < pays.length; i++) {
			System.out.print("�������" + (i + 1) + "�ʹ����");
			pays[i] = input.nextDouble();
			a = a + pays[i];
		}
		System.out.println("���\t\t���(Ԫ)");

		for (int j = 0; j < pays.length; j++) {
			System.out.println((j + 1) + "\t\t" + pays[j] + "");

		}
		System.out.println("�ܽ��\t\t" + a);
	}
}

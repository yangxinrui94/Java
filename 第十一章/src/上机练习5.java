import java.util.Scanner;

public class �ϻ���ϰ5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Customer a = new Customer();
		System.out.print("�����뿨���ͣ�");
		a.card = input.next();
		System.out.print("��������֣�");
		a.score = input.nextInt();
		if ((a.card.equals("��") && a.score >= 1000)
				|| (a.card.equals("�տ�") && a.score >= 5000)) {
			System.out.println("���֣�" + a.score + "�����ͣ�" + a.card
					+ "\n��������500�֣�");
		} else {
			System.out.println("лл�ݹˣ�");
		}
	}
}

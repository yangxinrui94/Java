import java.util.Scanner;

public class �ϻ���ϰ3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ  > �������");
		System.out.println("\n*****************************************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T ��\t2.����Ь\t3.������");
		System.out.println("\n*****************************************");
		double money = 0, tatal = 0, payment = 0,c=0;
		int No = 0,amount = 0;
		String answer = "y";
		do {
			System.out.print("��������Ʒ��ţ�");
			No = input.nextInt();
			switch (No) {			
				case 1:
				System.out.print("�����빺��������");
				amount = input.nextInt();
				 c = 245 * amount;
				System.out.println("T����245.0"+"\t\t"+"����:" + amount + "\t" + "�ϼ�:" + c);
				tatal = tatal + c;
				break;
				case 2:
				System.out.print("�����빺��������");
				amount = input.nextInt();
				 c = 570 * amount;
				System.out.println("����Ь��570.0"+"\t\t"+"����:" + amount + "\t" + "�ϼ�:" + c);
				tatal = tatal + c;
				break;
				case 3:
				System.out.print("�����빺��������");
				amount = input.nextInt();
				 c = 320 * amount;
				System.out.println("�����ģ�320.0"+"\t\t"+"����:" + amount + "\t" + "�ϼ�:" + c);
				tatal = tatal + c;
				break;
			default:
				System.out.println("�޴���Ʒ");
				break;
			}
			System.out.print("�Ƿ����(y/n)");
			answer = input.next();			
		} while (answer.equals("y"));

		payment = tatal * 0.8;

		System.out.println("�ۿۣ�0.8");
		System.out.println("Ӧ����" + payment);
		System.out.print("ʵ����");
		money = input.nextDouble();
		System.out.println("��Ǯ��" + (money - payment));

	}
	
}

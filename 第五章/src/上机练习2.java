import java.util.Scanner;


public class �ϻ���ϰ2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ  > �������");
		System.out.println("\n*****************************************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T ��\t2.����Ь\t3.������");
		System.out.println("\n*****************************************");
		String name = "";
		double price = 0.0;
		int No = 0;
		String answer = "y";
		while ("y".equals(answer)) {
			System.out.println("��������Ʒ��ţ�");
			No =input.nextInt();
			switch (No) {
			case 1:
				name = "T ��";
				price = 245;
				break;
			case 2:
				name = "����Ь";
				price = 570;
				break;
			case 3:
				name = "������";
				price = 320;
				break;

		
			}
			System.out.println(name+"\t"+"��"+price);
			System.out.println("�Ƿ����(y/n)");
			answer = input.next();
			
		}
		System.out.println("�������");
	}
	
}

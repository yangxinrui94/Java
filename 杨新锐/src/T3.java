import java.util.Scanner;


public class T3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������ڼ���");
		int day =input.nextInt();
		switch (day) {
		case 1:
		case 2:
		case 3:
			System.out.println("�ཷ��˿");
			
			break;
		
		case 4:
		case 5:
			System.out.println("��������");
			break;
		case 6:
			System.out.println("ǧ�ų���");
			break;
		case 7:
			System.out.println("����ȫϯ");
			break;
			default:
			System.out.println("�����������������");
			break;
		}
	}
		
}

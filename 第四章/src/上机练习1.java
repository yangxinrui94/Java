import java.util.Scanner;


public class �ϻ���ϰ1 {
	public static void main(String[] args) {
		System.out.println("\n\t\t��ӭʹ���������ع������ϵͳ1.0��\n");
		System.out.println("\t\t\t 1.�� ¼ ϵ ͳ\n");
		System.out.println("\t\t\t 2.�� ��\n");
		System.out.println("* * * * * * * * *  * * * * * * * * * * * * * * * *\n");
		System.out.println("��ѡ���������֣�");
		Scanner input = new Scanner(System.in);
		int num =input.nextInt();
		switch (num) {
		case 1:
			System.out.println("\n\t\t��ӭʹ���������ع������ϵͳ\n");
			System.out.println("* * * * * * * * *  * * * * * * * * * * * *\n");
			System.out.println("\t\t\t 1.�� �� �� Ϣ �� ��\n");
			System.out.println("\t\t\t 2.�� �� �� ��\n");
			System.out.println("\t\t\t 3.�� �� �� ��\n");
			System.out.println("\t\t\t 4.ע ��\n");
			System.out.println("* * * * * * * * *  * * * * * * * * * * * *\n");
			System.out.println("��ѡ���������֣�");
			break;
		case 2:
			System.out.println("лл����ʹ��");
			break;
		default:
			System.out.println("�������");
			break;
		}
		
	}
}

import java.util.Scanner;


public class �ϻ���ϰ1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int No=0;
		String a = "";
		System.out.println("��ӭ��������������Ϸƽ̨\n");
		System.out.println("��ѡ����ϲ������Ϸ��\n");
		System.out.println("**********************************");
		System.out.println("\t1.������");
		System.out.println("\t2.��ţ");
		System.out.println("\t3.������");
		System.out.println("\t4.������");
		System.out.println("\n**********************************");
		System.out.print("��ѡ���������֣�");
		No = input.nextInt();
		switch (No) {
		case 1:
			a="������";			
			break;
		case 2:
			a="��ţ";			
			break;
		case 3:
			a="������";			
			break;
		case 4:
			a="������";			
			break;
			
		default:
			System.out.println("����������������룡");
			break;
		}
		System.out.println("��ӭ����"+a+"���䣡");
	}
}

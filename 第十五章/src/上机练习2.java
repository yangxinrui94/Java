import java.util.Scanner;


public class �ϻ���ϰ2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("***��ӭ����ע��ϵͳ***\n\n");
		while (true) {
		System.out.print("���������֤�ţ�");
		String ID = input.next();
		System.out.print("�������ֻ��ţ�");
		String PN = input.next();
		System.out.print("���ٴ����������ţ�");
		String N = input.next();
		if (ID.length()!=16 && ID.length()!=18) {
			System.out.println("���֤�ű�����16λ����18λ��");
		}else if (PN.length()!=11) {
			System.out.println("�ֻ��ű�����11λ��");
		}else if (N.indexOf("-")!=4 && N.length()!=12) {
			System.out.println("�����������ű���Ϊ4λ���绰���������7λ��");
		}else {
			System.out.println("ע��ɹ���");
			break;
		}

		}
	}
}

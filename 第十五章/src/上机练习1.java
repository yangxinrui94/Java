import java.util.Scanner;

public class �ϻ���ϰ1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("***��ӭ����ע��ϵͳ***\n\n");
		while (true) {
			System.out.print("�������û���");
			String name = input.next();
			System.out.print("���������룺");
			String pwd1 = input.next();
			System.out.print("���ٴ��������룺");
			String pwd2 = input.next();
			if (name.length() < 3 && pwd1.length() < 6) {
				System.out.println("�û������Ȳ���С��3�����볤�Ȳ���С��6��");
			} else if (name.length() < 3) {
				System.out.println("�û������Ȳ���С��3");
			} else if (pwd1.length() < 6) {
				System.out.println("���볤�Ȳ���С��6��");
			} else if (!(pwd1.equalsIgnoreCase(pwd2))) {
				System.out.println("�����������벻��ͬ");
			} else {
				System.out.println("ע��ɹ������μ��û��������롣");
				break;
			}
		}

	}
}

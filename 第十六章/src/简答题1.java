import java.util.Scanner;

public class �����1 {
	static boolean login(String name, String pwd) {
		if (name.equalsIgnoreCase("jbit") && pwd.equalsIgnoreCase("bdqn")) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������û�����");
		String name = input.next();
		System.out.println("���������룺");
		String pwd = input.next();
		if (login(name, pwd)) {
			System.out.println("��¼�ɹ���");
		} else {
			System.out.println("�û����������������");
		}
	}
}

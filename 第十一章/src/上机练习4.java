import java.util.Scanner;

public class �ϻ���ϰ4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Administrator admin = new Administrator();
		admin.name = "admin";
		admin.password = "111111";
		System.out.print("�������û�����");
		String nameInput = input.next();
		System.out.print("���������룺");
		String passwordInput = input.next();
		if (admin.name.equals(nameInput)
				&& admin.password.equals(passwordInput)) {
			System.out.print("�����������룺");
			admin.password = input.next();
			System.out.println("�����޸ĳɹ�������������Ϊ��" + admin.password);

		} else {
			System.out.println("�û��������벻ƥ�䣡��û��Ȩ���޸Ĺ���Ա��Ϣ��");
		}
	}
}

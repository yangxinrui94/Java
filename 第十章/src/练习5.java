import java.util.Scanner;

public class ��ϰ5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "y";
		String name = "", name1 = "";
		String password = "", password1 = "";
		int cardNum1 = (int) (1000 + Math.random() * 9000);
		int[] arr = new int[5];
		while (answer.equals("y")) {
			System.out.println("*****��ӭ���뽱�͸���ϵͳ*****");
			System.out.println("\t\t1.ע��");
			System.out.println("\t\t2.��¼");
			System.out.println("\t\t3.�齱");
			System.out.println("************************");
			System.out.print("��ѡ��˵���");
			int num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("[���͸���ϵͳ>ע��]");
				System.out.println("����д����ע����Ϣ��");
				System.out.print("�û�����");
				name = input.next();
				System.out.print("���룺");
				password = input.next();
				System.out.println("\nע��ɹ�����Ǻ����Ļ�Ա����");
				System.out.println("�û���\t����\t��Ա����");
				System.out.println(name + "\t" + password + "\t" + cardNum1);
				break;
			case 2:
				for (int i = 2; i >= 0; i--) {
					System.out.println("[���͸���ϵͳ>��¼]");
					System.out.print("�������û�����");
					name1 = input.next();
					System.out.print("���������룺");
					password1 = input.next();
					if (name.equals(name1) && password.equals(password1)) {
						System.out.println("��ӭ����" + name);
						break;
					} else {
						System.out.println("�û�����������󣡻�ʣ��" + i + "�λ���");
					}

				}

				break;
			case 3:
				System.out.println("[���͸���ϵͳ>�齱]");
				boolean flag = false;
				System.out.print("���������Ŀ��ţ�");
				cardNum1 = input.nextInt();
				System.out.println("\n���յ���������Ϊ��");
				for (int i = 0; i < arr.length; i++) {
					arr[i] = (int) (1000 + Math.random() * 9000);
					System.out.print(arr[i] + "\t");
					if (arr[i] == cardNum1) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("\n��ϲ���ǽ�������˻�Ա��");
				} else {
					System.out.println("\n��Ǹ�������ǽ�������˻�Ա��");
				}
				break;

			}
			System.out.print("������?(y/n)");
			answer = input.next();

		}
		System.out.println("ϵͳ�˳���ллʹ�ã�");
	}
}

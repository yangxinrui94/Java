import java.util.Scanner;


public class StartSMS {
	Scanner input = new Scanner(System.in);

	void LoginMenu() {
		System.out.println("\n\t��ӭʹ���������ع������ϵͳ\n");
		System.out.println("\t\t 1. �� ¼ ϵ ͳ\n");
		System.out.println("\t\t 2. �� ��\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("��ѡ����������:");
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.print("�������û�����");
			String name = input.next();
			System.out.print("���������룺");
			String pwd = input.next();
			if (name.equalsIgnoreCase("JadeBird") && pwd.equals("0000")) {
			System.out.println("@@��¼�ɹ���"+name+"@@");
			MainMenu() ;
			}else {
			System.out.println("@@��û��Ȩ�޽���ϵͳ�������µ�¼��@@");
			LoginMenu();
			}
			break;
		case 2:
			System.out.println("�˳���ллʹ�ã�");
			break;
		default:
			System.out.println("�����������������룡");
			LoginMenu();
			break;
		}
	}

	void MainMenu() {
		System.out.println("\n\t�������ع������ϵͳ���˵�\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t 1. �� �� �� Ϣ �� ��\n");
		System.out.println("\t\t 2. �� �� �� ��\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("��ѡ���������ֻ�0������һ���˵�:");
		int num = input.nextInt();
		switch (num) {
		case 1:
			CustMenu();
			break;
		case 2:
			SendGMenu();
			break;
		case 0:
			LoginMenu();
			break;
		default:
			System.out.println("�����������������룡");
			MainMenu();
			break;
		}
	}

	void CustMenu() {
		System.out.println("\n\t�������ع������ϵͳ > �ͻ���Ϣ����");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t 1. �� ʾ �� �� �� �� �� Ϣ\n");
		System.out.println("\t\t 2. �� �� �� �� �� Ϣ\n");
		System.out.println("\t\t 3. �� �� �� �� �� Ϣ\n");
		System.out.println("\t\t 4. �� ѯ �� �� �� Ϣ\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("��ѡ���������ֻ�0������һ���˵�:");
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.println("ִ������ ʾ �� �� �� �� �� Ϣ");
			break;
		case 2:
			System.out.println("ִ������ �� �� �� �� Ϣ");
			break;
		case 3:
			System.out.println("ִ������ �� �� �� �� Ϣ");
			break;
		case 4:
			System.out.println("ִ���˲� ѯ �� �� �� Ϣ");
			break;
		case 0:
			MainMenu();
			break;
		default:
			System.out.println("�����������������룡");
			CustMenu();
			break;
		}
	}

	void SendGMenu() {
		System.out.println("\n\t�������ع������ϵͳ > �������");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t 1. �� �� �� �� ��\n");
		System.out.println("\t\t 2. �� �� �� ��\n");
		System.out.println("\t\t 3. �� �� �� ��\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.println("ִ���� �� �� �� �� ��");
			break;
		case 2:
			System.out.println("ִ������ �� �� ��");
			break;
		case 3:
			System.out.println("ִ������ �� �� ��");
			break;
		case 0:
			MainMenu();
			break;
		default:
			System.out.println("�����������������룡");
			SendGMenu();
			break;
		}
	}
}

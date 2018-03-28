import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DVDMgr {
	public long charge(String dstr1, String dstr2) {
		long charge = 0;
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d1 = sd.parse(dstr1);
			Date d2 = sd.parse(dstr2);
			charge = (d2.getTime() - d1.getTime()) / (24 * 60 * 60 * 1000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return charge;
	}

	Scanner input = new Scanner(System.in);
	DVDSet dvd = new DVDSet();

	void initial() {

		dvd.name[0] = "�������";
		dvd.state[0] = 0;
		dvd.date[0] = "2013-7-1";
		dvd.name[1] = "�������";
		dvd.state[1] = 1;
		dvd.name[2] = "��������";
		dvd.state[2] = 1;
	}

	void add() {
		System.out.print("������DVD���ƣ�");
		String newName = input.next();
		for (int i = 0; i < dvd.name.length; i++) {
			if (dvd.name[i] == null) {
				dvd.name[i] = newName;
				dvd.state[i] = 1;
				break;
			}
		}
		System.out.println("������" + newName + "���ɹ���");
	}

	void search() {
		for (int i = 0; i < dvd.name.length; i++) {
			if (dvd.name[i] == null) {
				break;
			} else if (dvd.state[i] == 0) {
				System.out.println((i + 1) + "\t�ѽ��\t" + "��" + dvd.name[i]
						+ "��\t" + dvd.date[i]);
			} else if (dvd.state[i] == 1) {
				System.out.println((i + 1) + "\t�ɽ�\t" + "��" + dvd.name[i]
						+ "��\t" + dvd.date[i]);
			}
		}
	}

	void delete() {
		System.out.print("������Dvd�����ƣ�");
		String name = input.next();
		for (int i = 0; i < dvd.name.length; i++) {
			if (dvd.name[i] == null) {
				break;
			}
			if (dvd.name[i].equals(name)) {
				if (dvd.state[i] == 0) { // �ѽ��
					System.out.println("��" + name + "���ѽ����ɾ��ʧ�ܣ�");
				} else {
					while (dvd.name[i + 1] != null) {
						dvd.name[i] = dvd.name[i + 1];
						dvd.state[i] = dvd.state[i + 1];
						dvd.date[i] = dvd.date[i + 1];
						i++;
					}
					dvd.name[i] = null;
					dvd.state[i] = 0;
					System.out.println("ɾ���ɹ���");
				}
				return;
			}

		}
		System.out.println("��" + name + "�������ڣ�ɾ��ʧ�ܣ�");

	}

	void lend() {
		System.out.print("������DVD���ƣ�");
		String Lname = input.next();
		System.out.print("������������(��-��-��)��");
		String date = input.next();
		for (int i = 0; i < dvd.name.length; i++) {
			if (dvd.name[i] == null) {
				System.out.println("û���ҵ�ƥ����Ϣ��");
				break;
			} else if (dvd.name[i].equals(Lname) && dvd.state[i] == 1) {
				System.out.println("�����" + Lname + "���ɹ���");
				dvd.date[i] = date;
				dvd.state[i] = 0;
				break;

			} else if (dvd.name[i].equals(Lname) && dvd.state[i] == 0) {
				System.out.println("��" + Lname + "���ѽ��������");
				break;
			}
		}
	}

	void returnDvd() {
		System.out.print("������DVD���ƣ�");
		String Rname = input.next();
		System.out.print("������黹����(��-��-��)��");
		String Rdate = input.next();
		String a = "";
		for (int i = 0; i < dvd.name.length; i++) {
			if (dvd.name[i].equals(Rname)&&dvd.state[i]==0) {
				dvd.state[i]=1;
				a = dvd.date[i];
				dvd.date[i] = null;
				break;
			} else {
				System.out.println("�������");
				returnMain();
			}
		}
		System.out.println("�黹��" + Rname + "���ɹ���");
		System.out.println("�������Ϊ��" + a);
		System.out.println("�黹����Ϊ��" + Rdate);
		System.out.println("Ӧ�����(Ԫ)��" + charge(a, Rdate));
	}

	void returnMain() {
		System.out.print("����0���أ�");
		if (input.nextInt() == 0) {
			startMenu();
		} else {
			System.out.println("��������쳣��ֹ��");
		}
	}

	void startMenu() {
		System.out.println("��ӭʹ������DVD������");
		System.out.println("------------------------------------------\n");
		System.out.println("1.���� DVD");
		System.out.println("2.�鿴 DVD");
		System.out.println("3.ɾ�� DVD");
		System.out.println("4.��� DVD");
		System.out.println("5.�黹 DVD");
		System.out.println("6.��          ��");
		System.out.println("------------------------------------------\n");
		System.out.print("��ѡ��");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("--->����DVD\n");
			add();
			System.out.println("***************************");
			returnMain();
			break;
		case 2:
			System.out.println("--->�鿴 DVD\n");
			search();
			System.out.println("***************************");
			returnMain();
			break;
		case 3:
			System.out.println("--->ɾ�� DVD\n");
			delete();
			System.out.println("***************************");
			returnMain();
			break;
		case 4:
			System.out.println("--->��� DVD\n");
			lend();
			System.out.println("***************************");
			returnMain();
			break;
		case 5:
			System.out.println("--->�黹 DVD\n");
			returnDvd();
			System.out.println("***************************");
			returnMain();
			break;
		case 6:
			System.out.println("\nллʹ�ã�");
			break;
		}
	}
}

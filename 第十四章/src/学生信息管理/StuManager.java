package ѧ����Ϣ����;
import java.util.Scanner;


public class StuManager {
	Scanner input = new Scanner(System.in);
	Student[] ss = new Student[10];

	void addStu() {
		for (int i = 0; i < ss.length; i++) {
			ss[i] = new Student();
			System.out.print("�������" + (i + 1) + "λѧ����������");
			ss[i].name = input.next();
			System.out.print("�������" + (i + 1) + "λѧ���ĳɼ���");
			ss[i].score = input.nextInt();
		}
	}

	void show() {
		System.out.println("����ѧ����Ϣ���£�");
		System.out.println("ѧ��\t\t�ɼ�");
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i].name + "\t\t" + ss[i].score);
		}
	}

	void Max() {
		Student max = ss[0];
		for (int i = 0; i < ss.length; i++) {
			if (max.score < ss[i].score) {
				max = ss[i];
			}
		}
		System.out
				.println("\n" + "\"" + max.name + "\"" + "�ķ�����ߣ�" + max.score);
	}

	void Min() {
		Student min = ss[0];
		for (int i = 0; i < ss.length; i++) {
			if (min.score > ss[i].score) {
				min = ss[i];
			}
		}
		System.out.println("\"" + min.name + "\"" + "�ķ������" + min.score);
	}

	void Avg() {
		int sum = 0;
		for (int i = 0; i < ss.length; i++) {
			sum += ss[i].score;
		}
		System.out.println("ƽ����Ϊ��" + (sum / ss.length));
	}

	void getInfo(String name) {
		System.out.println("\"" + name + "\"" + "��ͬѧ���£�");
		for (int i = 0; i < ss.length; i++) {
			if (ss[i].name.indexOf(name) == 0) {
				System.out.print(ss[i].name + "\t");
			}
		}
	}
}

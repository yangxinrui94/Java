package 学生信息管理;
import java.util.Scanner;


public class StuManager {
	Scanner input = new Scanner(System.in);
	Student[] ss = new Student[10];

	void addStu() {
		for (int i = 0; i < ss.length; i++) {
			ss[i] = new Student();
			System.out.print("请输入第" + (i + 1) + "位学生的姓名：");
			ss[i].name = input.next();
			System.out.print("请输入第" + (i + 1) + "位学生的成绩：");
			ss[i].score = input.nextInt();
		}
	}

	void show() {
		System.out.println("所有学生信息如下：");
		System.out.println("学生\t\t成绩");
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
				.println("\n" + "\"" + max.name + "\"" + "的分数最高：" + max.score);
	}

	void Min() {
		Student min = ss[0];
		for (int i = 0; i < ss.length; i++) {
			if (min.score > ss[i].score) {
				min = ss[i];
			}
		}
		System.out.println("\"" + min.name + "\"" + "的分数最低" + min.score);
	}

	void Avg() {
		int sum = 0;
		for (int i = 0; i < ss.length; i++) {
			sum += ss[i].score;
		}
		System.out.println("平均分为：" + (sum / ss.length));
	}

	void getInfo(String name) {
		System.out.println("\"" + name + "\"" + "姓同学如下：");
		for (int i = 0; i < ss.length; i++) {
			if (ss[i].name.indexOf(name) == 0) {
				System.out.print(ss[i].name + "\t");
			}
		}
	}
}

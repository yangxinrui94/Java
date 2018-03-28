import java.util.Scanner;

public class 简答题4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 0, b = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.println("请输入第" + i + "个班级参赛学员的成绩：");
			System.out.println("请输入4名学员的成绩：");
			for (int j = 1; j <= 4; j++) {
				int score = input.nextInt();
				if (score > 85) {
					a++;
					b = b + score;
				}
			}
		}
		System.out.println("3个班所以参赛学员中成绩大于85分的学员的平均分为：" + b / a);
	}
}

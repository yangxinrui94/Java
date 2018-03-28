import java.util.Scanner;


public class 上机练习1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入4位学员的成绩");
		double score =0, a=0;
		for (int i = 1; i <5; i++) {
			System.out.print("第"+i+"位学员的成绩：");
			score = input.nextDouble();
			a+=score;
		}
		a= a/4;
		System.out.println("参赛学员的平均分是："+a);
	}
}

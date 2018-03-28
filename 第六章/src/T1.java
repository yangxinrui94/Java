import java.util.Scanner;


public class T1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入学生姓名：");
		String name = input.next();
		double score =0, a=0;
		for (int i = 1; i <=5; i++) {
			System.out.print("请输入5门功课中的第"+i+"门课的成绩：");
			score = input.nextDouble();
			a+=score;
		}
		a= a/5;
		System.out.println(name+"的平均分是："+a);
	}
	
}

import java.util.Scanner;


public class T2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入考试成绩：");
		double score = input.nextDouble();
		if (score>=90) {
			System.out.println("优秀");
			
		}else if (score>=80) {
			System.out.println("良好");
			
		}else if (score>=60) {
			System.out.println("中等");
			
		}else {
			System.out.println("差");
		}
	}
}

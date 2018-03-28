import java.util.Scanner;

public class zuoye5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入成绩：");
		int score = input.nextInt();
		
		if (score==100) {
			System.out.println("奖励一辆车劳斯莱斯幻影");
		}else if (score>=90) {
			System.out.println("奖励笔记本电脑");
		}else if (score>=60) {
			System.out.println("奖励手机");
		}else{
			System.out.println("神马都木有...");
		}
	}
}

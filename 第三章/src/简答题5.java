import java.util.Scanner;


public class 简答题5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("考试成绩：");
		double score = input.nextDouble();
		if (score==100) {
			System.out.println("父亲给她买一辆车");
		}else if (score>=90) {
			System.out.println("母亲给她买一部笔记本电脑");
		}else if (score>=60) {
			System.out.println("母亲给她买一部手机");
		}else {
			System.out.println("没有礼物");
			
		}
			
	}
					
			
}
	


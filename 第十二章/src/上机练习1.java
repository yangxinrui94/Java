import java.util.Scanner;


public class 上机练习1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ScoreCalc a = new ScoreCalc();
		System.out.print("请输入Java成绩：");
		int java = input.nextInt();
		System.out.print("请输入C#成绩：");
		int c = input.nextInt();
		System.out.print("请输入DB成绩：");
		int db = input.nextInt();
		a.totalScore(java, c, db);
		
	}
}

import java.util.Scanner;


public class �ϻ���ϰ1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ScoreCalc a = new ScoreCalc();
		System.out.print("������Java�ɼ���");
		int java = input.nextInt();
		System.out.print("������C#�ɼ���");
		int c = input.nextInt();
		System.out.print("������DB�ɼ���");
		int db = input.nextInt();
		a.totalScore(java, c, db);
		
	}
}

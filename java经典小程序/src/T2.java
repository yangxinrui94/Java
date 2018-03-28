import java.util.Scanner;

public class T2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入分数：");
		double score = input.nextDouble();
		if (score > 90) {
			System.out.println("A级");
		} else if (score >= 80) {
			System.out.println("B级");
		} else if (score >= 70) {
			System.out.println("C级");
		} else if (score >= 60) {
			System.out.println("D级");
		} else {
			System.out.println("E级");
		}
	}
}

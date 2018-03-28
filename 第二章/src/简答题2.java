import java.util.Scanner;


public class 简答题2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入华氏温度：");
		double f =input.nextDouble();
		double c;
		c=5/9.0*(f-32);
		System.out.println("华氏温度"+f+"度，摄氏温度"+c+"度");
	}

}

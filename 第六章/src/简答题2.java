import java.util.Scanner;


public class 简答题2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double hour = 0,a = 0;
		for (int i =1 ; i <=5; i++) {
			System.out.print("请输入周"+i+"的学习时间：");
			hour = input.nextDouble();
			a = a + hour;
		}
		 a = a/5;
		 System.out.println("周一至周五每日平均学习时间是："+a+"小时");
	}
}

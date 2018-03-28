import java.util.Scanner;


public class 简答题3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入本金：");
		double money = input.nextDouble();
		double one = money*0.0225+money;
		double two = money*0.027*2+money;
		double three = money*0.0324*3+money;
		double five = money*0.036*5+money;
		System.out.println("本金为："+money);
		System.out.println("\n存取一年后的本息是："+one);
		System.out.println("\n存取两年后的本息是："+two);
		System.out.println("\n存取三年后的本息是："+three);
		System.out.println("\n存取五年后的本息是："+five);
	}

}

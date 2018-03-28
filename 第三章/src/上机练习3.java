import java.util.Scanner;


public class 上机练习3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入是否是会员：是(y)/否(其他字符)");
		String identity = input.next();
		System.out.println("请输入金额：");
		double money = input.nextDouble();
		if(identity.equals("y")) { 
			if(money>200) {
				money = money * 0.75;				
			}else {
				money = money * 0.8;
			}
		}else {
			if(money>100) {
				money = money * 0.9;
			}
		}
	    System.out.println("实际支付："+money);
	}

}

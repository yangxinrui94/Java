import java.util.Scanner;


public class 上机练习3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("MyShopping管理系统 > 客户信息管理  > 添加客户信息\n");
		int No = 0, points = 0;
		String birthday;
		for (int i = 0; i < 3; i++) {
			System.out.print("请输入会员号(<4位整数>)：");
			No = input.nextInt();
			System.out.print("请输入会员生日(月/日<用两位整数表示>)：");
			birthday = input.next();
			System.out.print("请输入会员积分：");
			points = input.nextInt();
			if (No < 1000 || No > 9999) {
				System.out.println("客户号"+No+"是无效会员号！");
				System.out.println("录入会员信息失败\n");
				continue;
			}
			System.out.println("您录入的会员信息是：");
			System.out.println(No+"\t"+birthday+"\t"+points+"\n");
			
		}
		System.out.println("程序结束！");
	}
	
}

import java.util.Scanner;

public class 上机练习3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("MyShopping管理系统  > 购物结算");
		System.out.println("\n*****************************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T 恤\t2.网球鞋\t3.网球拍");
		System.out.println("\n*****************************************");
		double money = 0, tatal = 0, payment = 0,c=0;
		int No = 0,amount = 0;
		String answer = "y";
		do {
			System.out.print("请输入商品编号：");
			No = input.nextInt();
			switch (No) {			
				case 1:
				System.out.print("请输入购买数量：");
				amount = input.nextInt();
				 c = 245 * amount;
				System.out.println("T恤￥245.0"+"\t\t"+"数量:" + amount + "\t" + "合计:" + c);
				tatal = tatal + c;
				break;
				case 2:
				System.out.print("请输入购买数量：");
				amount = input.nextInt();
				 c = 570 * amount;
				System.out.println("网球鞋￥570.0"+"\t\t"+"数量:" + amount + "\t" + "合计:" + c);
				tatal = tatal + c;
				break;
				case 3:
				System.out.print("请输入购买数量：");
				amount = input.nextInt();
				 c = 320 * amount;
				System.out.println("网球拍￥320.0"+"\t\t"+"数量:" + amount + "\t" + "合计:" + c);
				tatal = tatal + c;
				break;
			default:
				System.out.println("无此商品");
				break;
			}
			System.out.print("是否继续(y/n)");
			answer = input.next();			
		} while (answer.equals("y"));

		payment = tatal * 0.8;

		System.out.println("折扣：0.8");
		System.out.println("应付金额：" + payment);
		System.out.print("实付金额：");
		money = input.nextDouble();
		System.out.println("找钱：" + (money - payment));

	}
	
}

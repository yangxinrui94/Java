import java.util.Scanner;


public class 上机练习2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("MyShopping管理系统  > 购物结算");
		System.out.println("\n*****************************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T 恤\t2.网球鞋\t3.网球拍");
		System.out.println("\n*****************************************");
		String name = "";
		double price = 0.0;
		int No = 0;
		String answer = "y";
		while ("y".equals(answer)) {
			System.out.println("请输入商品编号：");
			No =input.nextInt();
			switch (No) {
			case 1:
				name = "T 恤";
				price = 245;
				break;
			case 2:
				name = "网球鞋";
				price = 570;
				break;
			case 3:
				name = "网球拍";
				price = 320;
				break;

		
			}
			System.out.println(name+"\t"+"￥"+price);
			System.out.println("是否继续(y/n)");
			answer = input.next();
			
		}
		System.out.println("程序结束");
	}
	
}

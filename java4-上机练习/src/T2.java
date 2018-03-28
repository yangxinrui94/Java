import java.util.Scanner;


public class T2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入消费金额：");
		int money = input.nextInt();
		
		System.out.println("是否参加优惠换购活动：");
		System.out.println("1：满50元，加2元换购百事可乐饮料1瓶");
		System.out.println("2：满100元，加3元换购500ml可乐一瓶");
		System.out.println("3：满100元，加10元换购5公斤面粉");
		System.out.println("4：满200元，加10元可换购1个苏泊尔炒菜锅");
		System.out.println("5：满200元，加20元可换购欧莱雅爽肤水一瓶");
		System.out.println("0：不换购");
		System.out.print("请选择：");
		int num = input.nextInt();
		
		int a=0,b=0; //a保存需要达到的金额    b需要增加的金额
		String c=""; //c换购的物品
		switch (num) {
		case 1:
			a=50; b=2; c="百事可乐饮料1瓶";
			break;
		case 2:
			a=100; b=3; c="500ml可乐一瓶";
			break;
		case 3:
			a=100; b=10; c="5公斤面粉";
			break;
		case 4:
			a=200; b=10; c="1个苏泊尔炒菜锅";
			break;
		case 5:
			a=200; b=20; c="欧莱雅爽肤水一瓶";
			break;
		default:
			break;
		}
		
		if (money>=a) {
			System.out.println("本次消费总金额：" + (money+b));
			System.out.println("成功换购：" + c);
		}else{
			System.out.println("金额不足，不能换购！");
		}
	}
}

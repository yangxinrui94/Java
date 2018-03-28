import java.util.Scanner;


public class 上机练习3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "";
		int hour=0; 
		double price=0.0;
		System.out.println("青鸟迷你游戏平台> 游戏币支付\n");
		System.out.println("请选择您玩的游戏类型：");		
		System.out.println("\t1.牌类");
		System.out.println("\t2.休闲竞技类");
		int No = input.nextInt();
		System.out.println("请输入游戏时长：");
		hour = input.nextInt();
		switch (No) {
		case 1:
			name ="牌类";
			price =10;
			break;
		case 2:
			name ="休闲竞技类";
			price =20;
			break;			
		default:
			System.out.println("输入有误，请重新输入！");
		
			return;
		}
		if (hour >= 10) {
			System.out.println("您玩的游戏是"+name+"，时长是："+hour+"可以享受五折优惠");
			System.out.println("您需要支付"+(price*hour*0.5)+"个游戏币");
			
		}else {
			System.out.println("您玩的游戏是"+name+"，时长是："+hour+"可以享受八折优惠");
			System.out.println("您需要支付"+(price*hour*0.8)+"个游戏币");
			
		}
		
	}
}

import java.util.Scanner;


public class 上机练习1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int No=0;
		String a = "";
		System.out.println("欢迎进入青鸟迷你游戏平台\n");
		System.out.println("请选择您喜爱的游戏：\n");
		System.out.println("**********************************");
		System.out.println("\t1.斗地主");
		System.out.println("\t2.斗牛");
		System.out.println("\t3.泡泡龙");
		System.out.println("\t4.连连看");
		System.out.println("\n**********************************");
		System.out.print("请选择，输入数字：");
		No = input.nextInt();
		switch (No) {
		case 1:
			a="斗地主";			
			break;
		case 2:
			a="斗牛";			
			break;
		case 3:
			a="泡泡龙";			
			break;
		case 4:
			a="连连看";			
			break;
			
		default:
			System.out.println("输入错误，请重新输入！");
			break;
		}
		System.out.println("欢迎进入"+a+"房间！");
	}
}

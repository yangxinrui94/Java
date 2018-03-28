import java.util.Scanner;


public class 上机练习5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("青鸟迷你游戏平台> 添加用户信息\n");
		System.out.println("请输入要录入的用户数量：");
		int count = input.nextInt();
		for (int i = 0; i < count; i++) {
			System.out.print("请输入用户编号(<4位整数>)：");
			int num =input.nextInt();
			System.out.print("请输入用户年龄：");
			int age =input.nextInt();
			if (age<10) {
				System.out.println("很抱歉，您的年龄不适宜玩游戏");
				System.out.println("录入信息失败");
				continue;
				
			}
			System.out.print("请输入会员积分：");
			int score = input.nextInt();
			System.out.println("您录入的会员信息是：");
			System.out.println("用户编号："+num+"\t年龄"+age+"\t积分："+score);
			
			
			
		}
		
	}
}

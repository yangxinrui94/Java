import java.util.Scanner;


public class 上机练习4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name ="";
		int password ;	
		for (int i = 2; i >= 0; i--) {
			System.out.print("请输入用户名：");
			name = input.next();
			System.out.print("请输入密码：");
			password = input.nextInt();
			if (password==123456 && name.equals("jim")) {
				System.out.println("欢迎进入MyShopping系统！");
			break;

			}else {
				System.out.println("输入错误！您还有"+i+"次机会！");
			}
				if(i==0) {
				System.out.println("\n对不起，您3次错误均输入错误！");
			}
			
		}
	
	}
}

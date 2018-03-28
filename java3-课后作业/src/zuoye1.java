import java.util.Scanner;


public class zuoye1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("请输入姓名：");
		char name = input.next().charAt(0);
		System.out.print("请输入密码：");
		String pwd = input.next();
		
		if (name=='青' && pwd.equals("123")) {
			System.out.println("欢迎您，青");
		}else{
			System.out.println("对不起，您不是青");
		}
	}
}

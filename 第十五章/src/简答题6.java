import java.util.Scanner;


public class 简答题6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
		System.out.print("请输入会员生日<月/日：00/00>");
		String birth = input.next();
		if (birth.indexOf("/")!=2 && birth.length()!=5) {
			System.out.println("生日形式输入错误!\n");
		}else {
			System.out.println("该会员生日是："+birth+"\n");
			break;
		}	
		}
		while (true) {
			System.out.print("请输入会员密码<6~10位>：");
			String pwd = input.next();
			if (pwd.length()<6 || pwd.length()>10) {
				System.out.println("密码形式输入错误！"+"\n");
			}else {
				System.out.println("该会员的密码是："+pwd+"\n");
				break;
			}
		}
	}
}

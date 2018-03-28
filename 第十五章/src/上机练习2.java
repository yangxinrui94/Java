import java.util.Scanner;


public class 上机练习2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("***欢迎进入注册系统***\n\n");
		while (true) {
		System.out.print("请输入身份证号：");
		String ID = input.next();
		System.out.print("请输入手机号：");
		String PN = input.next();
		System.out.print("请再次输入座机号：");
		String N = input.next();
		if (ID.length()!=16 && ID.length()!=18) {
			System.out.println("身份证号必须是16位或者18位！");
		}else if (PN.length()!=11) {
			System.out.println("手机号必须是11位！");
		}else if (N.indexOf("-")!=4 && N.length()!=12) {
			System.out.println("座机号码区号必须为4位，电话号码必须是7位！");
		}else {
			System.out.println("注册成功！");
			break;
		}

		}
	}
}

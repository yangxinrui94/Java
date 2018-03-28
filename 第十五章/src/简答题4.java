import java.util.Scanner;


public class 简答题4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入用户的身份证号码：");
		String ID = input.next();
		String a = ID.substring(6,10);
		String b = ID.substring(10,12);
		String c = ID.substring(12,14);
		System.out.println("该用户生日是："+a+"年"+b+"月"+c+"日");
	}
}

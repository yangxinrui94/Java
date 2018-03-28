import java.util.Scanner;


public class 简答题3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个姓名：");
		String name = input.next();
		String a = name.substring(0,1);
		String b = name.substring(1);
		System.out.println("\n姓氏：  "+a);
		System.out.println("名字  "+b);
	}
}

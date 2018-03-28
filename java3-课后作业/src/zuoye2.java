import java.util.Scanner;


public class zuoye2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("请输入年龄：");
		int age = input.nextInt();
		System.out.print("请输入性别：");
		String sex = input.next();
		//满7岁，或者满5岁并且男生，可以搬桌子
		if (age>=7 || (age>=5 && sex.equals("男"))) {
			System.out.println("可以搬动桌子");
		}else{
			System.out.println("太弱了...");
		}
		
	}
}

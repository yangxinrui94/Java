import java.util.Scanner;


public class zuoye4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("请输入一个整数：");
		int num = input.nextInt();
		//判断，能被3整除，或者能被5整除
		if (num%3==0 || num%5==0) {
			System.out.println("能被3或5整除");
		}else{
			System.out.println("不能");
		}
	}
}

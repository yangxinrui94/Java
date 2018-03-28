import java.util.Scanner;



public class 简答题1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名：");
		char name =input.next().charAt(0);
		System.out.println("请输入密码：");
		int password=input.nextInt();
		if (name=='青' && password==123 ){
			System.out.println("欢迎你，青！");
		}else {
			System.out.println("对不起，你不是青");
				
			}
			
		}
			
			
}		
		
	



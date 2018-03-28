import java.util.Scanner;


public class 上机练习4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎使用MyShopping管理系统");
		System.out.println("\n***************************************");
		System.out.println("\t1.客 户 信 息 管 理");
		System.out.println("\t2.购 物 结 算");
		System.out.println("\t3.真 情 回 馈");
		System.out.println("\t4.注 销");
		System.out.println("***************************************\n");
		int a =0;
		String b ="";
		
		do {
			System.out.print("请输入数字：");
			 a = input.nextInt();
			
			switch (a) {
			case 1:
				b="客户信息";
				break;
			case 2:
				b="购物结算";
				break;
			case 3:
				b="真情回馈";
				break;
			case 4:
				b="注销";
				break;
			default:
				System.out.print("輸入錯誤，");
				break;
			}
			
			
		} while (!(a==1||a==2||a==3||a==4));
		System.out.println("执行"+b);
		
		
		System.out.println("程序结束");
		
		 
	}
	
}
 
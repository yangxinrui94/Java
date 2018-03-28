import java.util.Scanner;


public class 上机练习2 {
	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
		System.out.println("我行我素购物管理系统>客户信息管理>添加客户信息\n");
		
		System.out.println("请输入4位会员号：");
		int a = input.nextInt();
		System.out.println("请输入会员生日(月/日<用两位数表示):");
		String b = input.next();
		System.out.println("请输入积分");
		int c = input.nextInt();
		if(a>999 && a<10000){
		    System.out.println("\n已录入的会员信息是：\n"+a+"\t"+b+"\t"+c);
		}else {
			System.out.println("信息录入失败");
		}
		
	}

}

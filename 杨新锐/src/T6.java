import java.util.Scanner;


public class T6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个3位数：");
		int num =input.nextInt();
		int gewei =num%10;
		int shiwei =num/10%10;
		int baiwei =num/100;
		if (num==gewei*gewei*gewei+shiwei*shiwei*shiwei+baiwei*baiwei*baiwei) {
			System.out.println(num+"是水仙花数");
			System.out.println(num+"="+gewei+"*"+gewei+"*"+gewei+"+"+shiwei+"*"+shiwei+"*"+shiwei+"+"+baiwei+"*"+baiwei+"*"+baiwei);
		}else {
			System.out.println(num+"不是水仙花数");
		}
		
		
		
	}
}

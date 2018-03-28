import java.util.Scanner;


public class 简答题6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您的出行的月份：1~12");
		int month = input.nextInt();
		System.out.println("请问您选择头等舱还是经济舱？头等舱输入1，经济舱输入2");
		int No = input.nextInt();
		double money;
		if (month>=4 && month<=10 ) {
			if (No==1) {
				money = 5000*0.9;
				System.out.println("您的机票价格为"+money);
			}else {
				money = 5000*0.8;
				System.out.println("您的机票价格为"+money);
			}
		 
		
		}else {
			if (No==1) {
				money = 5000*0.5;
				System.out.println("您的机票价格为"+money);
			}else {
				money = 5000*0.4;
				System.out.println("您的机票价格为"+money);
			}
				
			}
		} 
 	}
	


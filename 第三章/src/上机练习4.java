import java.util.Scanner;


public class 上机练习4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入会员积分：");
		int identity =input.nextInt();
		double discount;
		if(identity<2000) {
			discount = 0.9;
		}else if(identity<4000){
			discount = 0.8;
		}else if(identity<8000){
			discount = 0.7;
		}else {
			discount = 0.6;
			}
		System.out.println("该会员享受的折扣是："+discount);	
		}
	}



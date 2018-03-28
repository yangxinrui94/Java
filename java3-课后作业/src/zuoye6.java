import java.util.Scanner;


public class zuoye6 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("请输入出行月份：");
		int yue = input.nextInt();
		System.out.print("请选择舱位类型(1.头等舱  2.经济舱)：");
		int type = input.nextInt();
		
		double money = 5000;//原价格
		//4~10  旺季    头等舱9折    经济舱8折
		//     淡季                5        4
		if (yue>=4 && yue<=10) {
			if (type==1) {
				money = money*0.9;
			}else{
				money = money*0.8;
			}
		}else{
			if (type==1) {
				money = money*0.5;
			}else{
				money = money*0.4;
			}
		}
		
		System.out.println("机票价格为：" + money);
	}
}

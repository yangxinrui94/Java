package 简答题3;

import java.util.Scanner;

public class Loan {
	Scanner input = new Scanner(System.in);
	void choice(){
		double sum=0 ;
		System.out.print("请输入贷款金额：");
		double money = input.nextDouble();
		System.out.println("请选择贷款年限：1.3年(36个月) 2.5年(60个月) 3.20年(240个月):");
		int num = input.nextInt();
		switch (num) {
		case 1:
			sum = (money*0.0603+money)/36;
			break;
		case 2:
			sum = (money*0.0612+money)/60;
			break;
		case 3:
			sum = (money*0.0639+money)/240;
		default:
			break;
		}
		System.out.println("月供为："+sum);
	}
}

package �����3;

import java.util.Scanner;

public class Loan {
	Scanner input = new Scanner(System.in);
	void choice(){
		double sum=0 ;
		System.out.print("����������");
		double money = input.nextDouble();
		System.out.println("��ѡ��������ޣ�1.3��(36����) 2.5��(60����) 3.20��(240����):");
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
		System.out.println("�¹�Ϊ��"+sum);
	}
}

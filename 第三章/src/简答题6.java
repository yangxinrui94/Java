import java.util.Scanner;


public class �����6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������ĳ��е��·ݣ�1~12");
		int month = input.nextInt();
		System.out.println("������ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�����1�����ò�����2");
		int No = input.nextInt();
		double money;
		if (month>=4 && month<=10 ) {
			if (No==1) {
				money = 5000*0.9;
				System.out.println("���Ļ�Ʊ�۸�Ϊ"+money);
			}else {
				money = 5000*0.8;
				System.out.println("���Ļ�Ʊ�۸�Ϊ"+money);
			}
		 
		
		}else {
			if (No==1) {
				money = 5000*0.5;
				System.out.println("���Ļ�Ʊ�۸�Ϊ"+money);
			}else {
				money = 5000*0.4;
				System.out.println("���Ļ�Ʊ�۸�Ϊ"+money);
			}
				
			}
		} 
 	}
	


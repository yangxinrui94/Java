import java.util.Scanner;


public class �ϻ���ϰ3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������Ƿ��ǻ�Ա����(y)/��(�����ַ�)");
		String identity = input.next();
		System.out.println("�������");
		double money = input.nextDouble();
		if(identity.equals("y")) { 
			if(money>200) {
				money = money * 0.75;				
			}else {
				money = money * 0.8;
			}
		}else {
			if(money>100) {
				money = money * 0.9;
			}
		}
	    System.out.println("ʵ��֧����"+money);
	}

}

import java.util.Scanner;


public class �����3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�����뱾��");
		double money = input.nextDouble();
		double one = money*0.0225+money;
		double two = money*0.027*2+money;
		double three = money*0.0324*3+money;
		double five = money*0.036*5+money;
		System.out.println("����Ϊ��"+money);
		System.out.println("\n��ȡһ���ı�Ϣ�ǣ�"+one);
		System.out.println("\n��ȡ�����ı�Ϣ�ǣ�"+two);
		System.out.println("\n��ȡ�����ı�Ϣ�ǣ�"+three);
		System.out.println("\n��ȡ�����ı�Ϣ�ǣ�"+five);
	}

}

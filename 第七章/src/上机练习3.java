import java.util.Scanner;


public class �ϻ���ϰ3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "";
		int hour=0; 
		double price=0.0;
		System.out.println("����������Ϸƽ̨> ��Ϸ��֧��\n");
		System.out.println("��ѡ���������Ϸ���ͣ�");		
		System.out.println("\t1.����");
		System.out.println("\t2.���о�����");
		int No = input.nextInt();
		System.out.println("��������Ϸʱ����");
		hour = input.nextInt();
		switch (No) {
		case 1:
			name ="����";
			price =10;
			break;
		case 2:
			name ="���о�����";
			price =20;
			break;			
		default:
			System.out.println("�����������������룡");
		
			return;
		}
		if (hour >= 10) {
			System.out.println("�������Ϸ��"+name+"��ʱ���ǣ�"+hour+"�������������Ż�");
			System.out.println("����Ҫ֧��"+(price*hour*0.5)+"����Ϸ��");
			
		}else {
			System.out.println("�������Ϸ��"+name+"��ʱ���ǣ�"+hour+"�������ܰ����Ż�");
			System.out.println("����Ҫ֧��"+(price*hour*0.8)+"����Ϸ��");
			
		}
		
	}
}

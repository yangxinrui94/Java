import java.util.Scanner;


public class �ϻ���ϰ5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������Ϸƽ̨> ����û���Ϣ\n");
		System.out.println("������Ҫ¼����û�������");
		int count = input.nextInt();
		for (int i = 0; i < count; i++) {
			System.out.print("�������û����(<4λ����>)��");
			int num =input.nextInt();
			System.out.print("�������û����䣺");
			int age =input.nextInt();
			if (age<10) {
				System.out.println("�ܱ�Ǹ���������䲻��������Ϸ");
				System.out.println("¼����Ϣʧ��");
				continue;
				
			}
			System.out.print("�������Ա���֣�");
			int score = input.nextInt();
			System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
			System.out.println("�û���ţ�"+num+"\t����"+age+"\t���֣�"+score);
			
			
			
		}
		
	}
}

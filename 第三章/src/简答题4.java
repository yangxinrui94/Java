import java.util.Scanner;


public class �����4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��������");
		int a =input.nextInt();
		int b = a%3 ;
		int c = a%5;
		if (b==0 || c==0) {
			System.out.println("��������3��5�ı�����");
		}else {
				System.out.println("�������ܱ�3��5���κ�һ����������");
			}
		
	}
}

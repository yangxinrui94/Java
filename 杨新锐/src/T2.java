import java.util.Scanner;


public class T2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�����뿼�Գɼ���");
		double score = input.nextDouble();
		if (score>=90) {
			System.out.println("����");
			
		}else if (score>=80) {
			System.out.println("����");
			
		}else if (score>=60) {
			System.out.println("�е�");
			
		}else {
			System.out.println("��");
		}
	}
}

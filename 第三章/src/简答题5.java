import java.util.Scanner;


public class �����5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���Գɼ���");
		double score = input.nextDouble();
		if (score==100) {
			System.out.println("���׸�����һ����");
		}else if (score>=90) {
			System.out.println("ĸ�׸�����һ���ʼǱ�����");
		}else if (score>=60) {
			System.out.println("ĸ�׸�����һ���ֻ�");
		}else {
			System.out.println("û������");
			
		}
			
	}
					
			
}
	


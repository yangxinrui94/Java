import java.util.Scanner;


public class T1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������ѧ��������");
		String name = input.next();
		double score =0, a=0;
		for (int i = 1; i <=5; i++) {
			System.out.print("������5�Ź����еĵ�"+i+"�ſεĳɼ���");
			score = input.nextDouble();
			a+=score;
		}
		a= a/5;
		System.out.println(name+"��ƽ�����ǣ�"+a);
	}
	
}

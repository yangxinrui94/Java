import java.util.Scanner;


public class �ϻ���ϰ1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������4λѧԱ�ĳɼ�");
		double score =0, a=0;
		for (int i = 1; i <5; i++) {
			System.out.print("��"+i+"λѧԱ�ĳɼ���");
			score = input.nextDouble();
			a+=score;
		}
		a= a/4;
		System.out.println("����ѧԱ��ƽ�����ǣ�"+a);
	}
}

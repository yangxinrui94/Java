import java.util.Random;
import java.util.Scanner;

public class ����3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("��������ݣ�");
		String year = input.next();
		System.out.print("��ѡ���Ʒ����(1.̨ʽ��2.�ʼǱ�3.����)��");
		int num = input.nextInt();
		int a = new Random().nextInt(1000);
		System.out.println(year + "0" + num + a);
	}
}

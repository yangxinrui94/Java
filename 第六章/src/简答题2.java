import java.util.Scanner;


public class �����2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double hour = 0,a = 0;
		for (int i =1 ; i <=5; i++) {
			System.out.print("��������"+i+"��ѧϰʱ�䣺");
			hour = input.nextDouble();
			a = a + hour;
		}
		 a = a/5;
		 System.out.println("��һ������ÿ��ƽ��ѧϰʱ���ǣ�"+a+"Сʱ");
	}
}

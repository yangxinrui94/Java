import java.util.Scanner;


public class �ϻ���ϰ6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		double price = 0.0;
		for (int i = 1; i <=3; i++) {
			System.out.println("�������"+i+"����������������Ʒ�ļ۸�");			
			for (int j = 1; j <=3; j++) {
				price = input.nextDouble();
				if (price>300) {
					count++;					
					continue;
				}											
			}
			System.out.println("��"+i+"���˹���"+count+"����Ʒ����8���Żݣ�");
			count=0;
		}
	}
}

import java.util.Scanner;


public class �ϻ���ϰ2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age=0,young=0;
		for (int i = 1; i <=10; i++) {
			System.out.print("�������"+i+"λ�ͻ����䣺");
			 age = input.nextInt();
			 if (age>0 && age<=30) {
				 young++;
				
			}
		}
		System.out.println("30�����µı����ǣ�"+young/10.0*100+"%");
		System.out.println("30�����ϵı����ǣ�"+(1-young/10.0)*100+"%");
	}
}

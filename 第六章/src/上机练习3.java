import java.util.Scanner;


public class �ϻ���ϰ3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ > �ͻ���Ϣ����  > ��ӿͻ���Ϣ\n");
		int No = 0, points = 0;
		String birthday;
		for (int i = 0; i < 3; i++) {
			System.out.print("�������Ա��(<4λ����>)��");
			No = input.nextInt();
			System.out.print("�������Ա����(��/��<����λ������ʾ>)��");
			birthday = input.next();
			System.out.print("�������Ա���֣�");
			points = input.nextInt();
			if (No < 1000 || No > 9999) {
				System.out.println("�ͻ���"+No+"����Ч��Ա�ţ�");
				System.out.println("¼���Ա��Ϣʧ��\n");
				continue;
			}
			System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
			System.out.println(No+"\t"+birthday+"\t"+points+"\n");
			
		}
		System.out.println("���������");
	}
	
}

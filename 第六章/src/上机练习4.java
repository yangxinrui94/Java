import java.util.Scanner;


public class �ϻ���ϰ4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name ="";
		int password ;	
		for (int i = 2; i >= 0; i--) {
			System.out.print("�������û�����");
			name = input.next();
			System.out.print("���������룺");
			password = input.nextInt();
			if (password==123456 && name.equals("jim")) {
				System.out.println("��ӭ����MyShoppingϵͳ��");
			break;

			}else {
				System.out.println("�������������"+i+"�λ��ᣡ");
			}
				if(i==0) {
				System.out.println("\n�Բ�����3�δ�����������");
			}
			
		}
	
	}
}

import java.util.Scanner;


public class �ϻ���ϰ4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭʹ��MyShopping����ϵͳ");
		System.out.println("\n***************************************");
		System.out.println("\t1.�� �� �� Ϣ �� ��");
		System.out.println("\t2.�� �� �� ��");
		System.out.println("\t3.�� �� �� ��");
		System.out.println("\t4.ע ��");
		System.out.println("***************************************\n");
		int a =0;
		String b ="";
		
		do {
			System.out.print("���������֣�");
			 a = input.nextInt();
			
			switch (a) {
			case 1:
				b="�ͻ���Ϣ";
				break;
			case 2:
				b="�������";
				break;
			case 3:
				b="�������";
				break;
			case 4:
				b="ע��";
				break;
			default:
				System.out.print("ݔ���e�`��");
				break;
			}
			
			
		} while (!(a==1||a==2||a==3||a==4));
		System.out.println("ִ��"+b);
		
		
		System.out.println("�������");
		
		 
	}
	
}
 
import java.util.Scanner;


public class �ϻ���ϰ2 {
	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
		System.out.println("�������ع������ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ\n");
		
		System.out.println("������4λ��Ա�ţ�");
		int a = input.nextInt();
		System.out.println("�������Ա����(��/��<����λ����ʾ):");
		String b = input.next();
		System.out.println("���������");
		int c = input.nextInt();
		if(a>999 && a<10000){
		    System.out.println("\n��¼��Ļ�Ա��Ϣ�ǣ�\n"+a+"\t"+b+"\t"+c);
		}else {
			System.out.println("��Ϣ¼��ʧ��");
		}
		
	}

}

import java.util.Scanner;



public class �ϻ���ϰ1 {
	public static void main(String[] args) {
		int random = (int) (Math.random()*10);
		System.out.println("�������ع������ϵͳ>���˳齱\n");
		System.out.println("������4λ��Ա�ţ�");
		Scanner input = new Scanner(System.in);
		int custNo = input.nextInt();
		int baiwei = custNo / 100 % 10;
		if (baiwei == random){
			System.out.println(custNo + "�����˿ͻ�����þ���MP3һ����");
	
		}else {
			System.out.println(custNo+"лл����֧�֣�");
		}
		
	}

}

import java.util.Scanner;


public class �ϻ���ϰ3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int custNo;
		System.out.println("������4λ��Ա���ţ�");
		custNo = input.nextInt();
		int gewei = custNo % 10;
		int shiwei = custNo /10%10;
		int baiwei = custNo /100%10;
		int qianwei = custNo /1000;
		int sum =gewei + shiwei + baiwei + qianwei;
		System.out.println("��Ա����"+custNo+"��λ֮�ͣ�"+ sum);
		boolean isLuck=sum>20;
		System.out.println("�����˿ͻ���"+isLuck);
	}

}

import java.util.Scanner;


public class �ϻ���ϰ2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Manager a = new Manager();
		System.out.print("���������Ա��Ϣ�û�����");
		String name = input.next();
		System.out.print("���������룺");
		String pwd = input.next();
		a.admain(name, pwd);
	}
}

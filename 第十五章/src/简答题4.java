import java.util.Scanner;


public class �����4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������û������֤���룺");
		String ID = input.next();
		String a = ID.substring(6,10);
		String b = ID.substring(10,12);
		String c = ID.substring(12,14);
		System.out.println("���û������ǣ�"+a+"��"+b+"��"+c+"��");
	}
}

import java.util.Scanner;


public class �����3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��������");
		String name = input.next();
		String a = name.substring(0,1);
		String b = name.substring(1);
		System.out.println("\n���ϣ�  "+a);
		System.out.println("����  "+b);
	}
}

import java.util.Scanner;


public class �����2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������5�仰");
		String[] a = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("��"+(i+1)+"�仰��");
			a[i] = input.next();
			
		}
		System.out.println("�������5�仰Ϊ��");
		for (int i = a.length-1;i>=0; i--) {
			System.out.println(a[i]+"");
		}
	}
}

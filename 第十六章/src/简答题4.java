import java.util.Scanner;

public class �����4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ������(��/��/��)");
		String day = input.next();
		String[] arr = day.split("/");
		System.out.println(arr[2] + "��" + arr[0] + "��" + arr[1] + "��");
	}
}

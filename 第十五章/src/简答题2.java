import java.util.Arrays;
import java.util.Scanner;


public class �����2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�������"+(i+1)+"��ˮ����");
			arr[i] = input.next();
		}
		Arrays.sort(arr);
		System.out.println("\n��Щˮ�����ֵ��г��ֵ�˳���ǣ�");
//		for (String a :arr) {
//			System.out.println(a);
//			
//		}
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	}
}

import java.util.Scanner;


public class �����5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String word = input.next();
		System.out.println("������Ҫ���ҵ��ַ�����");
		String a = input.next();
		System.out.print(a+"���ֵ�λ���ǣ�");
		for (int i = 0; i < word.length() - a.length() + 1; i++) {
			if (word.substring(i, i + a.length()).equals(a)) {
				System.out.print(i+"\t");
			}
		}

	}
}

import java.util.Scanner;

public class �ϻ���ϰ3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ���ַ�����");
		String word = input.next();
		System.out.print("������Ҫ���ҵ��ַ���");
		String a = input.next();
		int num = 0;
		for (int i = 0; i < word.length() - a.length() + 1; i++) {
			if (word.substring(i, i + a.length()).equals(a)) {
				num++;
			}
		}
		System.out.println("\"" + word + "\"" + "�а���" + num + "��" + "\"" + a
				+ "\"");
	}
}

import java.util.Arrays;
import java.util.Scanner;

public class �ϻ���ϰ4 {
	public static void main(String[] args) {
		char[] letters = new char[] { 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };
		System.out.print("ԭ�ַ����У�");
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i] + " ");
		}
		Arrays.sort(letters);
		System.out.print("\n���������");
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i] + " ");
		}
		Scanner input = new Scanner(System.in);
		System.out.print("\n��������ַ��ǣ�");
		char x = input.next().charAt(0);
		char[] newLetters = new char[letters.length + 1];
		int index = letters.length - 1;
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] > x) {
				index = i;
				break;
			}
		}
		System.out.println("�����ַ����±��ǣ�" + index);
		for (int i = 0; i < index; i++) {
			newLetters[i] = letters[i];
		}
		for (int i = index; i < letters.length; i++) {
			newLetters[i + 1] = letters[i];
		}

		newLetters[index] = x;
		System.out.print("�������ַ������ǣ�");
		for (int i = 0; i < newLetters.length; i++) {
			System.out.print(newLetters[i] + " ");
		}

	}
}

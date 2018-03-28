import java.util.Arrays;
import java.util.Scanner;

public class 上机练习4 {
	public static void main(String[] args) {
		char[] letters = new char[] { 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };
		System.out.print("原字符序列：");
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i] + " ");
		}
		Arrays.sort(letters);
		System.out.print("\n升序排序后：");
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i] + " ");
		}
		Scanner input = new Scanner(System.in);
		System.out.print("\n待插入的字符是：");
		char x = input.next().charAt(0);
		char[] newLetters = new char[letters.length + 1];
		int index = letters.length - 1;
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] > x) {
				index = i;
				break;
			}
		}
		System.out.println("插入字符的下标是：" + index);
		for (int i = 0; i < index; i++) {
			newLetters[i] = letters[i];
		}
		for (int i = index; i < letters.length; i++) {
			newLetters[i + 1] = letters[i];
		}

		newLetters[index] = x;
		System.out.print("插入后的字符序列是：");
		for (int i = 0; i < newLetters.length; i++) {
			System.out.print(newLetters[i] + " ");
		}

	}
}

import java.util.Arrays;

public class �ϻ���ϰ3 {
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
		System.out.print("\n���������");
		for (int i = letters.length - 1; i >= 0; i--) {
			System.out.print(letters[i] + " ");

		}
	}
}

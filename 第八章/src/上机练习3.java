import java.util.Arrays;

public class ÉÏ»úÁ·Ï°3 {
	public static void main(String[] args) {
		char[] letters = new char[] { 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };
		System.out.print("Ô­×Ö·ûĞòÁĞ£º");
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i] + " ");
		}
		Arrays.sort(letters);
		System.out.print("\nÉıĞòÅÅĞòºó£º");
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i] + " ");
		}
		System.out.print("\nÄæĞòÅÅĞòºó£º");
		for (int i = letters.length - 1; i >= 0; i--) {
			System.out.print(letters[i] + " ");

		}
	}
}

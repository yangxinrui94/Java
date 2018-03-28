import java.util.Scanner;


public class 简答题5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一段字符：");
		String word = input.next();
		System.out.println("请输入要查找的字符串：");
		String a = input.next();
		System.out.print(a+"出现的位置是：");
		for (int i = 0; i < word.length() - a.length() + 1; i++) {
			if (word.substring(i, i + a.length()).equals(a)) {
				System.out.print(i+"\t");
			}
		}

	}
}

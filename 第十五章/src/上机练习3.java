import java.util.Scanner;

public class 上机练习3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个字符串：");
		String word = input.next();
		System.out.print("请输入要查找的字符：");
		String a = input.next();
		int num = 0;
		for (int i = 0; i < word.length() - a.length() + 1; i++) {
			if (word.substring(i, i + a.length()).equals(a)) {
				num++;
			}
		}
		System.out.println("\"" + word + "\"" + "中包含" + num + "个" + "\"" + a
				+ "\"");
	}
}

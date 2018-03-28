import java.util.Scanner;

public class 简答题4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个日期(月/日/年)");
		String day = input.next();
		String[] arr = day.split("/");
		System.out.println(arr[2] + "年" + arr[0] + "月" + arr[1] + "日");
	}
}

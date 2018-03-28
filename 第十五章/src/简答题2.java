import java.util.Arrays;
import java.util.Scanner;


public class 简答题2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("请输入第"+(i+1)+"种水果：");
			arr[i] = input.next();
		}
		Arrays.sort(arr);
		System.out.println("\n这些水果在字典中出现的顺序是：");
//		for (String a :arr) {
//			System.out.println(a);
//			
//		}
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	}
}

import java.util.Scanner;


public class 简答题2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5句话");
		String[] a = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("第"+(i+1)+"句话：");
			a[i] = input.next();
			
		}
		System.out.println("逆序输出5句话为：");
		for (int i = a.length-1;i>=0; i--) {
			System.out.println(a[i]+"");
		}
	}
}

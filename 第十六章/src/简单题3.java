import java.util.Random;
import java.util.Scanner;

public class 简单题3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年份：");
		String year = input.next();
		System.out.print("请选择产品类型(1.台式机2.笔记本3.其他)：");
		int num = input.nextInt();
		int a = new Random().nextInt(1000);
		System.out.println(year + "0" + num + a);
	}
}

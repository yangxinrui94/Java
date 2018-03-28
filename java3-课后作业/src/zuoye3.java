import java.util.Scanner;


public class zuoye3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入3个数：");
		int a = input.nextInt(); //5
		int b = input.nextInt(); //4
		int c = input.nextInt(); //3
		//交换，实现从小到大的顺序
		if (a>b) {
			a = b + (b=a)*0;
		}
		if (a>c) {
			a = c + (c=a)*0;
		}
		if (b>c) {
			b = c + (c=b)*0;
		}
		
		System.out.println("交换之后：" + a + "\t" + b + "\t" + c);
	}
}

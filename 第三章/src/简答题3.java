import java.util.Scanner;


public class 简答题3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入整数a=");
		int a = input.nextInt();
		System.out.println("请输入整数b=");
		int b = input.nextInt();
		System.out.println("请输入整数c=");
		int c = input.nextInt();
		int d;
		if(a>b)
		{
		d=a;
		a=b;
		b=d;
		}
		if(a>c)
		{
		d=a;
		a=c;
		c=d;
		}
		if(b>c)
		{
		d=b;
		b=c;
		c=d;
		}
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		
		
	}
}

			
	


import java.util.Scanner;


public class �����3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������a=");
		int a = input.nextInt();
		System.out.println("����������b=");
		int b = input.nextInt();
		System.out.println("����������c=");
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

			
	



public class 简答题1 {
	public static void main(String[] args) {
		int a =10;
		int b=8;
		System.out.println("输出互换前手中的纸牌：");
		System.out.println("左手中的纸牌："+a);
		System.out.println("右手中的纸牌："+b);
		int temp;
		temp=a;
		a=b;
		b=temp;		
		//a=a+b;
		//b=a-b;
		//a=a-b;
		//a=b+(b=a)*0;
				
	    System.out.println("\n输出互换后手中的纸牌：");
		System.out.println("左手中的纸牌："+a);
		System.out.println("右手中的纸牌："+b);
		
	}
}

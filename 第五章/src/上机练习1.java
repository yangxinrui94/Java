
public class 上机练习1 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		while (b<=100) {
			 a = a + b;  //还可用if判断 b 是否是偶数 b%2==0
			 b = b + 2; 
			
		}
		System.out.println("100以内的偶数之和为："+a);
	}
	
}

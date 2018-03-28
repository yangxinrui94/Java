import java.util.Scanner;


public class 简答题2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int num = input.nextInt();
		int result=1;
		if (num<=1||num>10) {
			System.out.println("无效数据！");
			return;
			}
		
			System.out.print(num+"!=");
		
		for (int i = 1; i <= num; i++) {			
			result = result*i;
			
			if (i==num) {
				System.out.print(i+"=");
				                        
			}else {
				System.out.print(i+"x");
			}
				
			}
			System.out.println(result);
			
		
	}
}

import java.util.Scanner;


public class �����2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����������");
		int num = input.nextInt();
		int result=1;
		if (num<=1||num>10) {
			System.out.println("��Ч���ݣ�");
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

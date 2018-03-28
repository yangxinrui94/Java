import java.util.Scanner;


public class 简答题4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数（输入0结束）：");
		int num =input.nextInt();
		int max =num;
		int min =num;
		while (num!=0){
			System.out.print("请输入一个整数（输入0结束）：");	
			num = input.nextInt();
			
			if (num>max && num!=0) {
				max=num;
				
			}	
			if (num<min && num!=0) {
				min=num;
			}
			
		}
		 
		
		System.out.println("最大值是："+max+"最小值是："+min);
	}
}

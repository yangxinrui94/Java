import java.util.Scanner;


public class T1 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int[]arr = {8,4,2,1,23,344,12};
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
			sum+=arr[i];
		}
		System.out.println("\n和："+sum);
		
		System.out.print("\n请输入一个数：");
		int num=input.nextInt();
		boolean a= false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==num) {
				a=true;
			}
		}
		if (a) {
			System.out.println("存在");
		}else{
			System.out.println("不存在");
		}
		
	}
}

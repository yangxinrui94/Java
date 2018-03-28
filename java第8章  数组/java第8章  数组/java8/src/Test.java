import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum = 0;//总分
		for (int i = 0; i < arr.length; i++) {
			System.out.print("请输入第"+(i+1)+"位同学的成绩：");
			arr[i] = input.nextInt();
			
			sum += arr[i];
		}
		
		System.out.println("平均分：" + sum/5);
		
	}
}

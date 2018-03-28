
import java.util.Scanner;


public class 数组11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入总人数：");
		int N = input.nextInt();
		System.out.print("请输入第几人被杀：");
		int M = input.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		int count = 0;
		int index = -1;
		int person = 0;
		while (person < N) {
			count++;
			index++;
			if (index==N) {
				index=0;
			}
			if (arr[index]==0) {
				count--;
				continue;
			}
			if (count%M==0) {
				person++;
				System.out.println(arr[index]+"\t");
				arr[index]=0;
			}
	
		}
		
	}
}













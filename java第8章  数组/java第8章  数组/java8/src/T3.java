import java.util.Arrays;


public class T3 {
	public static void main(String[] args) {
		//打擂台
		int[] arr = {10,4,18,24,32,7};
		
		//要求求出最大值、最小值
		int max=arr[0],min=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >  max){
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("最大值：" + max);
		System.out.println("最小值：" + min);
	}
}

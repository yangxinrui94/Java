import java.util.Arrays;


public class T2 {
	public static void main(String[] args) {
		int[] arr = {10,4,7,13,82,37};
		System.out.println("原数组中的值为：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		//数组的排序
		Arrays.sort(arr);
		System.out.println("\n\n排序之后数组中的值为：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println("\n\n降序之后数组中的值为：");
		for (int i = arr.length-1;i>=0; i--) {
			System.out.print(arr[i] + "\t");
		}
	}
}












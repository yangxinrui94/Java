import java.util.Scanner;


public class 插入一个数 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr ={10,20,30,40,50};
		System.out.println("原数组：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		int[] b = new int[arr.length+1];
		int index = b.length-1;
		System.out.print("请输入要插入的数：");
		int num = input.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>num) {
				index = i;
				break;
			}
		}
		b[index]=num;
		for (int i = 0; i < index; i++) {
			b[i]=arr[i];
		}
		for (int i = index; i < arr.length; i++) {
			b[i+1]= arr[i];
		}
		System.out.println("插入后为：");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+"\t");
		}
		
	}
}

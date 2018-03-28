import java.util.Scanner;

/**
 * 插入一个数
 */
public class T4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//首先，有一个有序数组
		int[] a = {10,20,30,40,50};
		System.out.println("原数组：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		System.out.print("\n\n请输入一个数：");
		int num  = input.nextInt();
		
		//插入之后，需要一个新数组
		int[] b = new int[a.length+1];
		
		//循环，比较获得下标
		int index = b.length-1;//初始值记录为最后一位
		for (int i = 0; i < a.length; i++) {
			if (a[i] > num) {
				index = i;
				break;
			}
		}
		
		//1、下标之前的，直接赋值
		for (int i = 0; i < index; i++) {
			b[i] = a[i];
		}
		//2、下标处，赋值为输入的数
		b[index] = num;
		//3、下标之后的，全部挪一位
		for (int i = index; i < a.length; i++) {
			b[i+1] = a[i];
		}
		
		System.out.println("\n\n插入之后的数组：");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + "\t");
		}
	}
}













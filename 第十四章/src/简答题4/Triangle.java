package 简答题4;

import java.util.Scanner;

public class Triangle {
	Scanner input = new Scanner(System.in);
	void show(){
		System.out.print("请输入行高：");
		int row = input.nextInt();
		System.out.print("请输入打印的字符：");
		String ch = input.next();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
			
		}
	}
}

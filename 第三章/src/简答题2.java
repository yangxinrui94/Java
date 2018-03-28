import java.util.Scanner;


public class 简答题2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年龄：");
		int age = input.nextInt();
		System.out.println("请输入性别：");
		char sex = input.next().charAt(0);
		if ((age>=7)|| (age>=5 && sex=='男')) {
			System.out.println("可以搬动桌子");
		}else {
			System.out.println("不能搬动桌子");
				
			}
			
		}
	}


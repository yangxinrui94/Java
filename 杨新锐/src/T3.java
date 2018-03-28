import java.util.Scanner;


public class T3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入星期几：");
		int day =input.nextInt();
		switch (day) {
		case 1:
		case 2:
		case 3:
			System.out.println("青椒肉丝");
			
			break;
		
		case 4:
		case 5:
			System.out.println("宫保鸡丁");
			break;
		case 6:
			System.out.println("千张炒肉");
			break;
		case 7:
			System.out.println("满汉全席");
			break;
			default:
			System.out.println("输入错误，请重新输入");
			break;
		}
	}
		
}

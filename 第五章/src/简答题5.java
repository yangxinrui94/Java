import java.util.Scanner;


public class 简答题5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		String week = "";
		
		 int num = 5;
		while (num!=0) {
			System.out.print("请输入数字1-7(输入0结束)：");
			 num = input.nextInt();
			 switch (num) {
			case 1:
				week ="MON";
				System.out.println("今天是"+week);
				break;
			case 2:
				week ="TUE";
				System.out.println("今天是"+week);
				break;
			case 3:
				week ="WED";
				System.out.println("今天是"+week);
				break;
			case 4:
				week ="THU";
				System.out.println("今天是"+week);
				break;
			case 5:
				week ="FRI";
				System.out.println("今天是"+week);
				break;
			case 6:
				week ="SAT";
				System.out.println("今天是"+week);
				break;
			case 7:
				week ="SUN";
				System.out.println("今天是"+week);
				break;
			case 0:	
				System.out.println("程序结束");
				break;
			default:
				System.out.println("请重新输入");
				break;
			}
			
		}
		
	}
}

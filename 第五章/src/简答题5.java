import java.util.Scanner;


public class �����5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		String week = "";
		
		 int num = 5;
		while (num!=0) {
			System.out.print("����������1-7(����0����)��");
			 num = input.nextInt();
			 switch (num) {
			case 1:
				week ="MON";
				System.out.println("������"+week);
				break;
			case 2:
				week ="TUE";
				System.out.println("������"+week);
				break;
			case 3:
				week ="WED";
				System.out.println("������"+week);
				break;
			case 4:
				week ="THU";
				System.out.println("������"+week);
				break;
			case 5:
				week ="FRI";
				System.out.println("������"+week);
				break;
			case 6:
				week ="SAT";
				System.out.println("������"+week);
				break;
			case 7:
				week ="SUN";
				System.out.println("������"+week);
				break;
			case 0:	
				System.out.println("�������");
				break;
			default:
				System.out.println("����������");
				break;
			}
			
		}
		
	}
}

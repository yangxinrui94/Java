import java.util.Scanner;


public class �����4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ������������0��������");
		int num =input.nextInt();
		int max =num;
		int min =num;
		while (num!=0){
			System.out.print("������һ������������0��������");	
			num = input.nextInt();
			
			if (num>max && num!=0) {
				max=num;
				
			}	
			if (num<min && num!=0) {
				min=num;
			}
			
		}
		 
		
		System.out.println("���ֵ�ǣ�"+max+"��Сֵ�ǣ�"+min);
	}
}

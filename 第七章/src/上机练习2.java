import java.util.Scanner;


public class �ϻ���ϰ2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String answer = "";	
		double count=0;
		int i = 1, score = 0;
		System.out.println("����������Ϸƽ̨> ��Ϸ����\n");
		do {		 
			System.out.print("���������"+i+"�֣��ɼ�Ϊ��");
			score = input.nextInt();
			if (score>80) {
				count++;
			}
			i++;
		
			if (i>5) {
				System.out.println("��Ϸ����");
				
			}else {
				System.out.print("��������һ����(yes/no)");
				answer = input.next();
				if (answer.equals("no")) {
					System.out.println("��;�˳���Ϸ");
					System.out.println("�Բ�����δ�ܽ������������ͣ�");
					break;
					
				}else {
					System.out.println("������һ��");
				}
			}
			}while(i<=5);
				double rate = count / 5.0;
			    if (i>5) {
					
				
				if (rate>0.8) {
					System.out.println("��ϲ��ͨ��һ��");
					
				}else if (rate>0.6) {
					System.out.println("ͨ������������Ŭ����");
				}else {
					System.out.println("�Բ�����δ�ܽ������������ͣ�");
			   }
			    
			}
			
	}
}

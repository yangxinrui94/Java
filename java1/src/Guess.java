import java.util.Scanner;
public class Guess {
	public static void main(String[] args) {
		System.out.println("����һ��1������");
		int counter;
		int number =(int)(Math.random()*100);
		int guess;
		boolean isCorrect =false;
		Scanner input =new Scanner(System.in);
		for(counter = 1; counter <10; counter++){
			guess = input.nextInt();
			if(guess == number){
				isCorrect = true;
				break;
			}else if(guess > number){
				System.out.println("���˵㣬������");
			}else if(guess < number){
				System.out.println("С�˵㣬������");
			}
		}
		if(isCorrect && counter==1){
			System.out.println("��̫�в���");
		}else if(isCorrect && counter<=7){
			System.out.println("�����");
		}else if(isCorrect && counter>7){
			System.out.println("������");
		}else{
			System.out.println("ʧ��");
		}
	}
}
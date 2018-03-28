import java.util.Scanner;
public class Guess {
	public static void main(String[] args) {
		System.out.println("输入一个1的整数");
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
				System.out.println("大了点，再来！");
			}else if(guess < number){
				System.out.println("小了点，再来！");
			}
		}
		if(isCorrect && counter==1){
			System.out.println("你太有才了");
		}else if(isCorrect && counter<=7){
			System.out.println("真聪明");
		}else if(isCorrect && counter>7){
			System.out.println("还不错");
		}else{
			System.out.println("失败");
		}
	}
}
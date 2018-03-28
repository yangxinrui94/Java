import java.util.Scanner;

public class 上机练习5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Customer a = new Customer();
		System.out.print("请输入卡类型：");
		a.card = input.next();
		System.out.print("请输入积分：");
		a.score = input.nextInt();
		if ((a.card.equals("金卡") && a.score >= 1000)
				|| (a.card.equals("普卡") && a.score >= 5000)) {
			System.out.println("积分：" + a.score + "卡类型：" + a.card
					+ "\n回馈积分500分！");
		} else {
			System.out.println("谢谢惠顾！");
		}
	}
}

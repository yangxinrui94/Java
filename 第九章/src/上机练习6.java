import java.util.Scanner;


public class 上机练习6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		double price = 0.0;
		for (int i = 1; i <=3; i++) {
			System.out.println("请输入第"+i+"个人所购的三件商品的价格：");			
			for (int j = 1; j <=3; j++) {
				price = input.nextDouble();
				if (price>300) {
					count++;					
					continue;
				}											
			}
			System.out.println("第"+i+"个人共有"+count+"件商品享受8折优惠！");
			count=0;
		}
	}
}

import java.util.Scanner;


public class 上机练习2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age=0,young=0;
		for (int i = 1; i <=10; i++) {
			System.out.print("请输入第"+i+"位客户年龄：");
			 age = input.nextInt();
			 if (age>0 && age<=30) {
				 young++;
				
			}
		}
		System.out.println("30岁以下的比例是："+young/10.0*100+"%");
		System.out.println("30岁以上的比例是："+(1-young/10.0)*100+"%");
	}
}

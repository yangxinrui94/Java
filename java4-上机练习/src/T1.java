import java.util.Scanner;

public class T1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\n\t\t欢迎使用我行我素购物管理系统\n");
		System.out.println("\t\t\t 1. 登 录 系 统\n");
		System.out.println("\t\t\t 2. 退 出\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.print("请选择,输入数字:");
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.println("\n\t\t欢迎使用我行我素购物管理系统\n");
			System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * \n");
			System.out.println("\t\t\t\t 1. 客 户 信 息 管 理\n");
			System.out.println("\t\t\t 2. 购 物 结 算\n");
			System.out.println("\t\t\t 3. 真 情 回 馈\n");
			System.out.println("\t\t\t 4. 注 销\n");
			System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * \n");
			System.out.print("请选择,输入数字:");
			break;
		case 2:
			System.out.println("退出系统！");
			break;
		default:
			break;
		}
		
		

		
	}
}

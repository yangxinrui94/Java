import java.util.Scanner;


public class 上机练习3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int custNo;
		System.out.println("请输入4位会员卡号：");
		custNo = input.nextInt();
		int gewei = custNo % 10;
		int shiwei = custNo /10%10;
		int baiwei = custNo /100%10;
		int qianwei = custNo /1000;
		int sum =gewei + shiwei + baiwei + qianwei;
		System.out.println("会员卡号"+custNo+"各位之和："+ sum);
		boolean isLuck=sum>20;
		System.out.println("是幸运客户吗？"+isLuck);
	}

}

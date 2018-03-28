import java.util.Scanner;

	
public class 上机练习4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num ={1,2,3,4,5};
		String[] goods ={"电风扇","洗衣机","电视机","冰箱","空调机"};
		double[] price ={124.23,4500.0,8800.90,5000.88,4456.0};
		System.out.print("请输入用户名：");
		String name = input.next();
		System.out.print("请输入密码：");
		String pwd = input.next();
		if (name.equalsIgnoreCase("tom") && pwd.equalsIgnoreCase("123")) {
			System.out.println("登录成功！");
		}else {
			System.out.println("登录失败");
			return;
		}
		System.out.println("**************欢迎进入商品批发城******************\n");
		System.out.println("\t\t编号\t物品\t价格");
		for (int i = 0; i < goods.length; i++) {
			System.out.print("\t\t"+num[i]+"\t"+goods[i]+"\t");
			StringBuffer sf = new StringBuffer(String.valueOf(price[i]));
			if (sf.indexOf(".")>3) {
			for (int j =sf.indexOf(".")-3;j>0; j=j-3) {
				sf.insert(j, ',');
			}
			}
			System.out.print(sf.toString());
			System.out.println();
		}
		System.out.println("\n******************************************\n");
		System.out.print("请输入您批发的商品编号：");
		int num1 = input.nextInt();
		System.out.print("请输入批发数量：");
		int num2 = input.nextInt();
		String pay =""+ num2*price[num1-1];
		StringBuffer str = new StringBuffer(pay);
		for (int i=str.indexOf(".")-3;i>0; i=i-3) {
			str.insert(i, ',');
		}
		System.out.println("您需要支付："+str);
	}
}










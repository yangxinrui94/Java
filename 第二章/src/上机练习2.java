
public class 上机练习2 {
	public static void main(String[] args) {
		int shirtPrice = 245;
		int shoePrice = 570;
		int padPrice = 320;
		int shirtNo = 2;
		int shoeNo = 1;
		int padNo = 1;
		double discount = 0.8;
		double finalPay = (shirtPrice*shirtNo+shoePrice*shoeNo +padPrice*padNo )*discount;
		System.out.println("*******消费单*******");
		System.out.println("购买物品\t单价\t个数\t金额");
		System.out.println("T恤\t￥"+shirtPrice+"\t"+shirtNo+"\t￥"+shirtPrice*shirtNo);
		System.out.println("网球鞋\t￥"+shoePrice+"\t"+shoeNo+"\t￥"+shoePrice*shoeNo);
		System.out.println("网球拍\t￥"+padPrice+"\t"+padNo+"\t￥"+padPrice*padNo);
		System.out.println("\n折扣：\t"+(int)+(discount*10)+"折");
		System.out.println("消费总金额\t"+"￥"+finalPay);
		int money = 1500;
		System.out.println("实际交费\t"+"￥"+money);
		System.out.println("找钱\t"+"￥"+(money-finalPay));
		int score = (int)finalPay*3/100;
		System.out.println("本次购物所获的积分是："+score);
		
		
	}
}


public class �ϻ���ϰ2 {
	public static void main(String[] args) {
		int shirtPrice = 245;
		int shoePrice = 570;
		int padPrice = 320;
		int shirtNo = 2;
		int shoeNo = 1;
		int padNo = 1;
		double discount = 0.8;
		double finalPay = (shirtPrice*shirtNo+shoePrice*shoeNo +padPrice*padNo )*discount;
		System.out.println("*******���ѵ�*******");
		System.out.println("������Ʒ\t����\t����\t���");
		System.out.println("T��\t��"+shirtPrice+"\t"+shirtNo+"\t��"+shirtPrice*shirtNo);
		System.out.println("����Ь\t��"+shoePrice+"\t"+shoeNo+"\t��"+shoePrice*shoeNo);
		System.out.println("������\t��"+padPrice+"\t"+padNo+"\t��"+padPrice*padNo);
		System.out.println("\n�ۿۣ�\t"+(int)+(discount*10)+"��");
		System.out.println("�����ܽ��\t"+"��"+finalPay);
		int money = 1500;
		System.out.println("ʵ�ʽ���\t"+"��"+money);
		System.out.println("��Ǯ\t"+"��"+(money-finalPay));
		int score = (int)finalPay*3/100;
		System.out.println("���ι�������Ļ����ǣ�"+score);
		
		
	}
}

import java.util.Scanner;

	
public class �ϻ���ϰ4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num ={1,2,3,4,5};
		String[] goods ={"�����","ϴ�»�","���ӻ�","����","�յ���"};
		double[] price ={124.23,4500.0,8800.90,5000.88,4456.0};
		System.out.print("�������û�����");
		String name = input.next();
		System.out.print("���������룺");
		String pwd = input.next();
		if (name.equalsIgnoreCase("tom") && pwd.equalsIgnoreCase("123")) {
			System.out.println("��¼�ɹ���");
		}else {
			System.out.println("��¼ʧ��");
			return;
		}
		System.out.println("**************��ӭ������Ʒ������******************\n");
		System.out.println("\t\t���\t��Ʒ\t�۸�");
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
		System.out.print("����������������Ʒ��ţ�");
		int num1 = input.nextInt();
		System.out.print("����������������");
		int num2 = input.nextInt();
		String pay =""+ num2*price[num1-1];
		StringBuffer str = new StringBuffer(pay);
		for (int i=str.indexOf(".")-3;i>0; i=i-3) {
			str.insert(i, ',');
		}
		System.out.println("����Ҫ֧����"+str);
	}
}










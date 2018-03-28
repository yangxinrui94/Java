
public class 简答题3 {
	public static void main(String[] args) {
		System.out.println("1~100之间不能被7整除的数据为：");
		int sum =0;
		int num =0;
		for (int i = 1; i <101; i++) {
			if (i%7!=0) {
				sum+=i;
				num++;
				System.out.print(i+"\t");				
			
				if (num==4) {
					System.out.println();
					num=0;
					
				}
			}
		}
		System.out.println("\n数据之和为："+sum);
	}
}

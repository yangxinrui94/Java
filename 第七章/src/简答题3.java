
public class �����3 {
	public static void main(String[] args) {
		System.out.println("1~100֮�䲻�ܱ�7����������Ϊ��");
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
		System.out.println("\n����֮��Ϊ��"+sum);
	}
}

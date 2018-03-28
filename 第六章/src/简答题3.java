
public class 简答题3 {
	public static void main(String[] args) {
		int b=0;
		for (int a = 0;a <=35;a++) {
			b =35-a;
			if (!(2*a+4*b==94 )) {
			System.out.println("无结果");
			continue;
			}
			System.out.println("鸡："+a+"只，兔"+(35-a)+"只");
			
			
		}
	}
}

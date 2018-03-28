
public class T13 {
	public static void main(String[] args) {
		double a = 0.0;
		for (int i = 1; i <= 50; i++) {
			double b = 1.0 / (2*i-1)*(Math.pow(-1, i+1)); 
			a+=b;
//			double b = 1.0 / (2*i-1);
			System.out.println(b);
//			if (i % 2 == 0) {
//				a -= b;
//			} else {
//				a += b;
//			}

		}
		System.out.println("结果" + a);
	}
}
//结果0.7803986631477527
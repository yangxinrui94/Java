public class T11 {
	public static void main(String[] args) {
		double PI = 0.0;
		for (int i = 1;; i++) {
			double a =(4.0/(2*i-1))*(Math.pow(-1, i+1));
			PI+=a;
//			double a = 4.0 / (2 * i - 1);
//			if (i % 2 == 0) {
//				PI -= a;
//			} else {
//				PI += a;
//			}
//			结果：3.1415000095284658;
			if (PI > 3.1415 && PI < 3.1416) {
				System.out.println("圆周率PI为：" + PI);
				break;
			}

		}

	}
}

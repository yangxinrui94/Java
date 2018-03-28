public class T8 {
	public static void main(String[] args) {
		int a = 1, b = 2, c = 0;
		double sum = 0.0;
		for (int i = 1; i <= 20; i++) {
			System.out.println("第" + i + "项：" + b +" /"+ a);
			c = a;
			a = b;
			b += c;
			sum += b * 1.0 / a;
		}
		System.out.println("前20项之和为：" +sum);
	}
}

public class T8 {
	public static void main(String[] args) {
		int a = 1, b = 2, c = 0;
		double sum = 0.0;
		for (int i = 1; i <= 20; i++) {
			System.out.println("��" + i + "�" + b +" /"+ a);
			c = a;
			a = b;
			b += c;
			sum += b * 1.0 / a;
		}
		System.out.println("ǰ20��֮��Ϊ��" +sum);
	}
}

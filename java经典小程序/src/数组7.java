public class ����7 {
	public static void main(String[] args) {
		int[][] arr = new int[20][5];
		int[] sum = new int[20];
		int i, j;
		double[] a = new double[5];
		System.out.println("ѧ���ɼ�:");
		System.out.println("core C++\tcoreJava\tServlet\t\tJSP\t\tEJB ");
		for (i = 0; i < 20; i++) {
			for (j = 0; j < 5; j++) {
				arr[i][j] = (int) (1 + Math.random() * 100);
				System.out.print(arr[i][j] + "\t\t");
			}
			System.out.println();
		}
		System.out.println("ѧ���ܷ֣�");
		for (i = 0; i < 20; i++) {
			for (j = 0; j < 5; j++) {
				sum[i] += arr[i][j];
			}
			System.out.println("��" + (i + 1) + "λѧ�����ܷ�" + sum[i]);
		}
		System.out.println("ƽ���֣�");
		System.out.println("core C++\tcoreJava\tServlet\t\tJSP\t\tEJB");
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 20; j++) {
				a[i] += arr[j][i];

			}
			System.out.print(a[i] / 20 + "\t\t");
		}

	}
}

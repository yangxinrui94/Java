public class ����10 {
	public static void main(String[] args) {
		int triangle[][] = new int[10][];// ������ά����
		// ������ά����ĵ�һ��
		for (int i = 0; i < triangle.length; i++) {
			for (int j = 1; j <= 10 - i; j++) {
				System.out.print("   ");
			}
			triangle[i] = new int[i + 1];// ��ʼ���ڶ�������Ĵ�С
			// �����ڶ�������
			for (int j = 0; j <= i; j++) {
				// �����������Ԫ�ظ�ֵΪ1
				if (i == 0 || j == 0 || j == i) {
					triangle[i][j] = 1;
				} else {// ������ֵͨ����ʽ����
					triangle[i][j] = triangle[i - 1][j]
							+ triangle[i - 1][j - 1];
				}
				System.out.print(triangle[i][j] + "    ");
			}
			System.out.println();
		}
	}

}

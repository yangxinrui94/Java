import java.util.Scanner;

public class �����6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] musics = new String[] { "Island", "Ocean", "Pretty", "Sun" };
		String[] newMusics = new String[musics.length + 1];// �±�֮��ģ�ȫ��Ųһλ
		String a = "";
		int index = newMusics.length - 1;// ��ʼֵ��¼Ϊ���һλ
		System.out.println("����ǰ����Ϊ��");
		for (int i = 0; i < musics.length; i++) {
			System.out.print(musics[i] + " ");
		}

		System.out.print("\n������������ƣ�");
		a = input.next();
		// ѭ�����Ƚϻ���±�
		for (int i = 0; i < musics.length; i++) {
			if (musics[i].compareToIgnoreCase(a) > 0) {
				index = i;
				break;
			}

		}
		// 1���±�֮ǰ�ģ�ֱ�Ӹ�ֵ
		for (int i = 0; i < index; i++) {
			newMusics[i] = musics[i];
		}
		// 2���±괦����ֵΪ�������
		newMusics[index] = a;
		// 3���±�֮��ģ�ȫ��Ųһλ
		for (int i = index; i < musics.length; i++) {
			newMusics[i + 1] = musics[i];
		}

		System.out.print("����������Ϊ��");
		for (int i = 0; i < newMusics.length; i++) {
			System.out.print(newMusics[i] + " ");
		}
	}
}

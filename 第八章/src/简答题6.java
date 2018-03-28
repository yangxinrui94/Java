import java.util.Scanner;

public class 简答题6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] musics = new String[] { "Island", "Ocean", "Pretty", "Sun" };
		String[] newMusics = new String[musics.length + 1];// 下标之后的，全部挪一位
		String a = "";
		int index = newMusics.length - 1;// 初始值记录为最后一位
		System.out.println("插入前数组为：");
		for (int i = 0; i < musics.length; i++) {
			System.out.print(musics[i] + " ");
		}

		System.out.print("\n请输入歌曲名称：");
		a = input.next();
		// 循环，比较获得下标
		for (int i = 0; i < musics.length; i++) {
			if (musics[i].compareToIgnoreCase(a) > 0) {
				index = i;
				break;
			}

		}
		// 1、下标之前的，直接赋值
		for (int i = 0; i < index; i++) {
			newMusics[i] = musics[i];
		}
		// 2、下标处，赋值为输入的数
		newMusics[index] = a;
		// 3、下标之后的，全部挪一位
		for (int i = index; i < musics.length; i++) {
			newMusics[i + 1] = musics[i];
		}

		System.out.print("插入后的数组为：");
		for (int i = 0; i < newMusics.length; i++) {
			System.out.print(newMusics[i] + " ");
		}
	}
}

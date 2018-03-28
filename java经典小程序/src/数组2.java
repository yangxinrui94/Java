
public class สýื้2 {
	public static void main(String[] args) {
		int[] arr ={1,2,3,4,5,6,7,8,9,10};
		int[] newArr = new int[arr.length];
		for (int i = 1; i < arr.length; i++) {
			newArr[i]=arr[i-1];
		}
		newArr[0]=arr[9];
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]+"\t");
		}
	}
}

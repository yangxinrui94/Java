

public class 简答题3 {
	public static void main(String[] args) {
		int points[] = new int[]{18,25,7,36,13,2,89,63};
		int min  = points[0];
		int index = points.length;
		for (int i = 0; i < points.length; i++) {
			if (min>points[i]) {
				min = points[i];
				index= i;
				
			}
			
		}
		System.out.println("最低积分min："+min+"原始位置index:"+index);
	}
}

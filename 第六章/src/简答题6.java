
public class ¼ò´ğÌâ6 {
	public static void main(String[] args) {
		int sum = 0, i;
		for (i = 1; i <= 4; i++) {
			switch (i) {
			case 1:
				sum = sum + 2;				
			case 2:
				sum = sum + 4;
				continue;
			case 3:
				sum = sum + 16;
				break;
			default:
				break;
			}
			
		}
		System.out.println(sum);
	}
}

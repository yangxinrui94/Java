
public class FlipFlop¼ò´ğÌâ4 {
	public static void main(String[] args) {
		int i;
		for ( i = 1; i <= 100; i++) {
			if (i%3==0 && i%5==0) {
				System.out.println("FlipFlop");
				continue;
			}
			if (i%3==0) {
				System.out.println("Flip");
				continue;
				
			}
		
			if (i%5==0) {
				System.out.println("Flop");
				continue;
				
			}
			
			
			System.out.println(i);
		}
		
	}
}

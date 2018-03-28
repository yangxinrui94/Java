
public class 简答题5 {
	public static void main(String[] args) {
		int women=0,kids=0;
		for (int men = 0; men <=10; men++) {
			for (women = 0; women <= 25; women++) {
				
			
			kids=30-men-women ;	
			
			
			if (3*men+2*women+kids==50) {
				System.out.println("men:"+men+"人，women:"+women+"人，kids:"+kids+"人");
				continue;
				
			}
			
			}
		}
	}
}


public class Season {
	void season(int num){
		switch (num) {
		case 3:
		case 4:
		case 5:
			System.out.println("该季节为春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("该季节为夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("该季节为秋季");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("该季节为冬季");
			break;
		default:
			break;
		}
	}
}

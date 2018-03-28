import java.util.Scanner;


public class 上机练习2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String answer = "";	
		double count=0;
		int i = 1, score = 0;
		System.out.println("青鸟迷你游戏平台> 游戏晋级\n");
		do {		 
			System.out.print("您正在玩第"+i+"局，成绩为：");
			score = input.nextInt();
			if (score>80) {
				count++;
			}
			i++;
		
			if (i>5) {
				System.out.println("游戏结束");
				
			}else {
				System.out.print("继续玩下一局吗？(yes/no)");
				answer = input.next();
				if (answer.equals("no")) {
					System.out.println("中途退出游戏");
					System.out.println("对不起，您未能晋级，继续加油！");
					break;
					
				}else {
					System.out.println("进入下一句");
				}
			}
			}while(i<=5);
				double rate = count / 5.0;
			    if (i>5) {
					
				
				if (rate>0.8) {
					System.out.println("恭喜！通过一级");
					
				}else if (rate>0.6) {
					System.out.println("通过二级，继续努力！");
				}else {
					System.out.println("对不起，您未能晋级，继续加油！");
			   }
			    
			}
			
	}
}

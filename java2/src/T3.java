import java.util.Scanner;


public class T3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("请输入姓名：");
		String name=input.next();
		
		System.out.println("请输入性别");
		char sex=input.next().charAt(0);
		
		System.out.println("请输入年龄");
		int age=input.nextInt();
		
		System.out.println("请输入分数");
		double score=input.nextDouble();
		
		System.out.println("我是"+name+"性别"+sex+"今年"+age+"岁考了"+score+"分！");
		
    
		
	}
	
}

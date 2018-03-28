package 简答题7;

import java.util.Scanner;

public class StudentBiz {
	Scanner input = new Scanner(System.in);
	Student[] arr = new Student[5];
	void getAvg(){	
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Student();  
			System.out.println("请输入三门成绩：");
			arr[i].JavaScore = input.nextDouble();
			arr[i].CScore = input.nextDouble();
			arr[i].SQLScore = input.nextDouble();	
		System.out.println("第"+(i+1)+"位学生的平均分为："+(arr[i].JavaScore+arr[i].CScore+arr[i].SQLScore)/3);
		}
	}
}

package �����7;

import java.util.Scanner;

public class StudentBiz {
	Scanner input = new Scanner(System.in);
	Student[] arr = new Student[5];
	void getAvg(){	
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Student();  
			System.out.println("���������ųɼ���");
			arr[i].JavaScore = input.nextDouble();
			arr[i].CScore = input.nextDouble();
			arr[i].SQLScore = input.nextDouble();	
		System.out.println("��"+(i+1)+"λѧ����ƽ����Ϊ��"+(arr[i].JavaScore+arr[i].CScore+arr[i].SQLScore)/3);
		}
	}
}

package study;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int kor = scanner.nextInt();
		int math = scanner.nextInt();
		int eng = scanner.nextInt();
		
		int avg = (kor+math+eng)/3;
		
		if(avg>=90){
			System.out.println("A");
		}
		else if(avg>=80){
			System.out.println("B");
		}
		else if(avg>=70){
			System.out.println("C");
		}
		else if(avg>=60){
			System.out.println("D");
		}
		else
			System.out.println("F");

	}
		

}

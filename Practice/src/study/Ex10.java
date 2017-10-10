package study;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("당신의 키를 입력하세요!");
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 : ");
		double height = scanner.nextDouble();
		
		
		System.out.println("당신의 표준 몸무게는 "+(height-100)*0.9 + "Kg 입니다.");


	}

}

package study;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		if(0<=age && age<=7){
			System.out.println("당신의 요금은 5000원 입니다.");
		}
		
		if(8<=age && age<=19){
			System.out.println("당신의 요금은 10000원 입니다.");
		}
		
		if(age>=20){
			System.out.println("당신의 요금은 17000원 입니다.");
		}


	}

}

package study;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		if(0<=age && age<=7){
			System.out.println("����� ����� 5000�� �Դϴ�.");
		}
		
		if(8<=age && age<=19){
			System.out.println("����� ����� 10000�� �Դϴ�.");
		}
		
		if(age>=20){
			System.out.println("����� ����� 17000�� �Դϴ�.");
		}


	}

}

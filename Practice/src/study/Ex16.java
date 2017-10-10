package study;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(num%7==0){
			System.out.println("OK");
		}
		else{
			System.out.println("NO");
		}

	}

}

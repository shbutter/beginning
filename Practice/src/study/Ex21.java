package study;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;
		
		
		for(int i=1;i<=num;i++){
			sum += i;
			
		}
		
		System.out.println(sum);
			
	}

}

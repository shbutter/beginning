package study;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		if(num1<num2){
		
			for(int i=num1;i<=num2;i++){
				System.out.print(i+" ");
			}
		}
		if(num2<num1){
			for(int i=num2;i<=num1;i++){
				System.out.print(i+" ");
			}
		}
			
	}

}

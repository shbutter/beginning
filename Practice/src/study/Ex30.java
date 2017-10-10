package study;
import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇 단을 출력할까요?");
		
		int num = scanner.nextInt();
		int mul = 1;
		
		for(int i=1;i<=9;i++) {
			mul=num*i;
			System.out.println(num+" X "+i+" = "+mul);
		}
		
	}

}

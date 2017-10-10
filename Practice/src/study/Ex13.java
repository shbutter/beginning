package study;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("입력 :");
		Scanner scanner = new Scanner(System.in);
		int sec = scanner.nextInt();
		
		int min = sec/60;
		int sec2 = sec%60;
		System.out.println(min+"분" + sec2+"초");

	}

}

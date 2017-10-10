package study;
import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
				
		for(int i=1;i<=100;i++) {
			if(i%num==0) {
				System.out.print(i+" ");
			}
			else{
				System.out.print("");
			}
		}

	}

}

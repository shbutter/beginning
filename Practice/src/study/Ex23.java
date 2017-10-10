package study;
import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
				
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.print(i+"");
			}
			else{
				System.out.print("");
			}
		}

	}

}

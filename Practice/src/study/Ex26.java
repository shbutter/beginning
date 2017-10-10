package study;
import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;
		int i=1;
		
		
		while(i<=num) {

			if(i%2==0) {
				sum += i;
				i++;
			}
			else
				i++;
		}
		System.out.println(sum);
		
	}

}

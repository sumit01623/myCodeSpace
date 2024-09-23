package evenOrOdd;

import java.util.Scanner;

public class evenOrOdd {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:  ");
		int num = scanner.nextInt();
		scanner.close();
		
		if (num%2==0) {
			System.out.println("number given is even number :  "+num);
		}
		else {
			System.out.println("number given is odd number : "+num);
		}
	}

}

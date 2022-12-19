package codeup;

import java.util.Scanner;

public class p1091 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int m = input.nextInt();
		int d = input.nextInt();
		int n = input.nextInt();
		
		int result = a;
		
		for(int i = 0; i < n-1; i++) {
			result = (result * m + d); 
		}
		
		System.out.println(result);
	}

}

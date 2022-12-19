package codeup;

import java.util.Scanner;

public class p1056 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
//		int a = input.nextInt();
//		int b = input.nextInt();
//		
//		System.out.println(a ^ b);
//		
		boolean a1 = input.nextInt() != 0;
		boolean b1 = input.nextInt() != 0;
		
		System.out.println(a1 ^ b1 ? 1 : 0);
		
	}

}

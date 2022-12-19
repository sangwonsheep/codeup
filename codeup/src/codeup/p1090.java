package codeup;

import java.util.Scanner;

public class p1090 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int r = input.nextInt();
		int n = input.nextInt();
		
		System.out.println(a * (int)Math.pow(r, n-1));
	}

}

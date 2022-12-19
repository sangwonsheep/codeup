package codeup;

import java.util.Scanner;

public class p1046 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		System.out.println(a+b+c);
		System.out.printf("%.1f", (a+b+c)/(double)3);
	}

}

package codeup;

import java.util.Scanner;

public class p1086 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int w = input.nextInt();
		int h = input.nextInt();
		int b = input.nextInt();
		
		System.out.printf("%.2f MB", (w*h*b) / (double)(8 * 1024 * 1024));
	}

}

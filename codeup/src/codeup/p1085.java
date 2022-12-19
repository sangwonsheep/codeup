package codeup;

import java.util.Scanner;

public class p1085 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int h = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int s = input.nextInt();
		
		System.out.printf("%.1f MB", (h*b*c*s)/(double)(8 * 1024 * 1024));
	}

}

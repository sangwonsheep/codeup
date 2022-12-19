package codeup;

import java.util.Scanner;

public class p1089 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int d = input.nextInt();
		int n = input.nextInt();
		
		System.out.println(a + d * (n - 1));
	}

}

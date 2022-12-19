package codeup;

import java.util.Scanner;

public class p1081 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				System.out.println(i + " " + j);
			}
		}
		
	}

}

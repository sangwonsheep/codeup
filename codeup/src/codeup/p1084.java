package codeup;

import java.util.Scanner;

public class p1084 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int r = input.nextInt();
		int g = input.nextInt();
		int b = input.nextInt();
		
		int sum = 0;

		for(int i = 0; i < r; i++) {
			for(int j = 0; j < g; j++) {
				for(int k = 0; k < b; k++) {
					sum += 1;
					System.out.println(i + " " + j + " " + k);
				}
			}
		}
		System.out.println(sum);
		
	}

}

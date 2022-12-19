package codeup;

import java.util.Scanner;

public class p1093 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int [] array = new int[24];
		
		for(int i = 0; i < n; i++) {
			// array[(int)(Math.random() * 23) + 1]++;
			int a = input.nextInt();
			array[a]++;
		}
		
		for(int i = 1; i < 24; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}

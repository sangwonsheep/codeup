package codeup;

import java.util.Scanner;

public class p1096 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int [][] array = new int[20][20];
		
		for(int i = 0; i < n; i++) {
			int x = input.nextInt();
			int y = input.nextInt();
			array[x][y] = 1;
		}
		for(int i = 1; i < array.length; i++) {
			for(int j = 1; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}

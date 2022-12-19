package codeup;

import java.util.Scanner;

public class p1098 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int w = input.nextInt();
		int h = input.nextInt();
		
		int [][] array = new int[w+1][h+1];
		
		int n = input.nextInt();
		
		for(int i = 0; i < n; i++) {
			int l = input.nextInt();
			int d = input.nextInt();
			int x = input.nextInt();
			int y = input.nextInt();
			for(int j = 0; j < l; j++) {
				if(d == 0) {
					array[x][y++] = 1;
				}
				else {
					array[x++][y] = 1;
				}
			}
		}
		
		for(int i = 1; i <= w; i++) {
			for(int j = 1; j <= h; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}

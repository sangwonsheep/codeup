package codeup;

import java.util.Scanner;

public class p1097 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int [][] array = new int[20][20];
		
		for(int i = 1; i < array.length; i++) {
			for(int j = 1; j < array[i].length; j++) {
				int a = input.nextInt();
				array[i][j] = a;
			}
		}
		
		int n = input.nextInt();
		
		for(int i = 0; i < n; i++) {
			int x = input.nextInt();
			int y = input.nextInt();
			for(int j = 1; j < array.length; j++) {
				if(array[x][j] == 1)
					array[x][j] = 0;
				else
					array[x][j] = 1;
			}
			for(int k = 1; k < array.length; k++) {
				if(array[k][y] == 1)
					array[k][y] = 0;
				else
					array[k][y] = 1;
			}
		}
		for(int i = 1; i < array.length; i++) {
			for(int j = 1; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}

package codeup;

import java.util.Scanner;

public class p1099 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int [][] array = new int[11][11];

		for(int i = 1; i < array.length; i++) {
			for(int j = 1; j < array[i].length; j++) {
				int n = input.nextInt();
				array[i][j] = n;
			}
		}
		int i = 2;
		int j = 2;
		while(true) {
			if(array[i][j] == 0) {
				array[i][j] = 9;
			}
			if(array[i][j] == 2) {
				array[i][j] = 9;
				break;
			}
			if(array[i][j+1] == 1) {
				if(array[i+1][j] == 1) {
					break;
				}
				i++;
				continue;
			}
			j++;
		}

		for(int a = 1; a < array.length; a++) {
			for(int b = 1; b < array[a].length; b++) {
				System.out.print(array[a][b] + " ");
			}
			System.out.println();
		}
	}

}

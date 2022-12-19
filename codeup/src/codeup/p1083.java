package codeup;

import java.util.Scanner;

public class p1083 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i == 3 || i == 6 || i == 9)
				System.out.print("X");
			else
				System.out.print(i);
			System.out.print(" ");
		}
		
	}

}

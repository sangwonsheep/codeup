package codeup;

import java.util.Scanner;

public class p1092 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		int check = 0;
		
		while(true) {
			check++;
			if(check % x == 0 && check % y == 0 && check % z == 0) {
				System.out.println(check);
				break;
			}
		}
		
	}

}

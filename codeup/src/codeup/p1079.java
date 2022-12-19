package codeup;

import java.util.Scanner;

public class p1079 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		char c = input.next().charAt(0);
		
		while(true) {
			System.out.println(c);
			if(c == 'q')
				break;
			c = input.next().charAt(0);
		}
	}

}

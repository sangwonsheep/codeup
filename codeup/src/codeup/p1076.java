package codeup;

import java.util.Scanner;

public class p1076 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		char n = input.next().charAt(0);
		
		char a = 'a';
		
		while(n >= a) {
			System.out.print(a + " ");
			a++;
		}
	}

}

package codeup;

import java.util.Scanner;

public class p1022 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String s = input.nextLine();

		char [] data = new char[2001];

		data = s.toCharArray();

		for(char c : data) {
			System.out.print(c);
		}
	}

}

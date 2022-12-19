package codeup;

import java.util.Scanner;

public class p1024 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		
		for(int i = 0; i < s.length(); i++)
			System.out.println("\'" + s.charAt(i) + "\'");
	}

}

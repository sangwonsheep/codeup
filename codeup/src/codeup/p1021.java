package codeup;

import java.util.Scanner;

public class p1021 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		
		char [] data = new char[51];
		
		data = s.toCharArray();
		
		for(char c : data)
			System.out.print(c);
 	}

}

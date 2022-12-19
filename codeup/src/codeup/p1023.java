package codeup;

import java.util.Scanner;

public class p1023 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		
		String [] str = s.split("\\.");
		
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
	}

}

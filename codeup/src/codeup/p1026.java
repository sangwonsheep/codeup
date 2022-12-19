package codeup;

import java.util.Scanner;

public class p1026 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		
		String [] str = s.split(":");
		
		System.out.println(str[1]);
	}

}

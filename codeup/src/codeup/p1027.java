package codeup;

import java.util.Scanner;

public class p1027 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		
		String [] str = s.split("\\.");
		
		for(int i = str.length-1; i >= 0; i--) {
			if(i > 0) {
				System.out.printf("%02d", Integer.parseInt(str[i]));
				System.out.print("-");
			}
			else {
				System.out.printf("%04d", Integer.parseInt(str[i]));
			}
		}
	}

}

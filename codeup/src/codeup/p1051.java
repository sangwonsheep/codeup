package codeup;

import java.util.Scanner;

public class p1051 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(a < b)
			System.out.println("1");
		else
			System.out.println("0");
	}

}

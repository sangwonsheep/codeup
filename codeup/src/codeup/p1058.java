package codeup;

import java.util.Scanner;

public class p1058 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(a == 0 && b == 0)
			System.out.println("1");
		else
			System.out.println("0");
	}

}

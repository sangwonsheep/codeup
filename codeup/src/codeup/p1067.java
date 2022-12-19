package codeup;

import java.util.Scanner;

public class p1067 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		
		if(n >= 0) {
			System.out.println("plus");
			if(n % 2 == 0)
				System.out.println("even");
			else 
				System.out.println("odd");
		}
		else {
			System.out.println("minus");
			if(n % 2 == 0)
				System.out.println("even");
			else 
				System.out.println("odd");
		}
	}

}

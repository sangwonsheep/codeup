package codeup;

import java.util.Scanner;

public class p1068 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		if(n >= 0 && n <= 100) {
			switch(n/10) {
			case 10 : 
			case 9 : 
				System.out.println("A"); // 90 ~ 100
				break;
			case 8 :
			case 7 :
				System.out.println("B"); // 70 ~ 89
				break;
			case 6 :
			case 5 :
			case 4 :
				System.out.println("C"); // 40 ~ 69
				break;
			default :
				System.out.println("D"); // 0 ~ 39
				break;
			}
		}
	}

}

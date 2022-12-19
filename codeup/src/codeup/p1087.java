package codeup;

import java.util.Scanner;

public class p1087 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i < n; i++) {
			sum += i;
			if(sum >= n) {
				System.out.println(sum);
				break;
			}
		}
	}

}

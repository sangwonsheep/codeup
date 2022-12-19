package codeup;

import java.util.Scanner;

public class p1025 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int [] array = new int[(int)(Math.log10(n)+1)];
		
		int num = 1;
		for(int i = array.length-1; i >= 0; i--) {
			array[i] = n % 10 * num;
			n /= 10;
			num *= 10;
		}
		for(int i : array) {
			System.out.println("[" + i + "]");
		}
	}

}

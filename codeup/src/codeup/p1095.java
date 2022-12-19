package codeup;

import java.util.Scanner;

public class p1095 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int [] array = new int[n];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		int min = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(min > array[i])
				min = array[i];
		}
		System.out.println(min);
		
	}

}

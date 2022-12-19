package codeup;

import java.util.Scanner;

public class p1020 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		
		String [] sArray = s.split("-");
		
		for(int i = 0; i < sArray.length; i++) {
			System.out.print(sArray[i]);
		}
	}

}

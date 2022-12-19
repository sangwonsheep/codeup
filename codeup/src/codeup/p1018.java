package codeup;

import java.util.Scanner;

public class p1018 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		
		String [] sArray = s.split(":");
		
		for(int i = 0; i < sArray.length; i++) {
			System.out.print(sArray[i]);
			if(i == sArray.length - 1)
				break;
			System.out.print(":");
		}
	}

}

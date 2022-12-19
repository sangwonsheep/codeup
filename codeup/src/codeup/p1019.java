package codeup;

import java.util.Scanner;

public class p1019 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		
		String [] sArray = s.split("\\.");
		
		for(int i = 0; i < sArray.length; i++) {
			if(sArray[i].length() == 1) {
				System.out.printf("%02d", Integer.parseInt(sArray[i]));
			}
			else {
				System.out.print(sArray[i]);
			}
			if(i == sArray.length - 1)
				break;
			System.out.print(".");
		}
	}

}

package com.basicprograms;

import java.util.Scanner;

public class CubeOfNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		System.out.println("-----------------");
		int num = sc.nextInt();
		System.out.println("Cube Of Number:"+" "+(num*num*num));
		sc.close();
	}
}

package com.basicprograms;

import java.util.Scanner;

public class SquareOfNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number");
		System.out.println("------------------");
		int num = sc.nextInt();
		System.out.println("Square Of Number: "+num*num);
		sc.close();
	}
}

package com.basicprograms;

import java.util.Scanner;

public class TableOfNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number");
	    System.out.println("---------------------");
	    int num = sc.nextInt();
	    for(int i=1; i<=10;i++)
	    {
	    	System.out.println(num*i);
	    }
	    sc.close();
	}
}

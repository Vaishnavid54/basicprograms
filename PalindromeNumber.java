package com.basicprograms;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		//reverse number
		
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num , remainder , sum =0;
		while(num>0)
		{
			remainder = num%10;
			sum = (sum*10)+remainder;
			num = num/10;
		}
		if(temp==sum)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not Palindrome Number");
		}
		sc.close();
	}
}

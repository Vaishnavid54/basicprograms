package com.basicprograms;

public class NumberOfDigit {
	
	public static void main(String[] args) {
		
		int num = 45698;
		int count =0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		System.out.println(count);
	}
}

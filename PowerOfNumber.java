package com.basicprograms;

public class PowerOfNumber {
	
	public static void main(String[] args) {
		
		int a = 2, b = 3 , mul = 1;
		for(int i=1;i<=b;i++)
		{
			mul *= a;
		}
		System.out.println(mul);
	}
}

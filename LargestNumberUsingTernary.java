package com.basicprograms;

public class LargestNumberUsingTernary {
	
	public static void main(String[] args) {
		
		int a = 12, b = 85, c = 32;
		int largest = (a>b ? a : b) > c ? (a>b ? a:b) :c;
		System.out.println(largest);
	}
}

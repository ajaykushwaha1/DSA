package com.dsa.basic.program;

public class SwapIntegers {
	
	public static void main(String[] args) {
		int x = 10;
		int y =20;
		
		
		y=x+y; // 30;
		x= y-x; // 30-10 = 20
		y = y-x; // 30-20 = 10
		
		System.out.println(x + " "+y);
		
	}

}

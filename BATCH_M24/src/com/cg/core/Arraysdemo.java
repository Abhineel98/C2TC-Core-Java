package com.cg.core;

import java.util.Arrays;

public class Arraysdemo {
	// length--->Array and length()--->string
	
	public static void main(String[] args) {
		int[] arr= {10,58,75,68,12,96,38,74,18,96};
		System.out.println("Entered Array is=");
		
		for(int num:arr)
		{
			System.out.println(num+" ");
			
		}
		Arrays.sort(arr);
		System.out.println("sorted Array is=");
		for (int num: arr)
		{
			System.out.println(num+" ");
			
		}
		System.out.println("length of the Array is=");
		System.out.println(arr.length);
	}

}

package com.cg.core;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		int size;
		System.out.println("Enter the size of your Array:");
		Scanner s=new Scanner (System.in);
		size=s.nextInt();
		
		int[] arr=new int[10]; //create Array
		System.out.println("Enter the elements of your Array:");
		for (int i=0; i<size;i++)
		{
			arr[i]=s.nextInt();// Taking input from the user
		}
		System.out.println("Here is your Array:");
		
		//printing the elements of Array
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}

}

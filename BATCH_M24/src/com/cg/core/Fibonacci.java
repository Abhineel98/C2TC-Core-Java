package com.cg.core;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int n, a=0, b=0, c=2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=s.nextInt();
		for(int i=1; i<=n; i++)
		{
			a=b;
		    b=c;
		    c=a+b;
		    System.out.println(a+" ");
		}
		// TODO Auto-generated method stub

	}

}

package com.cg.core;
// class methods and variables

public class FinalDemo {

	public static void main(String[] args) {
		
//    final int age=25; //constant
//
//    //later i can change
		
	}	

	final class Parent
	{
		void property()
		{
			System.out.println("house wealth plots jwellery car");
		}
		//parent class method
		final void marry()
		{
			System.out.println("Srilatha");
			
			
		}

	}
	class shubham extends Parent //Inheritance
	{//override
		void marry()
		{
			System.out.println("Katrina");
		}
	}

}

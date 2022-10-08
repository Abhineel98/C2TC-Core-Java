package com.cg.core;

public class StringDemo {

	public static void main(String[] args) {
		String s=new String("Abhineel");
		s.concat("Bisht");
		//immutable
		System.out.println(s);
		
//		StringBuffer s1=new StringBuffer("Abhineel");
//		s1.append("Bisht");
//		//mutable
//		System.out.println(s1);
		
		System.out.println(s.length());
		
		String s1="HELLO FRIENDS";
		String lower=s1.toLowerCase();
		System.out.println(lower);
		
		String upper=s.toUpperCase();
		System.out.println(upper);
		
		System.out.println(s.substring(2));//begin index--->start index will be include.
		
		System.out.println(s.substring(2,7));//stsrt index-->include.....end index-->exclude.
		
		
		
	}

}

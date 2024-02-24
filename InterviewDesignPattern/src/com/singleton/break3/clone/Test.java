package com.singleton.break3.clone;


public class Test {

	public static void main(String[] args) throws Exception
	{
		//3rd ways :-Clone :- to break singleton obj
		Singleton s1=Singleton.getInstance();
		System.out.println(s1.hashCode());
		
		System.out.println("\n\n-------");
		
		//clone()
		//whatever object we have through that we try to clone one more object 
		Singleton s2  =(Singleton) s1.clone();
		System.out.println(s2.hashCode());
	}

}

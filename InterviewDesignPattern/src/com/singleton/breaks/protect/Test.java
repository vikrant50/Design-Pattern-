package com.singleton.breaks.protect;

import java.lang.reflect.Constructor;

public class Test {

	public static void main(String[] args) throws Exception
	{
		//whenever people try to break singleton
		Singleton s1=Singleton.getInstance();
		System.out.println(s1.hashCode());
		
		System.out.println("\n\n-------");
		
		//1.Reflection Api 
		Constructor<Singleton> constructor= Singleton.class.getDeclaredConstructor();
		constructor.setAccessible(true);

	    
		System.out.println(constructor.hashCode());
	}

}

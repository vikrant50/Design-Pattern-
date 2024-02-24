package com.singleton.breaks.demo2;

import java.lang.reflect.Constructor;

public class Test {

	public static void main(String[] args) throws Exception
	{
		//1.Reflection Api to break singleton obj
		Singleton s1=Singleton.getInstance();
		System.out.println(s1.hashCode());
		
		System.out.println("\n-------");
		
		//1.Reflection Api 
		Constructor<Singleton> constructor= Singleton.class.getDeclaredConstructor();
		constructor.setAccessible(true);

		Singleton newInstance = constructor.newInstance();
		
		System.out.println(newInstance.hashCode());
		
	}

}

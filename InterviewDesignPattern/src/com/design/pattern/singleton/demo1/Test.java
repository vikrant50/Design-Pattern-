package com.design.pattern.singleton.demo1;

public class Test {

	public static void main(String[] args) throws Exception
	{
		Singleton s1=Singleton.getInstance();
		//System.out.println(s1.hashCode());
		Singleton s2=Singleton.getInstance();
//		System.out.println(s2.hashCode());
//		
		
		if(s1==s2)
		{
			System.out.println("both object are same");
			
		}
		else
		{
			System.out.println("object are not same");
		}
		
		
	}

}

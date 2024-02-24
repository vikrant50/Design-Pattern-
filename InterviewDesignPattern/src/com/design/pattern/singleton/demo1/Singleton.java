 package com.design.pattern.singleton.demo1;

public class Singleton 
{
	

	//best way
	private static Singleton obj=null;
	
	//private constructor .... We can't create object outside
	
	private Singleton()
	{
	}
	
   //to provide the object with this method only
   public static Singleton getInstance()
	{
		if(obj==null)
		{
			synchronized(Singleton.class)
			{
				if(obj==null)
				{
					obj=new Singleton();
				}
			}
			return obj;
		}
		return obj;
	   //return object;

}
}

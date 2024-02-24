package com.singleton.breaks.protect;

public class Singleton 
{
	

	//best way
	private static Singleton obj=null;
	
	//private constructor .... We can't create object outside
	private Singleton()
	{
		//if i want to protect 
		if(obj!=null) 
		{
			throw new RuntimeException("Exception occured while multiple obj");
		}
		
	}
	
	//to provide the object with this method only
	public  static Singleton getInstance()
	{
		if(obj==null) {
		synchronized(Singleton.class)
		{
			if(obj==null)
				obj= new Singleton();
		}
		return obj ;
	}
	return obj;

}
}

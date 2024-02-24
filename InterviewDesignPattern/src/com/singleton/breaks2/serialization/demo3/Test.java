package com.singleton.breaks2.serialization.demo3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Test {

	public static void main(String[] args) throws Exception
	{
		//2nd way: serialization to break singleton obj
		Singleton s1=Singleton.getInstance();
		System.out.println(s1.hashCode());
		
		System.out.println("\n\n-------");
		
		//1.Serialization and Deserialization 
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("amit.ob"));
		oos.writeObject(s1);
		
		
		//Deserialization
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("amit.ob"));
		Singleton s2=(Singleton) ois.readObject();
		System.out.println(s2.hashCode());
		
	}

}

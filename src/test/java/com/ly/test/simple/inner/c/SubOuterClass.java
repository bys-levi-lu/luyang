package com.ly.test.simple.inner.c;

import com.ly.test.simple.inner.a.Person;
import com.ly.test.simple.inner.b.OuterClass;

public class SubOuterClass extends OuterClass
{

    public SubOuterClass(String str)
    {
	super(str);
	// TODO Auto-generated constructor stub
    }
    
    class AAAAAA extends SubOuterClass.American
    {
	@Override
	public String say()
	{
	    // TODO Auto-generated method stub
	    return "AAAAAAAAAA";
	}
	
    }
    
    public Person getPerson()
    {
	American t = new American();
	return t;
    }
    
    public static void main(String[] args)
    {
	SubOuterClass t = new SubOuterClass("ddd");
	System.out.println(t.getPerson().say());
    }

}

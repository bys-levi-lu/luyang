package com.ly.test.simple.inner.b;

import com.ly.test.simple.inner.a.Person;

public class OuterClass
{
    private String s;
    
    public OuterClass(String str)
    {
	s = str;
    }
    
    protected class American implements Person
    {
	private String desc;
	public American()
	{
	    desc = "I am American";
	}

	@Override
	public String say()
	{
	    return desc;
	}
    }
    
    public Person getPerson()
    {
	American tmp = new American();
	tmp.desc += " add more";
	return tmp;
    }
}


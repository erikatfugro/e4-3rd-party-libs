package com.fugro.lab.domain.powermockexample;

public class ClassWithPrivateMethod
{
	public String getValue()
	{
		return getValuePrivate();
	}

	private String getValuePrivate()
	{
		return "DummyValue";
	}
}

package edu.kvcc.cis298.cis298assignment3.abstractions.event.controller;

public abstract
class Event
{
	private String mName;

	public Event(String name)
	{
		mName = name;
	}

	public String getName()
	{
		return mName;
	}
}

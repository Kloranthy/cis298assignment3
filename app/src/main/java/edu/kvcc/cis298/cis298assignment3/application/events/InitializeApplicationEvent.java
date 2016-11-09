package edu.kvcc.cis298.cis298assignment3.application.events;


import edu.kvcc.cis298.cis298assignment3.event.Event;

public
class InitializeApplicationEvent
	extends Event
{
	public
	InitializeApplicationEvent()
	{
		super( "initialize_application" );
	}
}

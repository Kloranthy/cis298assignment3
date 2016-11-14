package edu.kvcc.cis298.cis298assignment3.application.events;


import edu.kvcc.cis298.cis298assignment3.abstractions.event.controller.Event;

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

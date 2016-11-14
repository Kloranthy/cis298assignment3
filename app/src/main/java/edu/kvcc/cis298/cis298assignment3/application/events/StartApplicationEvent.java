package edu.kvcc.cis298.cis298assignment3.application.events;


import edu.kvcc.cis298.cis298assignment3.abstractions.event.controller.Event;

public
class StartApplicationEvent
	extends Event
{
	public
	StartApplicationEvent()
	{
		super( "start_application" );
	}
}

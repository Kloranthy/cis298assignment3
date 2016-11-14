package edu.kvcc.cis298.cis298assignment3.application.events;

import edu.kvcc.cis298.cis298assignment3.abstractions.event.controller.Event;

public
class ApplicationInitializedEvent
	extends Event
{
	public
	ApplicationInitializedEvent()
	{
		super( "application_initialized_event" );
	}
}

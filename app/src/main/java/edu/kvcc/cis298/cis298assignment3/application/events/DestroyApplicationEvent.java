package edu.kvcc.cis298.cis298assignment3.application.events;

import edu.kvcc.cis298.cis298assignment3.abstractions.event.controller.Event;

public
class DestroyApplicationEvent
	extends Event
{

	public
	DestroyApplicationEvent()
	{
		super( "destroy_application_event" );
	}
}

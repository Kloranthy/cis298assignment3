package edu.kvcc.cis298.cis298assignment3.application.events;

import edu.kvcc.cis298.cis298assignment3.event.Event;


public
class StopApplicationEvent
	extends Event
{
	public
	StopApplicationEvent()
	{
		super("stop_application_event" );
	}
}

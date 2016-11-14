package edu.kvcc.cis298.cis298assignment3.application.events;

import edu.kvcc.cis298.cis298assignment3.abstractions.event.controller.Event;

public
class PauseApplicationEvent
	extends Event
{
	public PauseApplicationEvent()
	{
		super("pause_application_event");
	}
}

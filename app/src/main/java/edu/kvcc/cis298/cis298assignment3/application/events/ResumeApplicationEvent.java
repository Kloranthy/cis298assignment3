package edu.kvcc.cis298.cis298assignment3.application.events;

import edu.kvcc.cis298.cis298assignment3.abstractions.event.controller.Event;


public
class ResumeApplicationEvent
	extends Event
{
	public
	ResumeApplicationEvent()
	{
		super("resume_application_event" );
	}
}

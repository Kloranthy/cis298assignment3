package edu.kvcc.cis298.cis298assignment3.abstractions.controller;

import edu.kvcc.cis298.cis298assignment3.application.ApplicationState;
import edu.kvcc.cis298.cis298assignment3.abstractions.event.controller.Event;

public
interface Controller
{
	public void handleEvent(Event event );

	public void setApplicationState(ApplicationState nextApplicationState );
}

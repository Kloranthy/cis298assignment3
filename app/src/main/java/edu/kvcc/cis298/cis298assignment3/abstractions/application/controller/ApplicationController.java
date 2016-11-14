package edu.kvcc.cis298.cis298assignment3.abstractions.application.controller;

import edu.kvcc.cis298.weigel.abstractions.controller.Controller;
import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
import edu.kvcc.cis298.weigel.abstractions.application.ModuleLocator;
import edu.kvcc.cis298.weigel.abstractions.modules.log.LogModule;

public
class ApplicationController
	extends Controller
{
	// private
	// command queue
	// events queue(s?)
	// events handler?(s?)
	// executorModule
	private LogModule
		mLogModule;
	private ApplicationState
		mApplicationState;

	public
	ApplicationController()
	{
		mApplicationState
			= ApplicationState.CREATED;
	}

	public
	void initialize( ModuleLocator moduleLocator )
	{
		mApplicationState
			= ApplicationState.INITIALIZING;
		mLogModule
			= (LogModule) moduleLocator.getModule( "Log" );
		// initialize other fields
		// initialize other modules?
	}

	//
	public
	void handleEvent( Event event )
	{
		switch ( mApplicationState )
		{
			case CREATED:
				switch ( event
					         .getClass()
					         .getName() )
				{
					//case initialize
					// create initialize tasks(s?)
					// execute tasks
					//case stop/shutdown
					// create shutdown tasks(s?)
					// execute tasks
					//break;
					default: // unhandled
						// throw error? at least log
						// transition to stopping
						// create shutdown tasks(s?)
						// execute tasks
				}
				break;
			case INITIALIZING:
				break;
			case READY:
				break;
			case STARTING:
				break;
			case RUNNING:
				break;
			case PAUSING:
				break;
			case PAUSED:
				break;
			case RESUMING:
				break;
			case STOPPING:
				// log that events received while stopping
				break;
			case STOPPED:
				// log that events received while stopped
				break;
			case DESTROYED:
				// log that events received while destroyed
				break;
			default: // unhandled events
				// log and execute stop tasks
				break;
		}
	}

	public
	void setApplicationState( ApplicationState nextApplicationState )
	{
		if ( ApplicationState.canTransition(
			mApplicationState,
			nextApplicationState
		                                   ) )
		{
			mApplicationState
				= nextApplicationState;
		}
		else
		{
			mApplicationState
				= ApplicationState.STOPPING;
		}
	}

	@Override
	protected
	void handleChildControllerEvent( Event event )
	{
		switch ( mApplicationState )
		{
			case CREATED:
				// switch ( event )
				break;
			case INITIALIZING:
				break;
			case READY:
				break;
			case STARTING:
				break;
			case RUNNING:
				break;
			case PAUSING:
				break;
			case PAUSED:
				break;
			case RESUMING:
				break;
			case STOPPING:
				// log that events received while stopping
				break;
			case STOPPED:
				// log that events received while stopped
				break;
			case DESTROYED:
				// log that events received while destroyed
				break;
			default: // unhandled events
				// log and execute stop tasks
				break;
		}
	}
}

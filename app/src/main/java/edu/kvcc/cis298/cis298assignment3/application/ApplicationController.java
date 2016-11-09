package edu.kvcc.cis298.cis298assignment3.application;


import edu.kvcc.cis298.cis298assignment3.application.tasks.InitializeApplicationTask;
import edu.kvcc.cis298.cis298assignment3.event.Event;
import edu.kvcc.cis298.cis298assignment3.interfaces.Controller;
import edu.kvcc.cis298.cis298assignment3.task.Task;

public
class ApplicationController
	implements Controller
{
	private ApplicationState mApplicationState;
	//private ExecutorModule mExecutorModule;

	public ApplicationController()
	{
		mApplicationState = ApplicationState.CREATED;
	}

	@Override
	public
	void handleEvent( Event event )
	{
		switch( mApplicationState )
		{
			case CREATED:
				switch(
					event
						.getName()
					)
				{
					case "initialize_application" :
					 Task
						 task = new InitializeApplicationTask();
					// mExecutorModule.execute( tasks);
					// break;
					//case "initialized_application" :
					// setApplicationState(INITIALIZING);
					// mExecutorModule.execute( tasks);
					// break;
					//case stop/shutdown
					// create shutdown task(s?)
					// execute tasks
					//break;
					default: // unhandled
						// throw error? at least log
						// transition to stopping
						// create shutdown task(s?)
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
			default: // unhandled event
				// log and execute stop task
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
}

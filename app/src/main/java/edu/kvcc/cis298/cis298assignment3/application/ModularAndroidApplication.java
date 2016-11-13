package edu.kvcc.cis298.cis298assignment3.application;


import edu.kvcc.cis298.cis298assignment3.application.events.ApplicationCreatedEvent;
import edu.kvcc.cis298.cis298assignment3.application.events.DestroyApplicationEvent;
import edu.kvcc.cis298.cis298assignment3.application.events.InitializeApplicationEvent;
import edu.kvcc.cis298.cis298assignment3.application.events.PauseApplicationEvent;
import edu.kvcc.cis298.cis298assignment3.application.events.ResumeApplicationEvent;
import edu.kvcc.cis298.cis298assignment3.application.events.StartApplicationEvent;
import edu.kvcc.cis298.cis298assignment3.application.events.StopApplicationEvent;
import edu.kvcc.cis298.cis298assignment3.event.Event;
import edu.kvcc.cis298.cis298assignment3.interfaces.ModularApplication;
import edu.kvcc.cis298.cis298assignment3.module.ModuleLocator;

public
class ModularAndroidApplication
	implements ModularApplication
{
	private ApplicationController
		mApplicationController;
	private ModuleLocator
		mModuleLocator;

	public
	ModularAndroidApplication()
	{
		mModuleLocator
			= ModuleLocator.getInstance();
		mApplicationController
			= new ApplicationController();
		Event
			event
			= new ApplicationCreatedEvent();
	}

	@Override
	public
	void initializeApplication()
	{
		Event
			event
			= new InitializeApplicationEvent();
		mApplicationController.handleEvent( event );

	}

	public
	void startApplication()
	{
		Event
			event
			= new StartApplicationEvent();
		mApplicationController.handleEvent( event );
	}

	@Override
	public
	void pauseApplication()
	{
		Event
			event
			= new PauseApplicationEvent();
		mApplicationController.handleEvent( event );
	}

	@Override
	public
	void resumeApplication()
	{
		Event
			event
			= new ResumeApplicationEvent();
		mApplicationController.handleEvent( event );
	}

	@Override
	public
	void stopApplication()
	{
		Event
			event
			= new StopApplicationEvent();
		mApplicationController.handleEvent( event );
	}

	@Override
	public
	void destroyApplication()
	{
		Event
			event
			= new DestroyApplicationEvent();
		mApplicationController.handleEvent( event );
	}
}

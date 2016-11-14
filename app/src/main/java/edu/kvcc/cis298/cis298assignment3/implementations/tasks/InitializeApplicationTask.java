package edu.kvcc.cis298.cis298assignment3.implementations.tasks;

import edu.kvcc.cis298.cis298assignment3.interfaces.Module;
import edu.kvcc.cis298.cis298assignment3.module.ModuleLocator;
import edu.kvcc.cis298.cis298assignment3.task.Task;


public
class InitializeApplicationTask
	extends Task
{
	private ModuleLocator mModuleLocator;

	@Override
	public
	void initializeTask( ModuleLocator moduleLocator )
	{
		mModuleLocator = moduleLocator;
	}

	@Override
	public
	void startTask()
	{

		for( Module module : mModuleLocator.getModules())
		{
			module.initializeModule(mModuleLocator);
		}
	}

	@Override
	public
	void pauseTask()
	{
		// not yet implemented
	}

	@Override
	public
	void resumeTask()
	{
		// not yet implemented
	}

	@Override
	public
	void stopTask()
	{
		// not yet implemented
	}

	@Override
	public
	void destroyTask()
	{
		mModuleLocator = null;
	}
}

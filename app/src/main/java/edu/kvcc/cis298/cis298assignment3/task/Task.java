package edu.kvcc.cis298.cis298assignment3.task;


import edu.kvcc.cis298.cis298assignment3.module.ModuleLocator;

public
abstract class Task
{

	public abstract
	void initializeTask( ModuleLocator moduleLocator );
	public abstract
	void startTask();
	public abstract
	void pauseTask();
	public abstract
	void resumeTask();
	public abstract
	void stopTask();
	public abstract
	void destroyTask();

}

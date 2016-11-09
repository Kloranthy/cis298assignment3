package edu.kvcc.cis298.cis298assignment3.interfaces;


import edu.kvcc.cis298.cis298assignment3.module.ModuleLocator;

public
interface ModularApplication
{
	public abstract
	void initializeApplication();

	public abstract
	void startApplication();

	public abstract
	void pauseApplication();

	public abstract
	void resumeApplication();

	public abstract
	void stopApplication();

	public abstract
	void destroyApplication();
}

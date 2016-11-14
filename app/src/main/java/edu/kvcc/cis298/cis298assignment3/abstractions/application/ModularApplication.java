package edu.kvcc.cis298.cis298assignment3.abstractions.application;

public
interface ModularApplication
{
	public abstract
	void startApplication();

	public abstract
	void initializeApplication();

	public abstract
	void pauseApplication();

	public abstract
	void resumeApplication();

	public abstract
	void stopApplication();

	public abstract
	void destroyApplication();
}

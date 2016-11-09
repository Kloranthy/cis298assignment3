package edu.kvcc.cis298.cis298assignment3.interfaces;

import edu.kvcc.cis298.cis298assignment3.module.ModuleLocator;
import edu.kvcc.cis298.cis298assignment3.module.ModuleState;

public abstract
class Module
{
	protected ModuleLocator
		mModuleLocator;
	private   String
		mName;
	private   ModuleState
		mState;

	public
	Module( String name )
	{
		mName
			= name;
		mModuleLocator
			= ModuleLocator.getInstance();
	}

	public
	String getName()
	{
		return mName;
	}

	public abstract
	void initializeModule(ModuleLocator moduleLocator);

	public abstract
	void startModule();

	public abstract
	void pauseModule();

	public abstract
	void resumeModule();

	public abstract
	void stopModule();

	public abstract
	void destroyModule();
}

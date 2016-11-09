package edu.kvcc.cis298.cis298assignment3.module;


import java.util.HashMap;

import edu.kvcc.cis298.cis298assignment3.interfaces.Module;

public
class ModuleLocator
{
	// private variables
	private static ModuleLocator
		mInstance;
	private        HashMap<String, Module>
		mModules;

	// private methods
	private
	ModuleLocator()
	{
		mModules
			= new HashMap<String, Module>();
	}

	// public methods
	public static
	ModuleLocator getInstance()
	{
		if ( mInstance
			  == null )
		{
			mInstance
				= new ModuleLocator();
		}
		return mInstance;
	}

	public
	void addModule( Module module )
	{
		String
			moduleName
			= module.getName();
		if ( hasModule( moduleName ) )
		{
			// TODO: add option on whether to replace
			// existing module or throw error
		}
		else
		{
			mModules.put(
				moduleName,
				module
							);
		}
	}

	public
	boolean hasModule( String moduleName )
	{
		return mModules.containsKey( moduleName );
	}

	public
	Module getModule( String moduleName )
	{
		if ( hasModule( moduleName ) )
		{
			return mModules.get( moduleName );
		}
		return null;
	}

	public
	Module[] getModules()
	{
		return (Module[])mModules.values().toArray();
	}

	public
	void removeModule( String moduleName )
	{
		if ( hasModule( moduleName ) )
		{
			Module
				module
				= mModules.remove( moduleName );
			module.destroyModule();
			// assert null ?
		}
	}
}

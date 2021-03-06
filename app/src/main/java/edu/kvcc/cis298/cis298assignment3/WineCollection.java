package edu.kvcc.cis298.cis298assignment3;

import android.content.Context;

import java.util.List;

import edu.kvcc.cis298.cis298assignment3.model.Wine;

public
class WineCollection
{
	// private variables
	/**
	 * singleton instance
	 */
	private static WineCollection
		instance;

	private String
		TAG
		= this
		.getClass()
		.getName();

	private Context
		context;

	// public methods
	/**
	 * singleton access
	 *
	 * @param context
	 * @return WineCollection
	 */
	public static
	WineCollection getInstance(
		Context
			context
									  )
	{
		if ( instance
			  == null )
		{
			instance
				= new WineCollection( context );
		}
		return instance;
	}

	/**
	 * TODO implement
	 *
	 * @return List<Wine>
	 */
	public
	List<Wine> getWines()
	{
		return null;
	}

	/**
	 * TODO implement
	 *
	 * @return Wine the specified wine or null
	 */
	public Wine getWine(int number)
	{
		return null;
	}

	// private methods
	/**
	 * singleton constructor
	 *
	 * @param context
	 */
	private
	WineCollection( Context context )
	{
		this.context
			= context.getApplicationContext();
		// database stuff?
	}
}

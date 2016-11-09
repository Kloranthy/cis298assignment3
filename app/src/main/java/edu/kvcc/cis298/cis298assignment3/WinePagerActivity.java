package edu.kvcc.cis298.cis298assignment3;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;

import java.util.List;

import edu.kvcc.cis298.cis298assignment3.model.Wine;

public
class WinePagerActivity
{
	// private variables
	// model variables
	private
	List<Wine>
		mWineList;
	// view variables
	private
	ViewPager
		mViewPager;

	// public methods
	public static
	Intent newIntent(
		Context packageContext
						 )
	{
		Intent
			intent
			= new Intent(
			packageContext,
			WinePagerActivity.class
		);
		//intent.putExtra(

		return intent;
	}
}

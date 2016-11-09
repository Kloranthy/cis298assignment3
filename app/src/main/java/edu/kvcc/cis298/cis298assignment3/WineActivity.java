package edu.kvcc.cis298.cis298assignment3;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import edu.kvcc.cis298.cis298assignment3.interfaces.SingleFragmentActivity;
import edu.kvcc.cis298.cis298assignment3.view.WineListFragment;

public
class WineActivity
	extends SingleFragmentActivity
{

	@Override
	public
	void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_fragment );
	}

	@Override
	protected
	Fragment createFragment()
	{
		return new WineListFragment();
	}
}

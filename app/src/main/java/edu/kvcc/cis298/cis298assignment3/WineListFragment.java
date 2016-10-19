package edu.kvcc.cis298.cis298assignment3;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public
class WineListFragment
	extends Fragment
{
	// private variables
	// model variables
	// view variables
	private RecyclerView
		mRecyclerView;
	private WineAdapter
		mWineAdapter;

	// public methods
	// private methods

	// private classes
	private
	class WineHolder
		extends RecyclerView.ViewHolder
		implements View.OnClickListener
	{
		// private variables
		// model variables
		private Wine mWine;
		// view variables
		private
		TextView mNumberTextView;
		private
		TextView mDescriptionTextView;
		private
		TextView mPackSizeTextView;
		private
		TextView mCasePriceTextView;
		private
		TextView mActiveTextView;

		// public constructors
		public WineHolder(View viewItem)
		{
			super(viewItem);
		}

		// public methods
		@Override
		public
		void onClick( View v )
		{
			Intent
				intent
				= WinePagerActivity.newIntent( getActivity() );

			startActivity( intent );
		}

		public
		void bindWine(Wine wine)
		{
			mWine = wine;

			mNumberTextView.setText( mWine + "" );
		}
	}

	private
	class WineAdapter
		extends RecyclerView.Adapter<WineHolder>
	{
		// private variables
		private
		List<Wine>
			mWines;

		// public constructors
		public
		WineAdapter(
			List<Wine> wines
					  )
		{
			mWines = wines;
		}

		// public methods
		@Override
		public
		WineHolder onCreateViewHolder(
			ViewGroup parent,
			int viewType
												)
		{
			LayoutInflater
				layoutInflater
				= LayoutInflater.from( getActivity() );
			View
				view
				= layoutInflater.inflate(
				R.layout.fragment_wine_list_item,
				parent,
				false
												);

			return new WineHolder( view );
		}

		@Override
		public
		void onBindViewHolder(
			WineHolder holder,
			int position
									)
		{
			Wine
				wine
				= mWines.get( position );
			holder.bindWine( wine );
		}

		@Override
		public
		int getItemCount()
		{
			return mWines.size();
		}

		public
		void setCrimes(
			List<Wine> wines
						  )
		{
			mWines = wines;
		}
	}
}

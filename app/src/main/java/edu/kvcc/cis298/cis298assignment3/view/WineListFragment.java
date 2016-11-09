package edu.kvcc.cis298.cis298assignment3.view;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import edu.kvcc.cis298.cis298assignment3.R;
import edu.kvcc.cis298.cis298assignment3.WineCollection;
import edu.kvcc.cis298.cis298assignment3.WinePagerActivity;
import edu.kvcc.cis298.cis298assignment3.model.Wine;

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

	@Override
	public
	void onCreate(
		@Nullable
		Bundle savedInstanceState
					 )
	{
		super.onCreate( savedInstanceState );
	}

	@Nullable
	@Override
	public
	View onCreateView(
		LayoutInflater inflater,
		@Nullable
		ViewGroup container,
		@Nullable
		Bundle savedInstanceState
						  )
	{
		View
			view
			= inflater.inflate(
			R.layout.fragment_wine_list,
			container,
			false
									);

		mRecyclerView
			= (RecyclerView)
			view.findViewById(
				R.id.fragment_wine_list_recycler_view
								  );

		mRecyclerView.setLayoutManager(
			new LinearLayoutManager(
				getActivity()
			)
												);

		if ( savedInstanceState
			  != null )
		{
			// retrieve stuff from bundle
		}
		updateUI();
		return view;
	}

	// private methods
	private
	void updateUI()
	{
		WineCollection
			wineCollection
			= WineCollection.getInstance( getActivity() );
		// get list of wines from wine collection
		//List<Wine> wines = wineCollection.getWines();
		if ( mWineAdapter
			  == null )
		{
			//mWineAdapter = new WineAdapter( wines );
		}
		else
		{
			//mWineAdapter.setWines(wines);
			//mWineAdapter.notifyDataSetChanged();
		}
	}

	// private classes
	private
	class WineHolder
		extends RecyclerView.ViewHolder
		implements View.OnClickListener
	{
		// private variables
		// model variables
		private Wine
			mWine;
		// view variables
		private
		TextView
			mNumberTextView;
		private
		TextView
			mDescriptionTextView;
		private
		TextView
			mPackSizeTextView;
		private
		TextView
			mCasePriceTextView;
		private
		TextView
			mActiveTextView;

		// public constructors
		public
		WineHolder( View viewItem )
		{
			super( viewItem );

			viewItem.setOnClickListener( this );

			mNumberTextView
				= (TextView) viewItem.findViewById(
				R.id.list_item_wine_number
															 );

			mDescriptionTextView
				= (TextView) viewItem.findViewById(
				R.id.list_item_wine_description
															 );

			mPackSizeTextView
				= (TextView) viewItem.findViewById(
				R.id.list_item_wine_pack_size
															 );

			mCasePriceTextView
				= (TextView) viewItem.findViewById(
				R.id.list_item_wine_case_price
															 );

			mActiveTextView
				= (TextView) viewItem.findViewById(
				R.id.list_item_wine_active
															 );
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
		void bindWine( Wine wine )
		{
			mWine
				= wine;

			mNumberTextView.setText(
				mWine.getNumber()
										  );
			mDescriptionTextView.setText(
				mWine.getDescription()
												 );

			mPackSizeTextView.setText(
				mWine.getPackSize()
											 );

			mCasePriceTextView.setText(
				mWine.getCasePrice()
											  );

			String
				isActiveResult;
			if ( mWine.isActive() )
			{
				isActiveResult
					= "True"; // todo convert to string resource
			}
			else
			{
				isActiveResult
					= "False";
			}
			mActiveTextView.setText(
				isActiveResult
										  );
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
			mWines
				= wines;
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
		void setWines(
			List<Wine> wines
						 )
		{
			mWines
				= wines;
		}
	}
}

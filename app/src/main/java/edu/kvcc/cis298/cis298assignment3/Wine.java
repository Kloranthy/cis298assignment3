package edu.kvcc.cis298.cis298assignment3;

public
class Wine
{
	// private variables
	// model variables
	private int
		mNumber;
	private String
		mDescription;
	private int
		mPackSize;
	private int
		mCasePrice;
	private boolean
		mIsActive;

	// public methods
	public Wine(int number, String description, int packSize, int casePrice, boolean isActive)
	{
		mNumber = number;
		mDescription = description;
		mPackSize = packSize;
		mCasePrice = casePrice;
		mIsActive = isActive;
	}
	public
	int getNumber()
	{
		return mNumber;
	}

	public
	void setNumber( int number )
	{
		mNumber
			= number;
	}

	public
	String getDescription()
	{
		return mDescription;
	}

	public
	void setDescription( String description )
	{
		mDescription
			= description;
	}

	public
	int getPackSize()
	{
		return mPackSize;
	}

	public
	void setPackSize( int packSize )
	{
		mPackSize
			= packSize;
	}

	public
	int getCasePrice()
	{
		return mCasePrice;
	}

	public
	void setCasePrice( int casePrice )
	{
		mCasePrice
			= casePrice;
	}

	public
	boolean isActive()
	{
		return mIsActive;
	}

	public
	void setActive( boolean active )
	{
		mIsActive
			= active;
	}
}

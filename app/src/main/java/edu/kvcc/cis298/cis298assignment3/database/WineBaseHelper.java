package edu.kvcc.cis298.cis298assignment3.database;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import edu.kvcc.cis298.cis298assignment3.database.WineDbSchema.WineTable;

public
class WineBaseHelper
	extends SQLiteOpenHelper
{
	// private variables
	private static final int
		VERSION
		= 1;
	private static final String
		DATABASE_NAME
		= "wineBase.db";

	public
	WineBaseHelper(
		Context context
						)
	{
		super(
			context,
			DATABASE_NAME,
			null,
			VERSION
			  );
	}

	@Override
	public
	void onCreate( SQLiteDatabase database )
	{
		database
			.execSQL(
				"create table "
				+ WineTable
					.NAME
				+ "("
				+ " _id integer primary key autoincrement, "
				+ WineTable.Cols.NUMBER
				+ ", "
				+ WineTable.Cols.DESCRIPTION
				+ ", "
				+ WineTable.Cols.PACK_SIZE
				+ ", "
				+ WineTable.Cols.CASE_PRICE
				+ ", "
				+ WineTable.Cols.IS_ACTIVE
				+ ")"
					  );
	}

	@Override
	public
	void onUpgrade(
		SQLiteDatabase db,
		int oldVersion,
		int newVersion
					  )
	{

	}
}

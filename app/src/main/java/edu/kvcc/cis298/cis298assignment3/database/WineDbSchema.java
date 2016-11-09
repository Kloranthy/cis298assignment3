package edu.kvcc.cis298.cis298assignment3.database;


public
class WineDbSchema
{
	public static final
	class WineTable
	{
		public static final
		String NAME
		= "wines";

		public static final
		class Cols
		{
			public static final String NUMBER = "number";
			public static final String DESCRIPTION = "description";
			public static final String PACK_SIZE = "pack_size";
			public static final String CASE_PRICE = "case_price";
			public static final String IS_ACTIVE = "is_active";
		}
	}
}

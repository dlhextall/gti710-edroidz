package model;

import java.util.ArrayList;

public class DroidzManager
{	
	private static DroidzManager instance;
	private ArrayList<Droid> droidList = new DroidzStub().createDroidList();
	
	private DroidzManager() {}
	
	public static DroidzManager getInstance()
	{
		if (instance == null) {
			instance = new DroidzManager();
		}
		return instance;
	}

	public ArrayList<Droid> getDroidList() {
		return droidList;
	}
}

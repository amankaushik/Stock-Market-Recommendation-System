package crawler;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringOps 
{
	/**
	 * Input :: dataString :: value1<dlim>value2<dlim>......
	 * Returns tokenized string ArrayList from line containing values separated by delimiter.
	 * Returns emptyList if any problem occurs.
	 **/
	public ArrayList<String> getValueListFromDataString(String dataString, String dlim)
	{
		ArrayList<String> dataList = new ArrayList<String>();
		if(dataString == null || dlim == null || dataString.isEmpty() || dlim.isEmpty())
			return dataList;
		
		StringTokenizer st = new StringTokenizer(dataString, dlim);
		while(st.hasMoreTokens())
		{	dataList.add(st.nextToken());		}
		
		return dataList;
	}

	/**
	 * Input :: dataChunk :: 
	 * 		value11<dlimInner>value12<dlimInner>......value1N<dlimOuter>
	 * 		value21<dlimInner>value22<dlimInner>......value2N<dlimOuter>
	 * 		......
	 * 	 	valueN1<dlimInner>valueN2<dlimInner>......valueNN<dlimOuter>
	 * Returns tokenized ArrayList of (ArrayList of Strings) from a data chunk.
	 * Returns emptyList if any problem occurs.
	 **/
	public ArrayList<ArrayList<String>> getListOValueListFromDataChunk(String dataChunk, String dlimOuter, String dlimInner)
	{
		ArrayList<ArrayList<String>> dataLoL = new ArrayList<ArrayList<String>>();
		
		// Get a list of innerDataStrings
		ArrayList<String> dataStringList = getValueListFromDataString(dataChunk, dlimOuter);
		if(dataStringList == null || dataStringList.isEmpty())
			return dataLoL;
		
		// for each innnerDataString get smaller Strings.
		ArrayList<String> dataList = new ArrayList<String>();
		for(String dataString : dataStringList)
		{
			dataList = getValueListFromDataString(dataString, dlimInner);
			dataLoL.add(dataList);
		}
		return dataLoL;
	}
	
	public String[] getValueArrayFromDataString(String dataString, String dlim)
	{
		if(dataString == null || dlim == null)
		{	return (new String[]{});	}
		
		StringTokenizer st = new StringTokenizer(dataString, dlim);
		int count = st.countTokens();
		
		if(count == 0)
		{	return (new String[]{});	}
		
		String values[] = new String[count];
		for(int i=0; i<count ; i++)
		{	values[i] = st.nextToken();		}
		
		return values;
	}

}

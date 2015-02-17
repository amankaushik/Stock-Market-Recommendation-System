package crawler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

//import ts.log.Logger;

public class FileOps 
{
	public int dumpToFile(ArrayList<String> dumpData, String filename, boolean append)
	{
		File sfile;
		FileWriter fw;
		try {
			sfile = new File(filename);
			fw = new FileWriter(sfile, append);
		}catch (Exception e){
			//Logger.logException(e);
			//Logger.logError("File Ops :: Cannot open file for writing." + filename);
			return 1;
		}
		
		for(String line : dumpData)
		{
			line += "\n";
			try {
                            //System.out.println("Line: "+line);
                            fw.write(line);	}
			catch (Exception e) {
				//Logger.logException(e);
				//Logger.logError("File Ops :: Saving :: " + line);
			}
		}
		
		try {	fw.close();	}
		catch (Exception e) {
			//Logger.logException(e);
			//Logger.logError("File Ops :: Cannot close file." + filename);
			return 2;
		}
		
		return 0;
	}
        
        
	
	public int dumpToFile(String[][] dumpData, String dlim, String filename, boolean append)
	{
		ArrayList<String> newDumpData = new ArrayList<String>();
		try
		{
			for(String x[] : dumpData)
			{	newDumpData.add(getLineFromStringArray(x, dlim));	}
		}
		catch(Exception e){}
		
		int error = dumpToFile(newDumpData, filename, append);
		if(error == 0)
		{	//Logger.logError("File Ops :: File saved successfully. :: " + filename);	
                    
                }
		
		return error;
	}
	
	public int dumpToFile(ArrayList<String[]> dumpData, String dlim, String filename, boolean append)
	{
		ArrayList<String> newDumpData = new ArrayList<String>();
		try
		{
			for(String x[] : dumpData)
			{	newDumpData.add(getLineFromStringArray(x, dlim));	}
		}
		catch(Exception e){}
		
		int error = dumpToFile(newDumpData, filename, append);
		if(error == 0)
		{	//Logger.logError("File Ops :: File saved successfully. :: " + filename);	
                }
		
		return error;
	}
        
        public int dumpToFile2(ArrayList<ArrayList<String>> dumpData, String dlim, String filename, boolean append)
	{
		ArrayList<String> newDumpData = new ArrayList<String>();
		try
		{
			for(ArrayList<String> x : dumpData)
			{	newDumpData.add(getLineFromStringArray(x, dlim));	}
                        //System.out.println("NewDumpData: "+newDumpData);
		}
		catch(Exception e){}
		
		int error = dumpToFile(newDumpData, filename, append);
		if(error == 0)
		{	//Logger.logError("File Ops :: File saved successfully. :: " + filename);	
                }
		
		return error;
	}
        
        private String getLineFromStringArray(ArrayList<String> dataArray, String dlim)
	{
		StringBuilder sb = new StringBuilder();
		for(String s : dataArray)
		{	sb.append(s).append(dlim);	}
		return(sb.toString());
	}
	
	private String getLineFromStringArray(String[] dataArray, String dlim)
	{
		StringBuilder sb = new StringBuilder();
		for(String s : dataArray)
		{	sb.append(s);	}
		return(sb.toString());
	}
	
	/********* File Reading ************************/
	
	public ArrayList<String> getDataAsStringList(String filename)
	{
		ArrayList<String> posData = new ArrayList<String>();
		
		File sfile = new File(filename);
		FileReader fr;
		BufferedReader br;
		String line;
		
		try 
		{
			fr = new FileReader(sfile);
			br = new BufferedReader(fr);
		}
		catch (Exception e)
		{
			//Logger.logException(e);
			//Logger.logError("File Ops :: Cannot open file :: " + filename);
			return posData;
		}
			
		try 
		{
			while((line = br.readLine()) != null)
			{
				posData.add(line);
			}
		} 
		catch (Exception e1) 
		{	
			//Logger.logException(e1);
			//Logger.logError("File Ops :: Error while reading file :: " + filename);	
		}	
		
		try 
		{
			br.close();
			fr.close();	
		}
		catch (Exception e2) 
		{
			//Logger.logException(e2);
			//Logger.logError("File Ops :: Cannot close file :: " + filename);
		}
		
		return posData;
	}

	/********* Other File Ops ************************/
	
	public int renameFileWithTimestamp(String filename) 
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMddhhmmss");
		Calendar cal = Calendar.getInstance();
		String date = sdf.format(cal.getTime());
		
		int errorcode;
		
		File oldname1 = new File(filename);
		File newname1 = new File(filename + "." + date);

		if(oldname1.renameTo(newname1))
		{
			errorcode = 0;
		}
		else
		{
			errorcode = 1;
			//Logger.logError("System State :: Cannot rename file. " + oldname1 + " : "+ newname1);
		}
		return errorcode;
	}

	public void createFileIfFileNotFound(String filename) 
	{
		File file = new File(filename);
		try {	file.createNewFile();	}
		catch (IOException e) {}	
	}

	public void createDirectoryIfFileNotFound(String rootdir) 
	{
		File file = new File(rootdir);
		if(file.isDirectory())
		{	return;	}
		else
		{
			try {	file.mkdirs();	}
			catch (Exception e) {	}
		}
	}

}

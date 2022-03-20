package org.gdp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtility {
	private static final String filepath="/Users/meghana/Documents/costco-2-meghana-1999/project/src/input.txt";
	public static List<String> readData()
	{
		List<String> outputList= new ArrayList<>();
		try(BufferedReader br= new BufferedReader(new FileReader(filepath)))
		{
			String newLine=null;
			while((newLine=br.readLine())!=null)
			{
				outputList.add(newLine);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return outputList;
	}
}

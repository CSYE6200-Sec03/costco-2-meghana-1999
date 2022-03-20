package org.gdp;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConvertUtility {
	private static final String inputpath="/Users/meghana/Documents/costco-2-meghana-1999/project/src/input.txt";
	public static List<String> readData()
	{
		List<String> ol=new ArrayList<>();
		try(BufferedReader b=new BufferedReader(new FileReader(inputpath))){
			String newLine=null;
			while((newLine=b.readLine())!= null) {
				ol.add(newLine);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return ol;
		}
public static double SDConverter(String s){
	double d=0;
	try {
		d=Double.parseDouble(s);
	}
	catch(NumberFormatException e) {
		e.printStackTrace();
	}
	return d;
}
public static int SIConverter(String s) {
	int i=0;
	try {
		i=Integer.parseInt(s);
	}
	catch(NumberFormatException e)
	{
		e.printStackTrace();
	}
	return i;
}
}

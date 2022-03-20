package org.gdp;

public class ConvertUtility {
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

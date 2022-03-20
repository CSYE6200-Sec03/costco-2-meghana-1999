package org.gdp;
import java.util.*;
public class Costco {
public static void demo() {
	List<ItemAPI>itemlist=new ArrayList<>();
	List<String> l=ConvertUtility.readData();
	try {
		ItemAPI ob1=DurableFactory.getInstance();
		ItemAPI ob2=DurableFactory.getInstance();
		for(int i=0;i<l.size();i++) {
			String[] s=l.get(i).split(",");
			if(s.length==4) {
				ob1.setSerialNumber(ConvertUtility.SIConverter(s[0]));
				ob1.setPrice(ConvertUtility.SDConverter(s[1]));
				ob1.setName(s[2]);
				ob1.setDescription(s[3]);
				itemlist.add(ob1);
				break;
			}
			if(s.length==6) {
				ob1.setSerialNumber(ConvertUtility.SIConverter(s[0]));
				ob1.setPrice(ConvertUtility.SDConverter(s[1]));
				ob1.setName(s[2]);
				ob1.setDescription(s[3]);
				itemlist.add(ob1);
				break;
			}
			if(s.length==7) {
				ob2.setSerialNumber(ConvertUtility.SIConverter(s[0]));
				ob2.setPrice(ConvertUtility.SDConverter(s[1]));
				ob2.setName(s[2]);
				ob2.setDescription(s[3]);
				itemlist.add(ob1);
				break;
			}
			
		}
		for(String s: l)System.out.println(s);
	}catch(Exception e) {
		e.printStackTrace();
	}

}
public static void main(String[] args)
{
	Costco.demo();
}
}

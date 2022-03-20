package org.gdp;
import java.util.*;


public class Costco extends StoreAPI {

	public static void demo()
	{
		List<ItemAPI> itemList= new ArrayList<>();
		List<String> inputList= FileUtility.readData();
		
		try {
					
			for(int i=0;i<inputList.size();i++)
			{
				String[] s= inputList.get(i).split(",");
				if(s.length==4) {
					itemList.add(new ItemAPI(ConvertUtility.SIConverter(s[0]), ConvertUtility.SDConverter(s[1]), s[2], s[3]));
					continue;
				}
				if(s.length==6) {
					itemList.add(DurableFactory.getInstance(ConvertUtility.SIConverter(s[0]), ConvertUtility.SDConverter(s[1]), s[2], s[3], ConvertUtility.SDConverter(s[4]), s[5]));
					continue;
				}
				if(s.length==7) {
					itemList.add(ServiceFactory.getInstance(ConvertUtility.SIConverter(s[0]), ConvertUtility.SDConverter(s[1]), s[2], s[3], s[4], s[5],s[6]));
					continue;
				}
			}
			
			
			//ITEMS IN THE LIST
			System.out.println("ITEMS ON THE LIST:");
			System.out.println("==================");
			for(ItemAPI i : itemList)System.out.println(i);
			
			//SORT BY SERIAL NUMBER ASCENDING
			System.out.println("\n\nSORT BY SERIAL NUMBER - ASCENDING");
			System.out.println("=================================");
			Collections.sort(itemList,(o1,o2)-> {return Integer.compare(o1.getSerialNumber(), o2.getSerialNumber());});
			for(ItemAPI i : itemList) System.out.println(i);
			
			//SORT BY SERIAL NUMBER DESCENDING
			System.out.println("\n\nSORT BY SERIAL NUMBER - DESCENDING");
			System.out.println("==================================");
			Collections.sort(itemList,(o1,o2)-> {return Integer.compare(o2.getSerialNumber(), o1.getSerialNumber());});
			for(ItemAPI i : itemList) System.out.println(i);
			
			//SORT BY PRICE ASCENDING
			System.out.println("\n\nSORT BY PRICE - ASCENDING");
			System.out.println("=========================");
			Collections.sort(itemList,(o1,o2)-> {return Double.compare(o1.getPrice(), o2.getPrice());});
			for(ItemAPI i : itemList) System.out.println(i);
			
			//SORT BY PRICE DESCENDING
			System.out.println("\n\nSORT BY PRICE - DESCENDING");
			System.out.println("==========================");
			Collections.sort(itemList,(o1,o2)-> {return Double.compare(o2.getPrice(), o1.getPrice());});
			for(ItemAPI i : itemList) System.out.println(i);
			
			//SORT BY NAME ASCENDING
			System.out.println("\n\nSORT BY NAME - ASCENDING");
			System.out.println("========================");
			Collections.sort(itemList,(o1,o2)-> {return o1.getName().compareToIgnoreCase(o2.getName());});
			for(ItemAPI i : itemList) System.out.println(i);
			
			//SORT BY NAME DESCENDING
			System.out.println("\n\nSORT BY NAME - DESCENDING");
			System.out.println("=========================");
			Collections.sort(itemList,(o1,o2)-> {return o2.getName().compareToIgnoreCase(o1.getName());});
			for(ItemAPI i : itemList) System.out.println(i);
			
			//SORT BY DESCRIPTION ASCENDING
			System.out.println("\n\nSORT BY DESCRIPTION - ASCENDING");
			System.out.println("===============================");
			Collections.sort(itemList,(o1,o2)-> {return o1.getDescription().compareToIgnoreCase(o2.getDescription());});
			for(ItemAPI i : itemList) System.out.println(i);
			
			//SORT BY DESCRIPTION DESCENDING
			System.out.println("\n\nSORT BY DESCRIPTION - DESCENDING");
			System.out.println("================================");
			Collections.sort(itemList,(o1,o2)-> {return o2.getDescription().compareToIgnoreCase(o1.getDescription());});
			for(ItemAPI i : itemList) System.out.println(i);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Costco";
	}
}

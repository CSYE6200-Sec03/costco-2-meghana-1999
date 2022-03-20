package org.gdp;
import java.util.*;
	/**
	 * TOTAL POINTS: 100
	 * 
	 * Student TODO:
	 *  
	 *  2 POINTS	Create a class ConvertUtility with methods for conversion of String representation of numerical values WITH EXCEPTION HANDLING into their correct numerical data types
	 *  8 POINTS	Create a class ItemAPI
	 *  
	 *  2 POINTS	Derive a class Durable from ItemAPI (attributes of weight, weight units)
	 *  8 POINTS	Create a class DurableFactory (lazy singleton GoF Factory method pattern)
	 *  
	 *  2 POINTS	Derive a class Service from ItemAPI (attributes of start time, end time, time units)
	 *  8 POINTS	Create a class ServiceFactory (eager singleton GoF Factory method pattern)
	 *  
	 *  2 POINTS	Derive a class Costco derived from Abstract class StoreAPI
	 *  8 POINTS    Create a Costco static demo method to 1) add the following items (CSV) USING FACTORIES AND IN FOLLOWING ORDER:
	 * 
					"2,3.49,OJ,Tropicana Oriage Juice", 
					"1,2.49,Cheese,Provolone cheese",
					"3,1.49,Milk,Almond Milk", 
					"4,0.89,Snack,Mounds chocolate bar" 
					"6,384.49,Treadmill,Voyager Pro Treadmill,98.3,kg", 
					"5,12.49,Chair,folding chair,2.89,Lbs",
					"7,101.49,Mattress,Air Mattress,27.6,kg", 
					"8,6.89,Slippers,bath slippers,2.5,oz" 
					"9,596.89,Vacation,Tropical Hawaii Vacation Package,3/12/22,3/18/22,dates",
					"10,35.00,Lessons,Guitar Lessons,3:30pm,4:00pm,hours"
	 * 
	 *  4 POINTS	SORT all items BY ID ASCENDING AND DESCENDING (in Costco static demo method) 
	 *  4 POINTS	SORT all items BY PRICE ASCENDING AND DESCENDING (in Costco static demo method) 
	 *  
	 *  4 POINTS	SORT all items BY NAME ASCENDING AND DESCENDING (in Costco static demo method) 
	 *  3 POINTS	SORT all items BY DESCRIPTION ASCENDING AND DESCENDING (in Costco static demo method) 
	 * 
	 * 
	 * Using this Midterm class, complete the code to meet all the requirements (Student TODO) ...
	 * 
	 * 
	 * 5 POINTS:	demonstrate use of static data
	 * 5 POINTS:	demonstrate use of immutable data
	 * 
	 * 10 POINTS:	demonstrate Object Oriented Principle of Abstraction
	 *  5 POINTS:	demonstrate Object Oriented Principle of Encapsulation
	 * 10 POINTS:	demonstrate Object Oriented Principle of Inheritance
	 * 10 POINTS:	demonstrate Object Oriented Principle of Polymorphism
	 * 
	 * 
	 * @author dgpeters
	 *
	 */
	public class Midterm {
		/**
		 * Student TODO:
		 * complete the implementation of the required methods in demo()
		 * called here by Driver main() method
		 * 
		 * @param args
		 */
		
		
		public static void demo() {
			System.out.println(Midterm.class.getName() + ".main()...");
			
//			Midterm obj = new Midterm();
//			obj.demoAbstraction();		// Student TODO implementation
//			obj.demoEncapsulation();	// Student TODO implementation
//			obj.demoInheritance();		// Student TODO implementation
//			obj.demoPolymorphism();		// Student TODO implementation
//			obj.demoStaticData();		// Student TODO implementation
//			obj.demoImmutableData();	// Student TODO implementation
			
			Costco.demo();	// demonstrate Costo app
			
			System.out.println(Midterm.class.getName() + ".main()... done!");
		}
		@Override
		public String toString() {
			return "Midterm []";
		}
		private int number=60;
		static int s=70;
		/**
		 * Student TODO:
		 * using this class, demonstrate the Object Oriented Principle of Abstraction
		 * BOTH
		 * a. data hiding
		 * b. functionality hiding
		 */
		public void demoAbstraction() {
			System.out.println("\n\t demoAbstraction...");
			List<String> l= new ArrayList<>();

		}	
		/**
		 * Student TODO:
		 * using this class, demonstrate the Object Oriented Principle of Encapsulation
		 */
		public void demoEncapsulation() {
			System.out.println("\n\t demoEncapsulation...");
			System.out.println(number);
		}
		/**
		 * Student TODO:
		 * using this class, demonstrate the Object Oriented Principle of Inheritance
		 */
		public void demoInheritance() {
			System.out.println("\n\t demoInheritance...");
			System.out.println(Object.class.getSimpleName());
		}
		/**
		 * Student TODO:
		 * using this class, demonstrate the Object Oriented Principle of Polymorphism
		 */
		public void demoPolymorphism() {
			System.out.println("\n\t demoPolymorphism...");
			
			toString();
		}
		/**
		 * Student TODO:
		 * using this class, demonstrate the use of static data
		 */
		public void demoStaticData() {
			System.out.println("\n\t demoStaticData...");
			/**
			 * Student TODO: complete implementation
			 */
			System.out.println(s);
			
		}
		/**
		 * Student TODO:
		 * using this class, demonstrate the use of immutable data
		 */
		public void demoImmutableData() {
			System.out.println("\n\t demoImmutableData...");
			/**
			 * Student TODO: complete implementation
			 */
			 final int s=40;
			
		}
	}

}

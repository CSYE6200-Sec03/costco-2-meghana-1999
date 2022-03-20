package org.gdp;
public class Midterm {

	public static void demo() {
		System.out.println(Midterm.class.getName() + ".main()...");
		Midterm obj = new Midterm();
		obj.demoInheritance();    
		obj.demoPolymorphism();  
		System.out.println(Midterm.class.getName() + ".main()... done!");
	}

	
	@Override
	public String toString() {
		return "Method Overriding";
	}
	
	
	public String toString(String s) {
		return "Method Overloading";
	}



	public void demoAbstraction() {
		System.out.println("\n\t demoAbstraction...");

	}

	public void demoEncapsulation() {
		System.out.println("\n\t demoEncapsulation...");

	}

	public void demoInheritance() {
		System.out.println("\n\t demoInheritance...");
		
		System.out.println("\t Inheritance Demonstration");
		System.out.println("\t "+getClass().getName()+"\n");
	}

	public void demoPolymorphism() {
		System.out.println("\n\t demoPolymorphism...\n");
		
		Midterm obj = new Midterm();
		System.out.println("\t Run time Polymorphism Demonstration");
		System.out.println("\t "+obj);
		System.out.println("\n\t Compile time Polymorphism Demonstration");
		System.out.println("\t "+obj.toString(""));
	}

	public void demoStaticData() {
		System.out.println("\n\t demoStaticData...");
	}

	public void demoImmutableData() {
		System.out.println("\n\t demoImmutableData...");

	}
}

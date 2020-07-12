package design_patterns;

public class ClassLoading {
	
	//Singleton -- single to N (single object will be created for an application)
	//developer should use only one object
	//developer cannt create this instance accidently
	
	public static void main(String[] args) {
	//	System.out.println("class not loaded");
		try {
			Class.forName("design_patterns.Singleton_CoffeeVendingMachine3");
			System.out.println("class is loaded");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("class is not loaded");
			
		}
		Singleton_CoffeeVendingMachine2 singleton_CoffeeVendingMachine = 
				Singleton_CoffeeVendingMachine2.getInstanceSingletonCoffeeVendingMachine();
		singleton_CoffeeVendingMachine.brewCupOfCoffee();
		System.out.println(singleton_CoffeeVendingMachine);
//		System.out.println(singleton_CoffeeVendingMachine);
//		Singleton_CoffeeVendingMachine2 singleton_CoffeeVendingMachine2 = 
//				Singleton_CoffeeVendingMachine2.getInstanceSingletonCoffeeVendingMachine();
//		singleton_CoffeeVendingMachine.brewCupOfCoffee();
//		System.out.println(singleton_CoffeeVendingMachine2);
		
	//cannot initialize the object as its private
	//	Singleton_CoffeeVendingMachine singleton_CoffeeVendingMachine1 = new Singleton_CoffeeVendingMachine();
		
	}

}

//how to construct a singleton
class Singleton_CoffeeVendingMachine3{
	
	//step 1 - create a variable which is 1. private 2. static 3. final
	private static Singleton_CoffeeVendingMachine3 INSTANCE_SINGLETON_COFFEE_VENDING_MACHINE;
	
	//step 2 - create a private constructor
	private Singleton_CoffeeVendingMachine3 () {
		
	}
	
	//Step 2.1 - add a static block to initialize and handle exception
	static {
		try {
			INSTANCE_SINGLETON_COFFEE_VENDING_MACHINE = new Singleton_CoffeeVendingMachine3();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
		//step 3 - create the accessor to access the instance
	public static Singleton_CoffeeVendingMachine3 getInstanceSingletonCoffeeVendingMachine() {
		return INSTANCE_SINGLETON_COFFEE_VENDING_MACHINE;
	}
	
	//business method
public void brewCupOfCoffee() {
	System.out.println("A hot cup of coffee brewed");
	
}
	
	
}
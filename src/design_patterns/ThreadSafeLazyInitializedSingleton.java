package design_patterns;

public class ThreadSafeLazyInitializedSingleton {
	
	//Singleton -- single to N (single object will be created for an application)
	//developer should use only one object
	//developer cannt create this instance accidently
	
	public static void main(String[] args) {
		Singleton_CoffeeVendingMachine4 Singleton_CoffeeVendingMachine4 = 
				design_patterns.Singleton_CoffeeVendingMachine4.getInstanceSingletonCoffeeVendingMachine4();
		System.out.println(Singleton_CoffeeVendingMachine4);
		//design_patterns.Singleton_CoffeeVendingMachine4.getInstanceSingletonCoffeeVendingMachine1();
//		Singleton_CoffeeVendingMachine1.brewCupOfCoffee();
//		Singleton_CoffeeVendingMachine1 Singleton_CoffeeVendingMachine2 = 
//		design_patterns.Singleton_CoffeeVendingMachine1.getInstanceSingletonCoffeeVendingMachine1();
//		Singleton_CoffeeVendingMachine1.brewCupOfCoffee();
//		System.out.println(Singleton_CoffeeVendingMachine1);
//		System.out.println(Singleton_CoffeeVendingMachine2);
//		
	//cannot initialize the object as its private
	//	Singleton_CoffeeVendingMachine1 Singleton_CoffeeVendingMachine11 = new Singleton_CoffeeVendingMachine1();
		
	}

}

//how to construct a singleton
class Singleton_CoffeeVendingMachine4{
	
	//step 1 - create a variable which is 1. private 2. static 3. final
	private static Singleton_CoffeeVendingMachine4 INSTANCE_SINGLETON_COFFEE_VENDING_MACHINE 
	= new Singleton_CoffeeVendingMachine4();
	
	//step 2 - create a private constructor
	private Singleton_CoffeeVendingMachine4() {
		
	}
	//step 3 - create the accessor to access the instance
	public static synchronized Singleton_CoffeeVendingMachine4 getInstanceSingletonCoffeeVendingMachine4() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("in exception");
		}
		if (INSTANCE_SINGLETON_COFFEE_VENDING_MACHINE==null) {
		
		INSTANCE_SINGLETON_COFFEE_VENDING_MACHINE = new Singleton_CoffeeVendingMachine4();
		}
		return INSTANCE_SINGLETON_COFFEE_VENDING_MACHINE;
	}
	
	//business method
public void brewCupOfCoffee() {
	System.out.println("A hot cup of coffee brewed");
	
}
	
	
}
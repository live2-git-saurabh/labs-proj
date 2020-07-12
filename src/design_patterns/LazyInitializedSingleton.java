package design_patterns;

public class LazyInitializedSingleton {
	
	//Singleton -- single to N (single object will be created for an application)
	//developer should use only one object
	//developer cannt create this instance accidently
	
	public static void main(String[] args) {
		Singleton_CoffeeVendingMachine1 Singleton_CoffeeVendingMachine1 = 
		design_patterns.Singleton_CoffeeVendingMachine1.getInstanceSingletonCoffeeVendingMachine1();
		Singleton_CoffeeVendingMachine1.brewCupOfCoffee();
		Singleton_CoffeeVendingMachine1 Singleton_CoffeeVendingMachine2 = 
		design_patterns.Singleton_CoffeeVendingMachine1.getInstanceSingletonCoffeeVendingMachine1();
		Singleton_CoffeeVendingMachine1.brewCupOfCoffee();
		System.out.println(Singleton_CoffeeVendingMachine1);
		System.out.println(Singleton_CoffeeVendingMachine2);
		
	//cannot initialize the object as its private
	//	Singleton_CoffeeVendingMachine1 Singleton_CoffeeVendingMachine11 = new Singleton_CoffeeVendingMachine1();
		
	}

}

//how to construct a singleton
class Singleton_CoffeeVendingMachine1{
	
	//step 1 - create a variable which is 1. private 2. static 3. final
	private static Singleton_CoffeeVendingMachine1 INSTANCE_SINGLETON_COFFEE_VENDING_MACHINE 
	= new Singleton_CoffeeVendingMachine1();
	
	//step 2 - create a private constructor
	private Singleton_CoffeeVendingMachine1() {
		
	}
	//step 3 - create the accessor to access the instance
	public static Singleton_CoffeeVendingMachine1 getInstanceSingletonCoffeeVendingMachine1() {
		if (INSTANCE_SINGLETON_COFFEE_VENDING_MACHINE==null) {
		
		INSTANCE_SINGLETON_COFFEE_VENDING_MACHINE = new Singleton_CoffeeVendingMachine1();
		}
		return INSTANCE_SINGLETON_COFFEE_VENDING_MACHINE;
	}
	
	//business method
public void brewCupOfCoffee() {
	System.out.println("A hot cup of coffee brewed");
	
}
	
	
}
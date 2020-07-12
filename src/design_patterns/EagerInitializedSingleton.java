package design_patterns;

public class EagerInitializedSingleton {
	
	//Singleton -- single to N (single object will be created for an application)
	//developer should use only one object
	//developer cannt create this instance accidently
	
	public static void main(String[] args) {
		Singleton_CoffeeVendingMachine singleton_CoffeeVendingMachine = 
				Singleton_CoffeeVendingMachine.getInstanceSingletonCoffeeVendingMachine();
		singleton_CoffeeVendingMachine.brewCupOfCoffee();
		System.out.println(singleton_CoffeeVendingMachine);
		
	//cannot initialize the object as its private
	//	Singleton_CoffeeVendingMachine singleton_CoffeeVendingMachine1 = new Singleton_CoffeeVendingMachine();
		
	}

}

//how to construct a singleton
class Singleton_CoffeeVendingMachine{
	
	//step 1 - create a variable which is 1. private 2. static 3. final
	private static final Singleton_CoffeeVendingMachine INSTANCE_SINGLETON_COFFEE_VENDING_MACHINE 
	= new Singleton_CoffeeVendingMachine();
	
	//step 2 - create a private constructor
	private Singleton_CoffeeVendingMachine () {
		
	}
	//step 3 - create the accessor to access the instance
	public static Singleton_CoffeeVendingMachine getInstanceSingletonCoffeeVendingMachine() {
		return INSTANCE_SINGLETON_COFFEE_VENDING_MACHINE;
	}
	
	//business method
public void brewCupOfCoffee() {
	System.out.println("A hot cup of coffee brewed");
	
}
	
	
}
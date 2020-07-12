package Java8;

public class RunnableLambda {
	
	//Every program in java starts with a single thread - main thread
	public static void main(String[] args) {
		//traditionalThreading();
		//UsingRunnable();
		//usingAnonymousClass();		
		//usingRunnableWithLambda();
		usingLambdaConcise();
	}

	private static void usingLambdaConcise() {
		new Thread(() -> System.out.println("anonymous class used here for child thread ")).start();
	}

	private static void usingRunnableWithLambda() {
		Runnable runnableLambda = () -> System.out.println("anonymous classes used here with lambda expression");
		Thread thread = new Thread(runnableLambda);
		thread.start();
	}
	


	private static void usingAnonymousClass() {
		new Thread() {
			@Override			
				public void run() {
				System.out.println("anonymous class used here for child thread ");
			}
		
			}.start();
	}

	private static void UsingRunnable() {
		TestThreadRunnable testThreadRunnable = new TestThreadRunnable();
		Thread thread = new Thread(testThreadRunnable);
		thread.start();
	}

	private static void traditionalThreading() {
		//Print the name of main thread
		String threadNameString = Thread.currentThread().getName();
		System.out.println(threadNameString);	
		System.out.println(Thread.currentThread().getId());
		TestThread testThread = new TestThread();
		testThread.start();
	}
	
}

class TestThread extends Thread {
	@Override
	public void run() {
		Thread.currentThread().setName("Child Thread Renamed");
		System.out.println(Thread.currentThread().getId());
		System.out.println("Child Thread : TestThread run()");
		System.out.println(Thread.currentThread().getName());
	}
}

class TestThreadRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println(" test");
	}
}
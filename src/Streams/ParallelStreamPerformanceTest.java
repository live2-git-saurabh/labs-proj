package Streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamPerformanceTest {
	public static void main(String[] args) {
		sequentialStream();

	}

	private static long sequentialStream() {
		// create the source list
		List<Integer> productList = new ArrayList<Integer>();

		productList.add(1000);
		for (int i = 0; i < 100; i++) {
			int lastValue = productList.get(i);
			productList.add(lastValue + 1000);
		}
		System.out.println("BEFORE PROCESSING " + productList);
		System.out.println("Input List ---> " + productList);
		
		
		//productList.stream().filter(element -> (element > 5000 && element <10000)).forEach(System.out::println);
		
/*		for (int i = 0; i < productList.size();i++) {
			
			if (productList.get(i).intValue() > 5000 && productList.get(i).intValue()  < 10000 ) {
				System.out.println(productList.get(i).intValue() );
			}
			
		} */
		
		
	//	for (Integer i:productList) {
			
	//		if (i> 5000 && i <10000) {
	//			System.out.println(i);
	//		}
	//	}
		

	List serialList = new ArrayList();
		return 0;
	}
}
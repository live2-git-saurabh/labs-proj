package Java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {
	
	public static void main(String[] args) {
		ObjectInstabceMethodReference();
		
	}

	private static void ObjectInstabceMethodReference() {
		List<String> namesList = new ArrayList<String>();
		namesList.add("Tony");
		namesList.add("Robin");
		
		// @FunctionalInterface
		// public void consumber
		// public void Accept (T t)
		
		
		namesList.forEach(item -> System.out.println(item));
		namesList.forEach(System.out::println);
	}

}

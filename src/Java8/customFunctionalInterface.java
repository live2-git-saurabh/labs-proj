package Java8;

public class customFunctionalInterface {
	public static void main(String[] args) {
		Integer [] intArrayIntegers = {5, 6, 7, 8};
		Counter counter1 = Utils::counterElements;
		System.out.println(counter1.count(intArrayIntegers));
		Utils utils = new Utils();
		Counter counter2 = utils::counterElementInstance;
		System.out.println(counter2.count(intArrayIntegers));
	}
	
	@FunctionalInterface
interface Counter {
		int count(Object[] objArray);
			}
}

class Utils {
	
	public static int counterElements(Object[] array) {
		return array.length;
	}
	
	public int counterElementInstance(Object[] array) {
		return array.getClass().getModifiers();
	}
}
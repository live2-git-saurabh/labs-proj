package Java7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PolymorphismUsingWrappers {
	
	public static void main(String[] args) {
		
		//primitiveType();
		
		int i = 1;
		float f = 500.05f;
		char c = 'A';
		boolean myboolean = true;
		
		List list = new ArrayList();
		list.add(i);
		list.add(f);
		list.add(c);
		list.add(myboolean);
		
		System.out.println(list);
		
		HashMap<String, Object> map  = new HashMap<>();
		map.put("Integer", new Integer(i));
		map.put("float", new Float(f));
		map.put("char", new Character(c));
		map.put("boolean", new Boolean(myboolean));
		
		System.out.println(map);
		
		
		
	

}

	private static void primitiveType() {
		int i = 1;
		char myChar = 'A';
		

		Object objects[] = new Object[2];
		objects[0] = new Integer(i);
		objects[1] = new Character(myChar);
		
for (Object object : objects) {
	System.out.println(object);
	
}
	}
		
		
	}



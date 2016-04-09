package reversearray;

import java.util.ArrayList;
import java.util.Collections;

public class Array1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList arrayList = new ArrayList();
	      arrayList.add("1");
	      arrayList.add("2");
	      arrayList.add("3");
	      arrayList.add("4");
	      arrayList.add("5");
	      System.out.println("Before Reverse Order: " + arrayList);
	      Collections.reverse(arrayList);
	      System.out.println("After Reverse Order: " + arrayList);
	}
	
	
}

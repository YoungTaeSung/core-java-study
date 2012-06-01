package czymongrel.generic.basic;

/*
 * Date: 2012.02.15
 * Subject: Generics, bounding type variables
 */

class Things implements Comparable {
	public static final int id = 101;

	@Override
	public int compareTo(Object o) {
		return 0;
	}
}
class BoundedArrayAlgorithm {
	public static <T extends Comparable<T>>T minElem(T[] array) {
		if(array == null || array.length == 0) return null;
		T min = array[0];
		for(int i=0; i<array.length; i++) {
			if(min.compareTo(array[i])>0)
				min = array[i];
		}
		return min;
	}
}
public class BoundingTypeVarTest {
	private static final String msg = "BoundingTypeVarTest";
	public static void main(String[] args) {
		String[] array = {"Hello", "there,", "My", "Name is", "Bob!", "A Ha!!"};
		String minString = BoundedArrayAlgorithm.minElem(array);
		System.out.println("Min String = "+minString);
		
		Things[] arrayThings = {new Things(), new Things()};
		Things minThing = BoundedArrayAlgorithm.minElem(arrayThings);
		System.out.println("Min Thing = "+minThing.id);
		System.exit(0);
	}
}

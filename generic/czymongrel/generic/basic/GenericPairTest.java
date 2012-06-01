package czymongrel.generic.basic;

import java.io.Serializable;

/*
 * Sample error code
 */
//class ArrayUtility {
//	public static <T> T min(T[] array) {
//		if(array==null || array.length==0) return null;
//		T minElement = array[0];
//		for(int i=1; i<array.length; i++) {
//			if(minElement.compareTo(array[i])>0)
//				minElement = array[i];
//		}
//		return minElement;
//	}
//}
class ArrayAlgorithm {
	//Using "generic class" for return type
	public static GenericPair<String> minMax(String[] strArray) {
		if(strArray == null || strArray.length == 0) return null;
		String min=strArray[0];
		String max=strArray[0];
		for(int i=1; i<strArray.length; i++) {
			if(min.compareTo(strArray[i]) > 0) min = strArray[i];
			if(max.compareTo(strArray[i]) < 0) max = strArray[i];
		}
		return new GenericPair<String>(min, max);
	}
	//Using "generic method" for get middle element of array
	public static <T>T getMiddle(T[] array) {
		return array[array.length/2];
	}
	//Using "type variable bounding"
	public static <T extends Comparable<T>> GenericPair<T> minMax2(T[] array) {
		if(array==null || array.length==0) return null;
		T min = array[0];
		T max = array[0];
		for(int i=1; i<array.length; i++) {
			if(min.compareTo(array[i])>0) min = array[i];
			if(max.compareTo(array[i])<0) max = array[i];
		}
		return new GenericPair<T>(min, max);
	}
}
public class GenericPairTest {
	public static void main(String[] args) {
		//#1. Test for minMax method!!
		String[] array = {"Volvo", "Max", "Min", "Carry", "Volt", "Java", "C"};
		GenericPair<String> result = ArrayAlgorithm.minMax(array);
		System.out.println("Min Str = "+result.getFirst());
		System.out.println("Max Str = "+result.getSecond());
		
		result = ArrayAlgorithm.minMax2(array);
		System.out.println("Min Str = "+result.getFirst());
		System.out.println("Max Str = "+result.getSecond());
		
		//#2. Test for getMiddle method!!
		String middleStr = ArrayAlgorithm.getMiddle(array);
		System.out.println("Middle Str = "+middleStr);
		
		//#3. Test for getMiddle method with illegal arguments!!
		//double middleDouble = ArrayAlgorithm.getMiddle(3.14, 1988, 0);
		System.exit(0);
	}
}

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeArrays {

	public static void mergeCommonArrays(int arr1[], int arr2[]) {

		// creating hashsets
		Set<Integer> set1 = new HashSet();
		Set<Integer> set2 = new HashSet();

		// Adding elements from array1

		for (int i : arr1) {
			set1.add(i);

		}
		
		// Adding elements from array2

		for (int i : arr2) {
			set2.add(i);

		}
		
		set1.retainAll(set2);
		System.out.println("Common Elements"+set1);

	}

	public static void main(String[] args) {

		// initializing two arrays
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = { 5, 6, 7 ,1};
		 // print Array 1
        System.out.println("Array 1: "
                           + Arrays.toString(arr1));
        
        // print Array 2
        System.out.println("Array 2: "
                           + Arrays.toString(arr2));
        mergeCommonArrays(arr1,arr2);

	}

}

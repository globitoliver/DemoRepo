import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeLinkedlist {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		System.out.println("Element in Array 1-->"+l1);

		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		System.out.println("Element in Array 1-->"+l2);

		l2.retainAll(l1);
		System.out.println("After Eliminating duplicate elements from array Array 1 and Array 2-->" + l1);
		

	}

}

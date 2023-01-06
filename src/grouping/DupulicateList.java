package grouping;

import java.util.ArrayList;
import java.util.List;

public class DupulicateList {

	public static void main(String[] args) {
		List<Integer> listA = new ArrayList<Integer>();
		listA.add(1);
		listA.add(2);
		listA.add(3);
		listA.add(4);

		List<Integer> listB = new ArrayList<Integer>();
		listB.add(3);
		listB.add(4);
		listB.add(5);
		listB.add(6);

		List<Integer> listX = new ArrayList<Integer>();// 1,2
		List<Integer> listY = new ArrayList<Integer>();// 3,4
		List<Integer> listZ = new ArrayList<Integer>();// 5,6
		for (Integer a : listA) {// 4번반복

			if (!listB.contains(a)) {//
				listX.add(a);
			} else if (listB.contains(a)) {
				listY.add(a);

			}

		}
		for (Integer b : listB) {
			if (!listA.contains(b)) {
				listZ.add(b);
			}
		}
		System.out.println(listX);
		System.out.println(listY);
		System.out.println(listZ);
	}
}

package com.basic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class IntegerComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer num1, Integer num2) {
		// TODO Auto-generated method stub
		return Integer.compare(num2, num1);
	}

}

public class TestCompartor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(50);
		list.add(75);
		list.add(100);
		list.add(100);

		Collections.sort(list, new IntegerComparator());

		for (Integer values : list) {
			System.out.println(values);
		}

	}

}

package com.basic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/*
Integer.compare(num2, num1) is a method call that compares two integer values num2 and num1. 
It returns an integer value that indicates the ordering of these two numbers:

If num2 is less than num1, it returns a negative integer.
If num2 is equal to num1, it returns 0.
If num2 is greater than num1, it returns a positive integer


Integer.compare(num1, num2) compares two integers in ascending order,
 while Integer.compare(num2, num1) compares them in descending order.
*/

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

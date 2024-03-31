package com.basic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//If you want to sort your list in some other order use comparator interface.
//Comparator is a template class, mention the type of object you are going to work with.

class LengthSort implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub

		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 < len2)
			return -1;
		else if (len1 > len2)
			return 1;
		return 0;
	}
}

class AlphabeticalSort implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

}

class ReverseAlphabeticalSort implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}

}

class SortForInteger implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

}




 class Employee{
	private int id;
	private String name;
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return "id " +id+": "+ "name "+name ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

public class Sorting {

	// Collection's sort method is used to arrange in natural order.
	// For strings it's going to sort alphabetically, for integer it's going to sort
	// in a numerical order.

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("Hello");
		list.add("world");
		list.add("this");
		list.add("program");
		list.add("should");
		list.add("sort");

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

		List<Integer> listInt = new ArrayList<>();
		listInt.add(10);
		listInt.add(78);
		listInt.add(45);
		listInt.add(13);
		listInt.add(9);
		System.out.println(listInt);
		Collections.sort(listInt);
		System.out.println(listInt);

		System.out.println("After Length Sort Comparator");
		Collections.sort(list, new LengthSort());
		// Collections.sort(list, new AlphabeticalSort());
		// Collections.sort(list, new ReverseAlphabeticalSort());
		System.out.println(list);

		System.out.println("Sort for Integers");
		Collections.sort(listInt, new SortForInteger());
		System.out.println(listInt);
		
		
		///////////////// Sorting Custom Objects /////////////////////////////
		List<Employee> employees =  new ArrayList<>();
		employees.add(new Employee(1,"Sue"));
		employees.add(new Employee(2,"Pam"));
		employees.add(new Employee(4,"Micah"));
		employees.add(new Employee(3,"Sarah"));
		
		
		Collections.sort(employees, new Comparator<Employee> () {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				int id1=o1.getId();
				int id2=o2.getId();
				
				if (id1<id2) return -1;
				else if(id1>id2) return 1;
						
				return 0;
			}
			
		});
		
		
		
		 
		for(Employee values: employees) {
			System.out.println(values.toString());
		}

		
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		for(Employee values: employees) {
			System.out.println(values.toString());
		}
		
	}

}

package com.basic.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Person{
	private int id;
	private String name;
	
	
	public Person(int id, String name) {
		this.id= id;
		this.name=name;
		
	}
	
	public String toString() {
		return " [Id id is: " + id+ " and the name is: "+ name +"]" ;
	}
 
	/*
	 * For your custom objects in Set or Map in java to behave ideally 
	 * implement hashcode and equals method 
	 * */
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	

	
	
	
}
public class CustomObjectsInCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1= new Person(1,"Bob");
		Person p2= new Person(2,"Sue");
		Person p3= new Person(3,"Mike");
		Person p4= new Person(1,"Bob");
		
		//If you don't implement hascode and equals method, The map can have duplicate keys  
		Map<Person,Integer> personMap =  new HashMap<>();
		personMap.put(p1, 1);
		personMap.put(p2, 2);
		personMap.put(p3, 3);
		personMap.put(p4, 4);
		
		System.out.println(personMap);
		
		
		// The set can have duplicate values  
		Set<Person> personSet = new HashSet<>();
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);
		
		System.out.println(personSet);

	}

}

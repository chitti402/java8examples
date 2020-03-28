package com.java8;

import java.util.ArrayList;
import java.util.List;

public class java8LamdaonList {
	
	public static void main(String[] args) {
	List<String> name= new ArrayList<String>();
	name.add("A");
	name.add("B");
	name.add("C");
	name.add("D");
	name.add("E");
	name.add("F");
	name.forEach(names->System.out.print(names));
}
}

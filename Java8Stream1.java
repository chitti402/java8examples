package com.java8;

import java.util.ArrayList;
import java.util.List;

public class Java8Stream1 {

	public static void main(String[] args) {
		List<String> names= new ArrayList<String>();
		names.add("one");
		names.add("two");
		names.add("three");
		
int count=(int) names.stream().filter(str->str.length()<6).count();
System.out.println(count);
	}
}

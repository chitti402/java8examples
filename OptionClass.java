package com.java8;

import java.util.Optional;

public class OptionClass {

	public static void main(String[] args) {
		String[] strings= new String[10];
		Optional<String> opt=Optional.ofNullable(strings[9]);
		if(opt.isPresent()) {
		String str=strings[9].substring(1,8);
		System.out.println(str);
		}
		else {
			System.out.println("optional class not found");
		}
	
	strings[9]="chittibabu";
	Optional<String> optl=Optional.ofNullable(strings[9]);
	if(optl.isPresent()) {
	String str=strings[9].substring(1,8);
	System.out.println(str);
	}
	else {
		System.out.println("optional class not found");
	}
	}
}

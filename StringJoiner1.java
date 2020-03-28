package com.java8;
import java.util.StringJoiner;
public class StringJoiner1 {

	public static void main(String[] args) {
		StringJoiner sj= new StringJoiner("+");
		sj.add("one");
		sj.add("two");
		sj.add("three");
		sj.add("four");
		sj.add("five");
		System.out.println(sj);
	

	}

}

package com.java8;
@FunctionalInterface
interface myfuntional{
	public void add(int a);
}
public class Java8oneParameter {

	public static void main(String[] args) {
		myfuntional myf=(int a)->System.out.println(a*5);
	myf.add(4);	
	}

}

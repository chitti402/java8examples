package com.java8;
@FunctionalInterface
interface funinterface  {

	public String sayHello();
}
public class Java8Lamdanoparam{
	public static void main(String[] args) {
		funinterface fun=()-> { return "hey world";};
		System.out.print(fun.sayHello());
	}
}
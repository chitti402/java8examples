package com.java8;
@FunctionalInterface
interface myfunctional2{
	public void adding(String a, String b);
}
public class java8Lamdawithtwoparameters {

	
	public static void main(String[] args) {
		myfunctional2 fu = (str1,str2) -> System.out.println("Hello "+str1+str2);
		fu.adding("chitti ","Achanta");

	}

}

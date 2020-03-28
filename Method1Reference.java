package com.java8;
@FunctionalInterface
interface myinter{
	public void myresign();
}
public class Method1Reference {
	public void display() {
		System.out.print("cominh"); 
	}
	public static void main(String[] args) {
		Method1Reference mir = new Method1Reference();
		myinter myi= mir::display;
		myi.myresign();

	}

}

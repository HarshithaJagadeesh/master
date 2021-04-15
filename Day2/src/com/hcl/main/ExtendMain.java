/**
 * Java code tp demonstrate inheritance
 * And runtime polymorphism
 * 
 */
package com.hcl.main;

import com.hcl.model.A;
import com.hcl.model.B;

public class ExtendMain {

	public static void main(String[] args) {
		A a = new A(4, 3);
		B b = new B(8, 9);

		a.display();
		b.display();

		a = null;
		b = null;
	}

}

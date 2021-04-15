/**
 * 
 * To correct the errors in the code snippet
 */

package com.hcl.main;

import com.hcl.model.CodeSnippetA;
import com.hcl.model.CodeSnippet_B;
import com.hcl.model.CodeSnippet_C;

public class SnippetMain {
	static int a = 555;
	
	public static void main(String[] args) {
		CodeSnippetA objA = new CodeSnippetA(); 

		CodeSnippet_B objB1 = new CodeSnippet_B(); 

		CodeSnippet_B objB2 = new CodeSnippet_B(); 

		CodeSnippet_C objC1 = new CodeSnippet_C(); 

		CodeSnippet_B objC2 = new CodeSnippet_C(); 

		CodeSnippetA objC3 = new CodeSnippet_C(); 

        objA.display(); 

        objB1.display(); 

        objB2.display(); 

        objC1.display(); 

        objC2.display(); 

        objC3.display(); 	

	}

}

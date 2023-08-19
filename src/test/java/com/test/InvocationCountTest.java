package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount=10)
	public void sum() {
		int a = 2;
		int b = 3;
		int c = a + b;
		System.out.println("The sume is = " + c);
	}

}

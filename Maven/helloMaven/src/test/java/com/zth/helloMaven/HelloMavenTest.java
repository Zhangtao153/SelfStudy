package com.zth.helloMaven;

import static org.junit.Assert.*;
public class HelloMavenTest {

	public void testSayHello() {
		HelloMaven hello = new HelloMaven();
		String str = hello.sayHello();
		
		assertEquals("hello",str);
	}
}

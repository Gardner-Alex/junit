package junit;

import static org.junit.Assert.*;

import org.junit.*;

public class junitTest {

	int a = 10;
	int b = 5;
	String c = "Hello";
	String d = "World";
	
	@Test
	public void Division() {
		System.out.println("If test is correct");
	assertTrue( a / b == 2);
	}
	
	@Test
	public void Multiplication(){
		System.out.println("If test is correct");
		assertTrue( a * b == 50);
		
	}
	@Test
	public void Addition(){
		System.out.println("If test is correct");
		assertTrue(a + b == 15);
		
	}
	@Test
	public void Subtraction(){
		System.out.println("If test is correct");
		assertTrue(a - b == 5);
		
	}
	@Test
	public void concat(){
		System.out.println("If test is correct");
		String e = c + d;
		assertEquals("HelloWorld", e);
	}
}

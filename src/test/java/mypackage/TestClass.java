package mypackage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class TestClass 
{
	ArrayList<Integer> al=new ArrayList<Integer>();
	
	
	@Test(priority=1,groups= {"Array List"})
	public void Test1()
	{
		al.add(25);
		al.add(50);
		al.add(75);
		
		assertTrue(Calculation.containsElement(al,50));
		System.out.println("Assert True for ArrayList");
	}
	
	@Test(priority=2,groups= {"Array List"})
	public void Test2()
	{
		
		assertFalse(Calculation.containsElement(al,900));
		System.out.println("Assert False for ArrayList");
	}
	
	@Test(groups= {"maximum"})
	public void Test3()
	{
		assertEquals(400,Calculation.findMax(new int[] {10,300,20,400}));
		assertEquals(-1,Calculation.findMax(new int[] {-1,-2,-3,-4}));
		System.out.println("Assert Equals For maximum");
		
	}

}

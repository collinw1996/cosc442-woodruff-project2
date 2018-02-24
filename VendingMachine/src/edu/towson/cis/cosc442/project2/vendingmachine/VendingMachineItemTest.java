package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineItemTest {
	
	/** Declaring necessary test objects for {@link VendingMachineItem} */
	private VendingMachineItem item1, item2;

	/**
	 * Initializes the necessary test objects for the test cases to use.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		item1 = new VendingMachineItem("Fritos", 3.99);
	}

	/**
	 * Test for the getName() method of the {@link VendingMachineItem} class.
	 */
	@Test
	public void testGetName() {
		assertEquals("Fritos", item1.getName());
	}

	/**
	 * Test for the getPrice() method of the {@link VendingMachineItem} class.
	 */
	@Test
	public void testGetPrice() {
		assertEquals(3.99, item1.getPrice(),.001);
	}
	
	/**
	 * Test for the constructor method of the {@link VendingMachineItem} class.
	 */
	@Test(expected = VendingMachineException.class)
	public void testVendingMachineItem() {
		item2 = new VendingMachineItem("Cheetos", -3.99);
	}
	
	/**
	 * Cleans up test objects after a test case is executed.
	 */
	@After
	public void tearDown(){
		item1 = null;
	}
}

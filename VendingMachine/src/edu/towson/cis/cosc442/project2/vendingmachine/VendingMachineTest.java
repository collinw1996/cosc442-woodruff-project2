package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {

	/** Declaring necessary test objects for {@link VendingMachine} */
	VendingMachine items;
	VendingMachineItem item1;

	/**
	 * Initializes the necessary test objects for the test cases to use.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		items = new VendingMachine();
		item1 = new VendingMachineItem("Fritos", 3.99);
	}

	/**
	 * Test for the addItem() method of the {@link VendingMachine} class.
	 */
	@Test
	public void testaddItem() {
		items.addItem(item1, "A");
		assertEquals(item1, items.getItem("A"));
	}

	/**
	 * Test for the removeItem() method of the {@link VendingMachine} class.
	 */
	@Test
	public void testremoveItem() {
		items.addItem(item1, "A");
		items.removeItem("A");
		assertEquals(null, items.getItem("A"));
	}
	
	/**
	 * Test for the insertMoney() method of the {@link VendingMachine} class.
	 */
	@Test
	public void insertMoney() {
		items.insertMoney(3.99);
		assertEquals(3.99, items.getBalance(), .001);
	}
	
	/**
	 * Test for the getBalance() method of the {@link VendingMachine} class.
	 */
	@Test
	public void getBalance() {
		items.insertMoney(3.99);
		assertEquals(3.99, items.getBalance(), .001);
	}
	
	/**
	 * Test for the makePurchase() method of the {@link VendingMachine} class.
	 */
	@Test
	public void makePurchase() {
		items.addItem(item1, "A");
		items.insertMoney(4.00);
		assertEquals(true, items.makePurchase("A"));
		
	}
	
	/**
	 * Test for the returnChange() method of the {@link VendingMachine} class.
	 */
	@Test
	public void returnChange() {
		items.insertMoney(3.99);
		assertEquals(3.99, items.returnChange(), .001);
	}
	
	/**
	 * Cleans up test objects after a test case is executed.
	 */
	@After
	public void tearDown(){
		
	}
}

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CartTest {

	Cart underTest = new Cart(); // pull this out so it has global scope for all tests

	@Test
	public void shouldAddAnItemToTheCartForATotalPriceOf50() {
		Item shoes = new Item("shoes", 50, 1);
		underTest.addItem(shoes);
		int check = underTest.totalPrice();
		assertEquals(50, check);
	}

	@Test
	public void shouldAddAnItemWithQuantityOf2ToTheCartForATotalPriceOf100() {
		Item shoes = new Item("shoes", 50, 2);
		underTest.addItem(shoes);
		int check = underTest.totalPrice();
		assertEquals(100, check);
	}

	@Test
	public void shouldAddTwoSeparateItemsToCartForPriceOf60() {
		// demonstrate 2 ways to add items to cart
		underTest.addItem(new Item("shoes", 50, 1)); // shortcut
		Item shirt = new Item("shirt", 10, 1);
		underTest.addItem(shirt); // declare item by name then reference it
		int check = underTest.totalPrice();
		assertEquals(60, check);
	}

	@Test
	public void shouldHaveTotalPriceOf50AfterRemovingAnItemByName() {
		underTest.addItem(new Item("nikes", 50, 1));
		underTest.addItem(new Item("reeboks", 50, 1)); // added 2 separate shoe orders
		underTest.removeItem("reeboks");
		int check = underTest.totalPrice();
		assertEquals(50, check);
	}

}

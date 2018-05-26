import java.util.ArrayList;
import java.util.List;

public class Cart {

	List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);

	}

	public int totalPrice() {
		int totalPrice = 0;

		for (Item item : items) {
			totalPrice += item.getQuantity() * item.getPrice();
		}
		return totalPrice;
	}

	public void removeItem(String itemName) {
		for (int i = items.size() - 1; i >= 0; i--) {
			if (items.get(i).getName().equals(itemName)) {
				items.remove(i);
			}
		}
	}

	public void showCartItems() {
		for (Item item : items) {
			System.out.println(
					"Item: " + item.getName() + "Price: " + item.getPrice() + " Quantity: " + item.getQuantity());
		}
	}

}

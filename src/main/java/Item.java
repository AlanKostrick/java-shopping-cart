
public class Item {

	private String name;
	private int price;
	private int quantity;

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}


	public Item(String name, int price, int quantity) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}



}

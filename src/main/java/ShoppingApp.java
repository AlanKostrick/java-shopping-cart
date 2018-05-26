import java.util.Scanner;

public class ShoppingApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Cart cart = new Cart();

		System.out.println("Welcome to We Can Code It's online shopping portal");
		System.out.println("We are better than Amazon!");

		System.out.println("Would you like to place an order?(yes/no)");
		String continueShopping = input.nextLine();
		do {
			System.out.println("Enter the name of the item");
			String itemName = input.nextLine();
			System.out.println("Enter the price of the item");
			int price = input.nextInt();
			input.nextLine();
			System.out.println("Enter the quantity of the item");
			int quantity = input.nextInt();
			input.nextLine();

			Item item = new Item(itemName, price, quantity); // generating object from user input
			cart.addItem(item);

			System.out.println("Current Cart:");
			cart.showCartItems();

			System.out.println("Would you like to do anything else?(add/no/remove)");
			continueShopping = input.nextLine();

			if (continueShopping.equals("remove")) {
				System.out.println("Enter the name of the item you would like to remove:");
				itemName = input.nextLine();
				cart.removeItem(itemName);
				System.out.println("Your updated order total is now : " + cart.totalPrice());
				System.out.println("Would you like to do anything else?(add/no/remove)");
				continueShopping = input.nextLine();

			}

		} while (!continueShopping.equals("no"));

		System.out.println("Thanks for shopping with us today!");
		System.out.println("Your final order total is " + cart.totalPrice());

		input.close();
	}
}

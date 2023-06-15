package enumeradores.exercicio3.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import enumeradores.exercicio3.entities.Client;
import enumeradores.exercicio3.entities.Order;
import enumeradores.exercicio3.entities.OrderItem;
import enumeradores.exercicio3.entities.Product;
import enumeradores.exercicio3.entities.enums.OrderStatus;

public class Main {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		Order order = new Order(new Date(), status, client);

		System.out.println("how many items to this order? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i + 1) + " item data: ");
			System.out.println("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.println("Quantity: ");
			int productQuantity = sc.nextInt();

			Product product = new Product(productName, productPrice);

			OrderItem it = new OrderItem(productQuantity, productPrice, product);

			order.addItem(it);
		}

		System.out.println();
		System.out.println(order);

		sc.close();
	}
}

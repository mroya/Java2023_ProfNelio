package polimorfismo.exercicio.application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import polimorfismo.exercicio.entities.ImportedProduct;
import polimorfismo.exercicio.entities.Product;
import polimorfismo.exercicio.entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws Throwable {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Product #" + i + " data: ");
			System.out.print("Commom, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Customs free: ");
				double customsFree = sc.nextDouble();

				Product prod = new ImportedProduct(name, price, customsFree);
				list.add(prod);
			} else if (ch == 'u') {
				System.out.print("Manufacture Date (DD/MM/YYYY):");
				sc.nextLine();
				String manufatureDate = sc.nextLine();
				Date date = sdf.parse(manufatureDate);

				Product prod = new UsedProduct(name, price, date);
				list.add(prod);
			} else {
				Product prod = new Product(name, price);
				list.add(prod);
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product product : list) {
			System.out.println(
					product.getName() + " $ " + String.format("%.2f", product.getPrice()) + product.toString());
		}

		sc.close();

	}

}

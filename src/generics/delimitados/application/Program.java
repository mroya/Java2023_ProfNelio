package generics.delimitados.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import generics.delimitados.entities.Product;
import generics.delimitados.services.CalculationService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		String path = "C:\\temp\\prod.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				// list.add(Integer.parseInt(line));
				line = br.readLine();
			}

			// Integer x = CalculationService.max(list);
			Product x = CalculationService.max(list);
			System.out.println("Max: ");
			System.out.println(x);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}

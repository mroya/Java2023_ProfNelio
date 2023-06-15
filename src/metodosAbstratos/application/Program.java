package metodosAbstratos.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import metodosAbstratos.entities.Circle;
import metodosAbstratos.entities.Rectangle;
import metodosAbstratos.entities.Shape;
import metodosAbstratos.entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectange or Circle (r/c)? ");
			char res = sc.next().toLowerCase().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED):");
			sc.nextLine();
			Color color = Color.valueOf(sc.next());
			if (res == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			} else if (res == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}

		System.out.println();
		System.out.println("Shape Areas: ");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}

		sc.close();

	}

}

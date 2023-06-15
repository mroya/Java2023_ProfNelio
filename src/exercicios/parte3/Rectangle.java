package exercicios.parte3;

public class Rectangle {

	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return 2 * (width + height);
	}

	public double diagonal() {
		return Math.sqrt((Math.pow(width, 2)) + (Math.pow(height, 2)));
	}

	public String toString() {
		return "AREA = " + area()
				+ String.format("%n" + "PERIMETER = " + perimeter() + "%n" + "DIAGONAL = " + diagonal());
	}

}

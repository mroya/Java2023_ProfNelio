package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ArquivoFile {

	public static void main(String[] args) {

		File file = new File("c:\\temp\\in.txt");
		System.out.println(file.getAbsolutePath());
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}

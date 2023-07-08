package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoBufferedWriter {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good Morning", "Good Aftermoon", "Good Night" };
		String path = "c:\\temp\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Arquivo criado com sucesso!");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Rescrito arquivo OUT com sucesso!");

	}

}

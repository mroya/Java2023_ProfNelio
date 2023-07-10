package interfaces.comparable.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interfaces.comparable.entities.Employee;

/*
 * Problema Motivador
 * Faça um programa para ler um arquivo contendo nomes de pessoas(um nome por linha),
 * armazenando-os em uma lista.Depois, ordenar os dados dessa lista e mostra-los
 * ordenadamente na tela.Nota: o caminho do arquivo pode ser informado "hardcode".
 */
public class Program {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		String path = "c:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			Collections.sort(list);
			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}

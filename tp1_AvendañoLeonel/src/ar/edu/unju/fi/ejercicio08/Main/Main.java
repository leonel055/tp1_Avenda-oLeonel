package ar.edu.unju.fi.ejercicio08.Main;
import java.util.Scanner;	
import ar.edu.unju.fi.ejercicio08.Model.*;

public class Main {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Ingrese un numero: ");
			int n = scanner.nextInt();
			
			CalculadoraEspecial calculadora = new CalculadoraEspecial();
			calculadora.setN(n);
			System.out.println("\nEl resultado de la Sumatoria es: "+calculadora.CalcularSumatoria());
			System.out.println("\nEl resultado de la Productoria es: "+calculadora.CalcularProductorial());
			scanner.close();
	}

}

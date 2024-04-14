package ar.edu.unju.fi.ejercicio07.Main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio07.Model.*;

public class Main {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Ingrese nombre del empleado: ");
				String nombre = scanner.nextLine();
			
			System.out.println("Ingrese legajo del empleado: ");
				String legajo = scanner.nextLine();
			
			System.out.println("Ingrese salario del empleado: ");
				int salario = scanner.nextInt();
			
			Empleado empleado = new Empleado(nombre, legajo, salario);
			
			empleado.MostrarDatos();
			empleado.AumentarSalario();
			empleado.MostrarDatos();
			
			scanner.close();

	}

}

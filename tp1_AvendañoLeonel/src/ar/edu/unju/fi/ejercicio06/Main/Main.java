package ar.edu.unju.fi.ejercicio06.Main;
import java.time.LocalDate;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio06.Model.*;

public class Main {

	
	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("Ingrese DNI de Persona1: ");
			String DNI = scanner.nextLine();
				persona1.setDni(DNI);
			System.out.println("Ingrese Nombre de Persona1: ");
			String nombre = scanner.nextLine();
				persona1.setNombre(nombre);
			System.out.println("Ingrese Fecha de Nacimiento(yyyy-mm-dd) de Persona1: ");
			String fechaNacString = scanner.nextLine();
			LocalDate fechaNac = LocalDate.parse(fechaNacString);
				persona1.setFechaNac(fechaNac);
			System.out.println("Ingrese Provincia de Persona1: ");
			String provincia = scanner.nextLine();
				persona1.setProvincia(provincia);
		
				
				
			System.out.println("\nIngrese DNI de Persona2: ");
				DNI = scanner.nextLine();
			System.out.println("Ingrese Nombre de Persona2: ");
				nombre = scanner.nextLine();
			System.out.println("Ingrese Fecha de Nacimiento(yyyy-mm-dd) de Persona2: ");
				fechaNacString = scanner.nextLine();
				fechaNac = LocalDate.parse(fechaNacString);
			System.out.println("Ingrese Provincia de Persona2: ");
				provincia = scanner.nextLine();
			
			Persona persona2 = new Persona(DNI, nombre, fechaNac, provincia);
			
			
			
			System.out.println("\nIngrese DNI de Persona3: ");
				DNI = scanner.nextLine();
			System.out.println("Ingrese Nombre de Persona3: ");
				nombre = scanner.nextLine();
			System.out.println("Ingrese Fecha de Nacimiento(yyyy-mm-dd) de Persona3: ");
				fechaNacString = scanner.nextLine();
				fechaNac = LocalDate.parse(fechaNacString);
				
			Persona persona3 = new Persona(DNI, nombre, fechaNac);
			
			
			
			System.out.println("\n\n*DATOS PERSONA 1*");
			persona1.MostrarDatos();
			System.out.println("\n*DATOS PERSONA 2*");
			persona2.MostrarDatos();
			System.out.println("\n*DATOS PERSONA 3*");
			persona3.MostrarDatos();
			
			scanner.close();
	}

}

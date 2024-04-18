package ar.edu.unju.fi.ejercicio12.Main;
import java.util.Calendar;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio12.Model.*;
public class Main {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el nombre de la persona:");
	        String nombre = scanner.nextLine();
	        
	        System.out.println("Ingrese la fecha de nacimiento de la persona (Formato: dd/mm/yyyy):");
	        String fechaNacimientoStr = scanner.nextLine();
	        String[] partesFecha = fechaNacimientoStr.split("/");
	        int dia = Integer.parseInt(partesFecha[0]);
	        int mes = Integer.parseInt(partesFecha[1]) - 1; 
	        int año = Integer.parseInt(partesFecha[2]);
	        
	        Calendar fechaNacimiento = Calendar.getInstance();
	        fechaNacimiento.set(año, mes, dia);
	        
	        Persona persona = new Persona(nombre, fechaNacimiento);
	        
	        System.out.println("\nDatos de la persona:");
	        System.out.println("Nombre: " + persona.getNombre());
	        System.out.println("Fecha de Nacimiento: " + dia + "/" + (mes + 1) + "/" + año); // Sumamos 1 al mes porque Calendar.MONTH se indexa desde 0
	        
	        int edad = persona.calcularEdad();
	        System.out.println("Edad: " + edad + " años");
	
	        System.out.println("Signo del zodiaco: "+ persona.determinarSignoZodiaco());
	        System.out.println("Estacion: "+ persona.determinarEstacion());
	}

}

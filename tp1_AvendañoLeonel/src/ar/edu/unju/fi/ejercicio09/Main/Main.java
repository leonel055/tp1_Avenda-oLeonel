package ar.edu.unju.fi.ejercicio09.Main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio09.Model.*;

public class Main {

	public static void main(String[] args) {

		Producto[] producto = new Producto[3];
		
		Scanner scanner = new Scanner(System.in);
		String Nombre;
		String Codigo;
		float Precio;
		float Descuento;
		
		for(int i=0;i<3;i++) {
			
			producto[i] = new Producto();
			System.out.println("\nIngrese nombre del producto "+(i+1)+": ");
				Nombre = scanner.nextLine();
			System.out.println("Ingrese codigo del producto "+(i+1)+": ");
				Codigo = scanner.nextLine();
			System.out.println("Ingrese precio del producto "+(i+1)+": ");
				Precio = scanner.nextFloat();
				scanner.nextLine();
				
				Descuento=-1;
			while(Descuento<0 || Descuento>50) {
			System.out.println("Ingrese descuento del producto "+(i+1)+"(Debe ser un valor entre 0 y 50): ");
				Descuento = scanner.nextFloat	();
					scanner.nextLine();
					
			}
			producto[i] = new Producto();
			producto[i].setNombre(Nombre);
			producto[i].setCodigo(Codigo);
			producto[i].setPrecio(Precio);
			producto[i].setDescuento(Descuento);
			
		}
		scanner.close();
		for(int i=0;i<3;i++) {
			producto[i].MostrarDatos();
		}
		
		

	}

}

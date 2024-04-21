package ar.edu.unju.fi.ejercicio18.Main;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Integer> codigos = new ArrayList<>();
	
	public int MostrarMenu() {
		
		int op=-1;
		
		System.out.println("**MENU**");
		System.out.println("1-Ingresar destino turistico");
		System.out.println("2-Mostrar todos los destinos turisticos");
		System.out.println("3-Cambiar destino turistico");
		System.out.println("4-Borrar los destinos turisticos");
		System.out.println("5-Borrar un destino turistico especifico");
		System.out.println("6-Mostrar los destinos turisticos en orden");
		System.out.println("7-Mostrar todos los paises cargados");
		System.out.println("8-Mostrar los destinos turisticos que pertenecen a un mismo pais");
		System.out.println("9-Salir\n");
		
		while(op<1 || op>9) {
			try {
				System.out.print("Ingrese una opcion: ");
				op = scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Opcion ingresada no disponible");
			}
		}
		
		return op;
	}
	
	
	public Menu() {
		super();
	}


	public int IngresarCodigo() {

		int cod = -1;
		do {
			
			try {
				System.out.print("\nIngrese codigo del destino turistico: ");
				cod = scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("ERROR al ingresar codigo");
				cod = -1;
			}
			scanner.nextLine();
			
			if(codigos.contains(cod)) {
				System.out.println("No pueden existir dos destinos con mismo codigo");
				cod = -1;
			}
			
		}while(cod==-1);
		
		codigos.add(cod);
		return cod;
	}
	
	public void EliminarCodigo(int n) {
		for(Integer i : codigos) {
			if(n==i) {
				codigos.remove(i);
				break;
			}
		}
	}
}

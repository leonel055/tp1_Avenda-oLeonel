package ar.edu.unju.fi.ejercicio16;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		 String[] nombres = new String[5];

	        System.out.println("INGRESE 5 NOMBRES DE PERSONAS: \n");
	    
	        for (int i = 0; i < 5; i++) {
	            System.out.print("En la posición " + i + ": ");
	            nombres[i] = scanner.nextLine();
	        }
	        
	        
	        System.out.println("\n***VALORES GUARDADOS EN EL ARRAY***: \n");
	        
	        int j = 0;
	        while (j < 5) {
	            System.out.println("Posición " + j + ": " + nombres[j]);
	            j++;
	        }

	        System.out.println("\nTamaño del array: " + nombres.length);

	        byte indice;
	        
	        do {
	            System.out.print("\nIngrese el índice del elemento a eliminar (entre 0 y 4): ");
	            indice = scanner.nextByte();
	        } while (indice < 0 || indice > 4);

	
	        for (int i = indice; i < nombres.length -1 ; i++) {
	            nombres[i] = nombres[i + 1];
	        }
	        nombres[nombres.length - 1] = ""; 

	        System.out.println("\nArreglo después de eliminar el elemento en la posición " + indice + ":");
	        for (String nombre : nombres) {
	            System.out.println(nombre);
	        }

	        scanner.close();
	       }
	}


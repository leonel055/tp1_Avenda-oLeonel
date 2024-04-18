package ar.edu.unju.fi.ejercicio14;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int Tamaño;
		int suma = 0;
		do {
            System.out.print("Ingrese el tamaño del arreglo [3,10]");
            Tamaño = scanner.nextInt();
        } while (Tamaño < 3 || Tamaño > 10);
		
		int[] numeros = new int[Tamaño];
		 System.out.println("INGRESE " + Tamaño + " NUMEROS ENTEROS:"+"\n");
		 
	        for (int i = 0; i < Tamaño; i++) {
	            System.out.print("Número en la posición " + i + ": ");
	            numeros[i] = scanner.nextInt();
	            suma += numeros[i];
	        }
	        System.out.println("\n**VALORES DEL ARREGLO**:");
	        for (int i = 0; i < Tamaño; i++) {
	            System.out.println("Posición " + i + ": " + numeros[i]);
	        }
	        System.out.println("La suma de todos los valores es: " + suma);

	        scanner.close();
		 
	}

}

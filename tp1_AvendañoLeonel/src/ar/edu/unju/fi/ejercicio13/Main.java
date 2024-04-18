package ar.edu.unju.fi.ejercicio13;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
	        int[] numeros = new int[8];
	        System.out.println("INGRESE 8 NUMEROS: ");

	        for (int i = 0; i < 8; i++) {
	            System.out.print("Número en la posición " + i + ": ");
	            numeros[i] = scanner.nextInt();
	        }
	        System.out.println("\nÍndice\t\tValor");
	        for (int i = 0; i < 8; i++) {
	            System.out.println(i + "\t\t" + numeros[i]);
	        }

	        scanner.close();
	    
	}

}

package ar.edu.unju.fi.ejercicio03;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
	
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero:");
        int numero = scanner.nextInt();
        
        scanner.close();
        
        if (numero % 2 == 0) {
        	
            int triple = numero * 3;
            System.out.println(triple);
        } else {
        	
            int doble = numero * 2;
            System.out.println(doble);
        }
	}

}

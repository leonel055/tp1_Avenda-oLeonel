package ar.edu.unju.fi.ejercicio15;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int Tamaño;
        do {
            System.out.print("Ingrese el tamaño del arreglo [5,10] : ");
            Tamaño = scanner.nextInt();
        } while (Tamaño < 5 || Tamaño > 10);
        
        String[] Nombres = new String [Tamaño];
        
        System.out.println("\nINGRESE " + Tamaño + " NOMBRES DE PERSONAS:"+"\n");
        
        for (int i = 0; i < Tamaño; i++) {
            System.out.print("Ingrese el nombre en la posición " + i + ": ");	
            Nombres[i] = scanner.next();
          
        }
        System.out.println("\n");
       
        for (int i = Tamaño - 1; i >= 0; i--) {
            System.out.println("Posición " + i + ": " + Nombres[i]);
        }

        scanner.close();
	}

}

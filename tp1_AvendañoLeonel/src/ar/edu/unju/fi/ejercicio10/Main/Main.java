package ar.edu.unju.fi.ejercicio10.Main;
import ar.edu.unju.fi.ejercicio10.Model.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Pizza[] Pizzas= new Pizza[3];

	            for (int i = 0; i < 3; i++) {
	                System.out.println("\nINGRESE LOS DATOS DE LA PIZZA: " + (i + 1) + ":");
	                Pizza pizza = new Pizza();
	                int diametro;
					do {
	                    System.out.println("Ingrese el diámetro de la pizza (20, 30 o 40 cm):");
	                    diametro = scanner.nextInt();

	                    if (diametro != 20 && diametro != 30 && diametro != 40) {
	                        System.out.println("El diámetro ingresado no es válido. Por favor, ingrese un valor válido.");
	                    }
	                    
	                } while (diametro != 20 && diametro != 30 && diametro != 40);
					pizza.setDiametro(diametro);
					
	                System.out.println("¿La pizza tiene ingredientes especiales? (true/false):");
	                boolean ingredientesEspeciales = scanner.nextBoolean();
	                pizza.setIngrEspecial(ingredientesEspeciales);
	                
	                pizza.calcularPrecio();
	                pizza.calcularArea();
	                
	                Pizzas[i] = pizza;
			}
		scanner.close();
		
		 for (int i = 0; i < 3; i++) {
			 System.out.println("\n***** Pizza "+ (i + 1) + " *****");
	            System.out.println("Diametro = " + Pizzas[i].getDiametro());
	            System.out.println("Ingredientes especiales = " + Pizzas[i].isIngrEspecial());
	            System.out.println("Precio Pizza = " + Pizzas[i].getPrecio ()+"$") ;
	            System.out.println("Área de la Pizza = " + Pizzas[i].calcularArea());
		 	}
		 }
	}

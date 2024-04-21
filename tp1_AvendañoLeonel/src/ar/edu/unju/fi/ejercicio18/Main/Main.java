package ar.edu.unju.fi.ejercicio18.Main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio18.Model.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<DestinoTuristico> Destino = new ArrayList<>();
		ArrayList<Pais> paises = new ArrayList<>();
		Menu menu = new Menu();
		
		paises.add(new Pais(1,"Argentina"));
		paises.add(new Pais(2,"Francia"));
		paises.add(new Pais(3,"España"));
		paises.add(new Pais(4,"Mexico"));
		paises.add(new Pais(5,"Italia"));
		
		int op = -1;
		
		do {
			op = menu.MostrarMenu();
			switch(op){
			
			case 1: {
				
				int cod = menu.IngresarCodigo();
				
				System.out.print("Ingrese nombre del destino: ");
				String nombre = scanner.nextLine();
				
				System.out.print("Ingrese precio del destino: ");
				float precio = scanner.nextFloat();
				scanner.nextLine();
				
				System.out.print("Ingrese cantidad de dias: ");
				int dias = scanner.nextInt();
				scanner.nextLine();
				
				int pais_cod;
				do {
					
					System.out.println("Elija pais de destino");
					System.out.println("1-Argentina");
					System.out.println("2-Francia");
					System.out.println("3-España");
					System.out.println("4-Mexico");
					System.out.println("5-Italia");
					
					System.out.print("\nIngrese una opcion: ");
					pais_cod = scanner.nextInt();
					scanner.nextLine();
					
				}while(pais_cod<1 || pais_cod>5);
				
				DestinoTuristico destino = new DestinoTuristico();
				
				destino.setCodigo(cod);
				destino.setNombre(nombre);
				destino.setPrecio(precio);
				destino.setCantDias(dias);
				for(Pais i : paises) {
					if(i.getCodigo()==pais_cod) destino.setPais(i);
				}
				
				Destino.add(destino);
				
				System.out.println("Se añadio del destino a la lista");
			}
			break;
			
			case 2: {
				
				for(DestinoTuristico i : Destino) {
					i.MostrarDatos();
				}
				
			}
			break;
			
			case 3: {
				
				System.out.print("\nIngresar codigo para modificar destino: ");
				int cod = scanner.nextInt();
				scanner.nextLine();
				
				for(DestinoTuristico i : Destino) {
					if(i.getCodigo()==cod) {
						
						System.out.print("Ingrese nombre del destino: ");
						String nombre = scanner.nextLine();
						
						System.out.print("Ingrese precio del destino: ");
						float precio = scanner.nextFloat();
						scanner.nextLine();
						
						System.out.print("Ingrese cantidad de dias: ");
						int dias = scanner.nextInt();
						scanner.nextLine();
						
						int pais_cod;
						do {
							
							System.out.println("Elija pais de destino");
							System.out.println("1-Argentina");
							System.out.println("2-Francia");
							System.out.println("3-España");
							System.out.println("4-Mexico");
							System.out.println("5-Italia");
							
							System.out.print("\nIngrese una opcion: ");
							pais_cod = scanner.nextInt();
							scanner.nextLine();
							
						}while(pais_cod<1 || pais_cod>5);
												
						i.setCodigo(cod);
						i.setNombre(nombre);
						i.setPrecio(precio);
						i.setCantDias(dias);
					
						for(Pais j : paises) {
							if(i.getCodigo()==pais_cod) i.setPais(j);
						}
						
						System.out.println("Se modificaron los datos del destino con codigo: "+cod);
						
						break;
					}
				}
				
			}
			break;
			
			case 4: {
								
				Destino.clear();
				System.out.println("\nSe limpio la lista de destinos");
				
			}
			break;
			
			case 5: {
				
				System.out.print("\nIngresar codigo para borrar destino: ");
				int cod = scanner.nextInt();
				scanner.nextLine();
				
				for(DestinoTuristico i : Destino) {
					if(i.getCodigo()==cod) {
						Destino.remove(i);
						menu.EliminarCodigo(cod);
						System.out.println("\nSe elimino el destino de codigo "+cod);
						break;
					}
				}
			
			}
			break;
			
			case 6: {
				
				Collections.sort(Destino);
				
				for(DestinoTuristico i : Destino) {
					i.MostrarDatos();
				}
				
			}
			break;
			
			case 7: {
				
				for(Pais i : paises) {
					i.MostrarDatos();
				}
				
			}
			break;
			
			case 8: {
				
				System.out.print("\nIngrese codigo de pais para mostrar los destinos: ");
				int cod_pais = scanner.nextInt();
				scanner.nextLine();
				
				for(DestinoTuristico i : Destino) {
					Pais pais = i.getPais();
					if(cod_pais == pais.getCodigo()) {
						i.MostrarDatos();
					}
				}
				
			}
			break;
			
			case 9: {
				
				System.out.println("**FIN DEL PROGRAMA**");
				
			}
			
			default: System.out.println("OPCION NO DISPONIBLE");
			}
			
		}while(op!=9);
		
		scanner.close();
	}


	}

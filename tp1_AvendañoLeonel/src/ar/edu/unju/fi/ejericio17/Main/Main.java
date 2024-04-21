package ar.edu.unju.fi.ejericio17.Main;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import ar.edu.unju.fi.ejericio17.Model.*;

public class Main {

	public static void main(String[] args) {
		
		List<Jugador> Jugador = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n-------MENU DE OPCIONES-------");
            System.out.println("1 – Alta de jugador");
            System.out.println("2 – Mostrar los datos del jugador");
            System.out.println("3 – Mostrar todos los jugadores ordenados por apellido");
            System.out.println("4 – Modificar los datos de un jugador");
            System.out.println("5 – Eliminar un jugador");
            System.out.println("6 – Mostrar la cantidad total de jugadores");
            System.out.println("7 – Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
            System.out.println("8 – Salir");
            System.out.println("Seleccione una opción:");
           
            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); 
                switch (opcion) {
                    case 1:
                        altaJugador(Jugador, scanner);
                        break;
                    case 2:
                        mostrarDatosJugador(Jugador, scanner);
                        break;
                    case 3:
                        mostrarJugadoresOrdenados(Jugador);
                        break;
                    case 4:
                        modificarJugador(Jugador, scanner);
                        break;
                    case 5:
                        eliminarJugador(Jugador, scanner);
                        break;
                    case 6:
                        mostrarCantidadTotal(Jugador);
                        break;
                    case 7:
                        mostrarCantidadPorNacionalidad(Jugador, scanner);
                        break;
                    case 8:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("***OPCION NO VALIDA***");
                }
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
                scanner.nextLine(); 
                opcion = 0; 
            }
        } while (opcion != 8);

        scanner.close();
    }

    private static void altaJugador(List<Jugador> jugadores, Scanner scanner) {
    	System.out.println("Ingrese el nombre del jugador:");
        String nombre = scanner.next();
        System.out.println("Ingrese el apellido del jugador:");
        String apellido = scanner.next();
        System.out.println("Ingrese la fecha de nacimiento del jugador (YYYY-MM-DD):");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.next());
        System.out.println("Ingrese la nacionalidad del jugador:");
        String nacionalidad = scanner.next();
        System.out.println("Ingrese la estatura del jugador (CM):");
        double estatura = scanner.nextDouble();
        System.out.println("Ingrese el peso del jugador(KG):");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese la posición del jugador (delantero, medio, defensa, arquero):");
        String posicion = scanner.next();
        
        
        Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
        jugadores.add(jugador);
        System.out.println("...JUGADOR AGREGADO CON EXITO!...");
}

    private static void mostrarDatosJugador(List<Jugador> jugadores, Scanner scanner) {
    	 System.out.println("Ingrese el nombre del jugador:");
    	    String nombre = scanner.next();
    	    System.out.println("Ingrese el apellido del jugador:");
    	    String apellido = scanner.next();

    	    boolean encontrado = false;
    	    for (Jugador jugador : jugadores) {
    	        if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
    	            System.out.println("\n******* DATOS DEL JUGADOR *******");
    	            System.out.println("Nombre: " + jugador.getNombre());
    	            System.out.println("Apellido: " + jugador.getApellido());
    	            System.out.println("Fecha de nacimiento: " + jugador.getFechaNacimiento());
    	            System.out.println("Nacionalidad: " + jugador.getNacionalidad());
    	            System.out.println("Estatura: " + jugador.getEstatura());
    	            System.out.println("Peso: " + jugador.getPeso());
    	            System.out.println("Posición: " + jugador.getPosicion());
    	            System.out.println("Edad: " + jugador.calcularEdad());
    	            encontrado = true;
    	            break;
    	        }
    	    if (!encontrado) {
    	        System.out.println("JUGADOR NO ENCONTRADO.");
    	    	}
    	    }
    	}
    private static void mostrarJugadoresOrdenados(List<Jugador> jugadores) {
    	 if (jugadores.isEmpty()) {
    	        System.out.println("NO HAY JUGADORES REGISTRADOS.");
    	        return;
    	    }

    	    List<Jugador> jugadoresOrdenados = new ArrayList<>(jugadores);
    	    Collections.sort(jugadoresOrdenados, Comparator.comparing(Jugador::getApellido));

    	    System.out.println("Jugadores ordenados por apellido:");
    	    for (Jugador jugador : jugadoresOrdenados) {
    	        System.out.println(jugador.getApellido() + ", " + jugador.getNombre());
    	    }
    }

    private static void modificarJugador(List<Jugador> jugadores, Scanner scanner) {
    	System.out.println("Ingrese el nombre del jugador a modificar:");
        String nombre = scanner.next();
        System.out.println("Ingrese el apellido del jugador a modificar:");
        String apellido = scanner.next();

        boolean encontrado = false;
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("Ingrese el nuevo nombre:");
                jugador.setNombre(scanner.next());
                System.out.println("Ingrese el nuevo apellido:");
                jugador.setApellido(scanner.next());
                System.out.println("Ingrese la nueva fecha de nacimiento (YYYY-MM-DD):");
                jugador.setFechaNacimiento(LocalDate.parse(scanner.next()));
                System.out.println("Ingrese la nueva nacionalidad:");
                jugador.setNacionalidad(scanner.next());
                System.out.println("Ingrese la nueva estatura:");
                jugador.setEstatura(scanner.nextDouble());
                System.out.println("Ingrese el nuevo peso:");
                jugador.setPeso(scanner.nextDouble());
                System.out.println("Ingrese la nueva posición (delantero, medio, defensa, arquero):");
                jugador.setPosicion(scanner.next());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("JUGADOR NO ENCONTRADO");
        } else {
            System.out.println("DATOS DEL JUGADOR MODIFICADOS CON EXITO");
        }
    }

    private static void eliminarJugador(List<Jugador> jugadores, Scanner scanner) {
    	System.out.println("Ingrese el nombre del jugador a eliminar:");
        String nombre = scanner.next();
        System.out.println("Ingrese el apellido del jugador a eliminar:");
        String apellido = scanner.next();

        Iterator<Jugador> iterator = jugadores.iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            Jugador jugador = iterator.next();
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                iterator.remove();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("JUGADOR NO ENCONTRADO");
        } else {
            System.out.println("JUGADOR ELIMINADO CON EXITO");
        }
    }

    private static void mostrarCantidadTotal(List<Jugador> jugadores) {
        System.out.println("Cantidad total de jugadores: " + jugadores.size());
    }

    private static void mostrarCantidadPorNacionalidad(List<Jugador> jugadores, Scanner scanner) {
    	 System.out.println("Ingrese la nacionalidad:");
    	    String nacionalidad = scanner.next();

    	    int cantidad = 0;
    	    for (Jugador jugador : jugadores) {
    	        if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
    	            cantidad++;
    	        }
    	    }
    	    System.out.println("Cantidad de jugadores de la nacionalidad " + nacionalidad + ": " + cantidad);
    	}
    }



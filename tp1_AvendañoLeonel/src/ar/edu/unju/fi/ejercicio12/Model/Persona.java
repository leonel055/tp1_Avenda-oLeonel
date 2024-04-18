package ar.edu.unju.fi.ejercicio12.Model;
import java.util.Calendar;

public class Persona {
	private String Nombre;
    private Calendar FechaNac;
    
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Calendar getFechaNac() {
		return FechaNac;
	}

	public void setFechaNac(Calendar fechaNac) {
		FechaNac = fechaNac;
	}

	public Persona(String nombre, Calendar fechaNac) {
		super();
		Nombre = nombre;
		FechaNac = fechaNac;
	}
	 public int calcularEdad() {
	        Calendar ahora = Calendar.getInstance();
	        int edad = ahora.get(Calendar.YEAR) - FechaNac.get(Calendar.YEAR);
	        if (ahora.get(Calendar.DAY_OF_YEAR) < FechaNac.get(Calendar.DAY_OF_YEAR)) {
	            edad--;
	        }
	        return edad;
	    }
	 public String determinarSignoZodiaco() {
	        int dia = FechaNac.get(Calendar.DAY_OF_MONTH);
	        int mes = FechaNac.get(Calendar.MONTH) + 1; 
	        String signo = "";
	        
	        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
	            signo = "Aries";
	        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
	            signo = "Tauro";
	        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
	            signo = "Géminis";
	        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
	            signo = "Cáncer";
	        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
	            signo = "Leo";
	        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
	            signo = "Virgo";
	        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
	            signo = "Libra";
	        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
	            signo = "Escorpio";
	        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
	            signo = "Sagitario";
	        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
	            signo = "Capricornio";
	        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
	            signo = "Acuario";
	        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
	            signo = "Piscis";
	        }
	        
	        return signo;
	    }
	  
	  public String determinarEstacion() {
		  	int dia = FechaNac.get(Calendar.DAY_OF_MONTH);
	        int mes = FechaNac.get(Calendar.MONTH) + 1; 
	        String estacion = "";
			if ((mes == 1 && dia >= 21) || mes == 2 || (mes == 3 && dia < 21)) {
	            estacion = "Verano";
	        } else if ((mes == 3 && dia >= 21) || mes == 4 || mes == 5 || (mes == 6 && dia < 21)) {
	            estacion = "Otoño";
	        } else if ((mes == 6 && dia >= 21) || mes == 7 || mes == 8 || (mes == 9 && dia < 21)) {
	            estacion = "Invierno";
	        } else if ((mes == 9 && dia >= 21) || mes == 10 || mes == 11 || (mes == 12 && dia < 21)) {
	            estacion = "Primavera";
	        } else if (mes == 12 && dia >= 21) {
	            estacion = "Verano";
	        }

	        return estacion;
	    }
	 
}

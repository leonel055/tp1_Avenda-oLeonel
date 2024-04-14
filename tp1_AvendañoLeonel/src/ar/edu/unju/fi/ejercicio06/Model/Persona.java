package ar.edu.unju.fi.ejercicio06.Model;
import java.time.LocalDate;
import java.time.Period;

public class Persona {
			private String Dni;
			private String Nombre;
			private LocalDate FechaNac;
			private String Provincia;
			
			public Persona() {

			}
		
			public Persona(String dni, String nombre, LocalDate fechaNac, String provincia) {
				super();
				Dni = dni;
				Nombre = nombre;
				FechaNac = fechaNac;
				Provincia = provincia;
				
			}
			public Persona(String dni, String nombre, LocalDate fechaNac) {
				super();
				Dni = dni;
				Nombre = nombre;
				FechaNac = fechaNac;
				Provincia = "Jujuy";
				
			}
			
			public String getDni() {
				return Dni;
			}
			public void setDni(String Dni) {
				this.Dni = Dni;
			}
			public String getNombre() {
				return Nombre;
			}
			public void setNombre(String Nombre) {
				this.Nombre = Nombre;
			}
			public LocalDate getFechaNac() {
				return FechaNac;
			}
			public void setFechaNac(LocalDate FechaNac) {
				this.FechaNac = FechaNac;
			}
			public String getProvincia() {
				return Provincia;
			}
			public void setProvincia(String Provincia) {
				this.Provincia = Provincia;
			}	

			public int CalcularEdad() {
				LocalDate FechaActual = LocalDate.now();
				Period Edad = Period.between(FechaNac, FechaActual);
				return Edad.getYears();
			}
			
			 public boolean MayorDeEdad() {
				 return CalcularEdad() > 18;
				    }

			
			public void MostrarDatos() {
				System.out.println("Nombre: "+ Nombre);
				System.out.println("DNI: "+ Dni);
				System.out.println("Fecha de Nacimiento: "+FechaNac);
				System.out.println("Provincia: "+Provincia);
				if(MayorDeEdad()) System.out.println("La persona es mayor de edad");
				else System.out.println("La persona no es mayor de edad");
			}
		
			
			
}


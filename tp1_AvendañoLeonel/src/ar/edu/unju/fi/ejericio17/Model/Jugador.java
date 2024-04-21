package ar.edu.unju.fi.ejericio17.Model;

import java.time.LocalDate;

public class Jugador {
    private String Nombre;
    private String Apellido;
    private LocalDate FechaNac;
    private String Nacionalidad;
    private double Estatura;
    private double Peso;
    private String Posicion;
	private LocalDate fechaNacimiento;

	
    public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public LocalDate getFechaNac() {
		return FechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		FechaNac = fechaNac;
	}

	public String getNacionalidad() {
		return Nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	public double getEstatura() {
		return Estatura;
	}

	public void setEstatura(double estatura) {
		Estatura = estatura;
	}

	public double getPeso() {
		return Peso;
	}

	public void setPeso(double peso) {
		Peso = peso;
	}

	public String getPosicion() {
		return Posicion;
	}

	public void setPosicion(String posicion) {
		Posicion = posicion;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Jugador(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, double estatura, double peso, String posicion) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.Nacionalidad = nacionalidad;
        this.Estatura = estatura;
        this.Peso = peso;
        this.Posicion = posicion;
    }

    public int calcularEdad() {
        LocalDate ahora = LocalDate.now();
        return ahora.getYear() - fechaNacimiento.getYear();
    }
}
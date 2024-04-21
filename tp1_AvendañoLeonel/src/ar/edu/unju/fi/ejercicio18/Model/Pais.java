package ar.edu.unju.fi.ejercicio18.Model;

public class Pais {
	
	private int Codigo;
	private String Nombre;
	
	public Pais(int codigo, String nombre) {
		super();
		this.Codigo = codigo;
		this.Nombre = nombre;
	}
	public int getCodigo(){
		return Codigo;
	}
	public void setCodigo(int codigo) {
		this.Codigo = codigo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	
	public void MostrarDatos() {
		System.out.println("\nCodigo del pais: "+Codigo);
		System.out.println("Nombre del pais: "+Nombre);
	}
}

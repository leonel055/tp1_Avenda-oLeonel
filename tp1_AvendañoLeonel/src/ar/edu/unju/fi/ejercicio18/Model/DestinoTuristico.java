package ar.edu.unju.fi.ejercicio18.Model;

public class DestinoTuristico implements Comparable<DestinoTuristico>{
	private int Codigo;
	private String Nombre;
	private float Precio;
	private Pais Pais;
	private int CantDias;
	
	public int getCodigo() {
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
	public float getPrecio() {
		return Precio;
	}
	public void setPrecio(float precio) {
		this.Precio = precio;
	}
	public Pais getPais() {
		return Pais;
	}
	public void setPais(Pais pais) {
		this.Pais = pais;
	}
	public int getCantDias() {
		return CantDias;
	}
	public void setCantDias(int cantDias) {
		this.CantDias = cantDias;
	}
	
	public void MostrarDatos() {
		System.out.println("\nCodigo: "+Codigo);
		System.out.println("Nombre: "+Nombre);
		System.out.println("Precio: "+Precio);
		System.out.println("Cantidad de dias: "+CantDias);
		System.out.println("Codigo del Pais: "+Pais.getCodigo());
		System.out.println("Nombre del Pais: "+Pais.getNombre());
	}
	
	public int compareTo(DestinoTuristico otroDestino) {
		 return this.Nombre.compareTo(otroDestino.getNombre());
	}
	
}

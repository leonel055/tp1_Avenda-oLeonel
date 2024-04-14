package ar.edu.unju.fi.ejercicio07.Model;

public class Empleado {
	
	private String Nombre;
	private String Legajo;
	private float Salario;
	public static final double SalarioMin = 210000;
	public static final double Aumento = 20000;
	
	
	public Empleado(String nombre, String legajo, float salario) {
		super();
		this.Nombre = nombre;
		this.Legajo = legajo;
		this.Salario = salario;
		
		  if (salario < Empleado.SalarioMin) {
	            this.Salario = (float) Empleado.SalarioMin;
	        } else {
	            this.Salario = salario;   
	        }
	}
	public void MostrarDatos() {
		System.out.println("Nombre del empleado: "+ Nombre);
		System.out.println("Legajo: "+ Legajo);
		System.out.println("Salario : $"+ Salario);		
	}
	public float AumentarSalario() {
		Salario += Aumento;
		System.out.println("\nSe acredito el aumento de salario\n");
		return Salario;
	}
	}





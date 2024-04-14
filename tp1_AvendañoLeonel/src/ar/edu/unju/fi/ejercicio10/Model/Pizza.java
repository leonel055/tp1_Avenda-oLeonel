package ar.edu.unju.fi.ejercicio10.Model;

public class Pizza {
	
	private int Diametro;
	private int Precio;
	private float Area;
	private boolean IngrEspecial;
	private static final double IngrAdicional20=500;	
	private static final double IngrAdicional30=750;
	private static final double IngrAdicional40=1000;
	
	

	public Pizza() {}

	public int getDiametro() {
		return Diametro;
	}

	public void setDiametro(float diametro) {
		this.Diametro = (int) diametro;
	}

	public float getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		this.Precio = precio;
	}

	public float getArea() {
		return Area;
	}

	public void setArea(float area) {
		this.Area = area;
	}

	public boolean isIngrEspecial() {
		return IngrEspecial;
	}

	public void setIngrEspecial(boolean ingrEspecial) {
		this.IngrEspecial = ingrEspecial;
	}

	public double calcularArea() {
        return Math.PI * Math.pow(Diametro / 2.0, 2);
    }

	 public void calcularPrecio() {
	        if (Diametro == 20) {
	            Precio = (int) (IngrEspecial ? 4500 + IngrAdicional20 : 4500);
	        } else if (Diametro == 30) {
	            Precio = (int) (IngrEspecial ? 4800 + IngrAdicional30 : 4800);
	        } else if (Diametro == 40) {
	            Precio = (int) (IngrEspecial ? 5500 + IngrAdicional40 : 5500);
	        } else {
	            System.out.println("El diámetro no es válido para calcular el precio de la pizza.");
	        }
	 	}
	 }


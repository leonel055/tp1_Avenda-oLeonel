package ar.edu.unju.fi.ejercicio08.Model;

public class CalculadoraEspecial {	
		private int n;
		
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public CalculadoraEspecial() {
		super();
	}

	
	public long CalcularSumatoria(){
		long sumatoria=0;
		
		for(int k=1;k<n+1;k++) {
			sumatoria += (long) Math.pow(((k+1)*k)/2,2);
		}
		return sumatoria;
	}
	
	
	
	public long CalcularProductorial() {
		long productorial=1;
		
		for(int k=1;k<n+1;k++) {
			productorial *= (long) (k+4)*k;
		}
		return productorial;
		
		}
	}




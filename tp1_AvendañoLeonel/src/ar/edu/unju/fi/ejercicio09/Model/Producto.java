package ar.edu.unju.fi.ejercicio09.Model;

public class Producto {
		
		private String Nombre;
		private String Codigo;
		private float Precio;
		private float Descuento;
		private static int cont=1;
		
		public Producto() {
			super();
		}
		
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String nombre) {
			this.Nombre = nombre;
		}
		public String getCodigo() {
			return Codigo;
		}
		public void setCodigo(String codigo) {
			Codigo = codigo;
		}
		public float getPrecio() {
			return Precio;
		}
		public void setPrecio(float precio) {
			this.Precio = precio;
		}
		public float getDescuento() {
			return Descuento;
		}
		public void setDescuento(float descuento) {
			Descuento = descuento;
		}

		public float CalcularDescuento() {
		        if (Descuento > 0 && Descuento <= 50) {
		            return Precio * (1 - Descuento / 100);
		        } else {
		            return Precio; 
		        }
		    }

		public void MostrarDatos() {
			System.out.println("\n*DATOS DEL PRODUCTO "+cont+"*");
			cont++;
			System.out.println("\nNombre del Producto: " + Nombre);
	        System.out.println("Código del Producto: " + Codigo);
	        System.out.println("Precio del Producto: $" + Precio);
	        if (Descuento > 0 && Descuento <= 50) {
	            System.out.println("Descuento: " + Descuento + "%");
	            System.out.println("Precio con descuento: $" + CalcularDescuento());
	        } else {
	            System.out.println("Sin descuento");
	        }
	    }
		
}

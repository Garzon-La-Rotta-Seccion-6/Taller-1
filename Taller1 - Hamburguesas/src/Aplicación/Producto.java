package Aplicación;

public class Producto {
	private String Nombre;
	private int PrecioBase;
	
	public Producto() {
		String Nombre = "";
		int PrecioBase = 0;
	}
	
	public Producto (String elNombre, int elPrecioBase) {
		Nombre = elNombre;
		PrecioBase = elPrecioBase;
	}
	public String getNombre (){
		return Nombre;
	}
	public int getPrecioBase (){
		return PrecioBase;
	}
	public String GenerarTextoFactura () {
		String Texto;
		Texto = getNombre() + " - " + getPrecioBase();
		return Texto;
	}

	
}

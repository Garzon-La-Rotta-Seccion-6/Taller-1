package Aplicación;

public class Ingrediente {
	private String Nombre;
	private int CostoAdicional;
	
	public Ingrediente (String elNombre, int elCostoAdicional) {
		this.Nombre = elNombre;
		this.CostoAdicional = elCostoAdicional;
	}
	public String getNombre () {
		return Nombre;
	}
	public int getCostoAdicional () {
		return CostoAdicional;
	}
	
}

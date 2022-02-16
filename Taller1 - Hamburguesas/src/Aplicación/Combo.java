package Aplicación;
import java.util.ArrayList;
public class Combo {
	private double Descuento;
	private String Nombre;
	public ArrayList<Producto> ItemsCombo;
	public Combo (double elDescuento, String elNombre) {
		this.Descuento = elDescuento;
		this.Nombre = elNombre;
		this.ItemsCombo = new ArrayList<Producto>();
	}

	public void AgregarItemACombo (Producto ItemCombo) {
		this.ItemsCombo.add(ItemCombo);
	}
	private double getPrecio () {
		double Precio = 0;
		for(int i=0; i < ItemsCombo.size(); i++) {
			Producto Item = ItemsCombo.get(i);
			Precio += Item.getPrecioBase();
		}
		Precio = Precio * (1 - Descuento);
		return Precio;
	}
	private String GenerarTextoFactura () {
		String Texto;
		Texto = getNombre() + " - " + getPrecio();
		return Texto;
	}
	private String getNombre () {
		return Nombre;
	}
}

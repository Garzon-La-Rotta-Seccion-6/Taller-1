package Aplicación;

import java.util.ArrayList;

public class Pedido {
	private int Numero;
	private int id;
	private String NombreCliente;
	private String DireccionCliente;
	public static ArrayList<Producto> Items;
	public boolean activo;
	
	public Pedido() {
		int id = 0;
		String NombreCliente = "";
		String DireccionCliente = "";
		
	}
	public Pedido ( String elNombre, String laDireccion, int elid) {
		this.NombreCliente = elNombre;
		this.DireccionCliente = laDireccion;
		this.id = elid;
	}
	public int getIdPedido () {
		return id;
	}
	public void AgregarProducto (Producto NuevoItem) {
		Items.add(NuevoItem);
	}
	public double getPrecioNetoPedido() {
		double Precio = 0.0;
		for(int i = 0; i < Items.size(); i++) {
			Producto Item = Items.get(i);
			Precio += Item.getPrecioBase();
		}
		return Precio;
	}
	public double getPrecioTotalPedido() {
		double PrecioNeto = getPrecioNetoPedido();
		double PrecioIVA = getPrecioIVAPedido(PrecioNeto);
		double Precio = PrecioNeto + PrecioIVA;
		return Precio;
	}
	public double getPrecioIVAPedido(double PrecioNeto) {
		double Precio = 0.19*PrecioNeto;
		return Precio;
	}
	public String GenerarTextoFactura() {
		String TextoFactura = "";
		for (int i=0; i<Items.size(); i++) {
			Producto Item = Items.get(i);
			String Texto = Item.GenerarTextoFactura();
			TextoFactura = TextoFactura + "%n" + Texto;
		}
		TextoFactura = TextoFactura + "%n" + "Precio Neto - " + getPrecioNetoPedido() + "%n" + "IVA - " + getPrecioIVAPedido(getPrecioNetoPedido()) + "%n" +"Precio Total - " + getPrecioTotalPedido();
		return TextoFactura;
	}
}

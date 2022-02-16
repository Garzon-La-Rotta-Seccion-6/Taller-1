package Aplicación;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Procesamiento.CargaArchivos;
import Aplicación.Combo;
import Aplicación.Ingrediente;
import Aplicación.Pedido;
import Aplicación.Producto;
import Procesamiento.CargaArchivos;
public class Restaurante {
	public ArrayList<Ingrediente> ingredientes;
	public ArrayList<Pedido> pedidos;
	public Pedido pedido_en_curso;
	public ArrayList<Combo> combos;
	public ArrayList<Producto> menuBase;
	
	public Restaurante() {
		this.ingredientes = new ArrayList<Ingrediente>();
		this.pedidos = new ArrayList<Pedido>();
		this.combos = new ArrayList<Combo>();
		this.menuBase = new ArrayList<Producto>();
	}
	
	public void IniciarPedido (String NombreCliente, String DireccionCliente, int id) {
		this.pedido_en_curso = new Pedido(NombreCliente, DireccionCliente, id);
	}
	public void cerrarYGuardarPedido () {
		pedidos.add(this.pedido_en_curso);
		this.pedido_en_curso = null;
	}
	public  ArrayList<Pedido> getPedidos() 
	{

		return pedidos;
	}
	public Pedido getPedidoEnCurso() 
		{
			return pedido_en_curso;
		}
	
	public  ArrayList<Producto> getMenuBase()
		{ 
			return menuBase;
		}
	
	public  ArrayList<Ingrediente> getIngredientes()
		{
			return ingredientes;
		}
	public   ArrayList<Combo> getCombo()
	{
		return combos;
		
	}
	public void cargarInformación(String ArchivoIngredientes, String ArchivoMenu, String ArchivoCombos) {
		cargarIngredientes(ArchivoIngredientes);
		cargarMenu(ArchivoMenu);
		cargarCombos(ArchivoCombos);
	}
	private void cargarIngredientes(String ArchivoIngredientes) {
		try {
			this.ingredientes = CargaArchivos.leerInfoArchivoIngredientes(ArchivoIngredientes);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void cargarMenu(String ArchivoMenu) {
		try {
			this.ingredientes = CargaArchivos.leerInfoArchivoIngredientes(ArchivoMenu);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void cargarCombos(String ArchivoCombos) {
		try {
			this.ingredientes = CargaArchivos.leerInfoArchivoIngredientes(ArchivoCombos);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

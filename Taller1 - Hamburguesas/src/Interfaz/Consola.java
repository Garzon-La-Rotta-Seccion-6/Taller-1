package Interfaz;
import java.util.ArrayList;

import Aplicaci�n.Combo;
import Aplicaci�n.Ingrediente;
import Aplicaci�n.Pedido;
import Aplicaci�n.ProductoAjustado;
import Aplicaci�n.Producto;
import Aplicaci�n.Restaurante;
import java.io.*;
public class Consola {
private static int idPedido;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando...");
		Restaurante elRestaurante= new Restaurante();
		ejecutarAplicacion (elRestaurante);
	}
	public static void ejecutarAplicacion(Restaurante elRestaurante) {
		System.out.println("Bienvenido");
		elRestaurante.cargarInformaci�n("ingredientes.txt", "menu.txt" ,"combos.txt" );
	idPedido= 0;
	}
	public static void mostrarMenu()
	{
		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Ver el Menu");
		System.out.println("2. Ver el Combo");
		System.out.println("3. Iniciar Un nuevo Pedido");
		System.out.println("4. Cerrar un pedido y guardar la factura");
		System.out.println("5.Consultar pedido pasado\n");
		System.out.println("6. Salir de la aplicación\n");
	}
	
	

}

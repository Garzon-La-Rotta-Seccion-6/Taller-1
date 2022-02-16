package Procesamiento;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Aplicación.Combo;
import Aplicación.Ingrediente;
import Aplicación.Producto;
import uniandes.dpoo.modelo.ProductoMenu;


public class CargaArchivos {
	public static ArrayList<Producto> leerMenu(String rutaArchivo) throws IOException{
		ArrayList<Producto> productosMenu = new ArrayList<Producto>();
		BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
		String linea = br.readLine();
		while (linea != null) {
			String[] partes = linea.split(";");
			
			Producto nuevoProducto = new Producto(partes[0], Integer.parseInt(partes[1]));   
			productosMenu.add( nuevoProducto );

			linea = br.readLine(); 
		}
		br.close();
		return productosMenu;
	}
	public static ArrayList<Combo> leerInfoArchivoCombos(String rutaArchivo, ArrayList<Producto> productosMenu) throws FileNotFoundException, IOException
	{
		ArrayList<Combo> combos = new ArrayList<Combo>();
		BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
		String linea = br.readLine();  
		while (linea != null) 
		{

			String[] partes = linea.split(";");
			double porcentaje = Double.parseDouble( partes[1].substring(0, partes[1].length()-1)); 

			Combo nuevoCombo = new Combo(porcentaje, partes[0] );  

			for (int i = 2; i < partes.length; i++)
			{
				String parte = partes[i];
				
				for (int e = 0; e < productosMenu.size(); e++){
					var elProductoMenu = productosMenu.get(e);
					var nombreProducto = elProductoMenu.getNombre();
					if (nombreProducto == parte) {
						nuevoCombo.AgregarItemACombo(elProductoMenu); 
					}
				}
				
			}

			combos.add( nuevoCombo );

			linea = br.readLine();
		}
		br.close();
		return combos;
	}
	public static ArrayList<Ingrediente> leerInfoArchivoIngredientes(String rutaArchivo) throws FileNotFoundException, IOException
	{
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		
		BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
		String linea = br.readLine();  
		
		while (linea != null) 
		{
			
			String[] partes = linea.split(";");
			
			Ingrediente nuevoIngrediente = new Ingrediente(partes[0], Integer.parseInt(partes[1]));  
			ingredientes.add(nuevoIngrediente);

			linea = br.readLine(); 
		}
		br.close();
		return ingredientes;
	}
}

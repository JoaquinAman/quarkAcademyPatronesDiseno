package quarkAcademyPatronesDiseno.iterator;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import quarkAcademyPatronesDiseno.iterator.iterator.Producto;

public class Main {

	public static void main(String[] args) {

		ArrayList<Producto> productos = new ArrayList<>();

		productos.add(new Producto("1", "Tornillos"));
		productos.add(new Producto("2", "Tuercas"));
		productos.add(new Producto("3", "Llaves"));

		JOptionPane.showMessageDialog(null, productos);
	}

	private static String imprimirProductos(ArrayList<Producto> productos) {
		String lista = "";
		Iterator<Producto> iterator = productos.iterator();

		while (iterator.hasNext()) {
			lista += iterator.next().toString();
		}

		return lista;
	}

}

package controlador;


import javax.swing.JOptionPane;

import org.bson.Document;

import modelo.Jugador;

public class ConJugador {
	
	
	public static Document createDBObject(Jugador jugador){
		
		
		Document document = new Document("_id", jugador.get_id()	).
		append("pregunta", jugador.getNombre());
		
		
		return document;
	}
	
	public static Jugador crearJugador(int id) {
		
		String nombre  = JOptionPane.showInputDialog("Ingrese su nombre");
		
		Jugador j = new Jugador();
		
		j.set_id(id);
		j.setNombre(nombre);
		
		return j;
	}

}

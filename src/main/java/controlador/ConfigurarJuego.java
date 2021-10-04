package controlador;


import java.util.ArrayList;


import javax.swing.JOptionPane;

import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


import modelo.Conexion;
import modelo.Preguntas;

public class ConfigurarJuego {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Preguntas pregunta = crearPregunta();
		Document doc = createDBObject(pregunta);
		
		MongoCollection<Document> pedidoC = database.getCollection("preguntas");
		pedidoC.insertOne(doc);
		System.out.println("Succesful");
		

	}
	
	private static Document createDBObject(Preguntas pregunta){
		
		
		Document document = new Document("_id", pregunta.get_id()	).
		append("pregunta", pregunta.getPregunta()).
		append("opcionesRespuesta", pregunta.getOpcionesRespuesta()).
		append("respuestaCorrecta", pregunta.getRespuestaCorrecta()).
		append("categoria", pregunta.getCategoria());
		
		
		return document;
	}
	
	private static Preguntas crearPregunta() {
		
		ArrayList<String> opciones = new ArrayList<String>();
		
		int id  = Integer.parseInt((JOptionPane.showInputDialog("Ingrese el id de la pregunta")));
		
		String pregunta = JOptionPane.showInputDialog("Ingrese la pregunta");
		
		for (int i = 0; i<4 ; i++) {
			
			opciones.add(i, String.valueOf(JOptionPane.showInputDialog("Ingrese la opcion de respuesta "+ i+1 )));  
			
		}
		
		int categoria  = Integer.parseInt((JOptionPane.showInputDialog("Ingrese la categoria")));
		
		int respuestaCorrecta = Integer.parseInt((JOptionPane.showInputDialog("Ingrese la opcion correcta")));
		
		Preguntas p = new Preguntas();
		
		p.set_id(id);
		p.setPregunta(pregunta);
		p.setOpcionesRespuesta(opciones);
		p.setRespuestaCorrecta(respuestaCorrecta);
		p.setCategoria(categoria);
		return p;
	}
	
	static Conexion con = new Conexion();
	static MongoDatabase database = con.conectar(); 
	static Gson gson = new Gson();

}

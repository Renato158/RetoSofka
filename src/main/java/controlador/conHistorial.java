package controlador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import modelo.Conexion;
import modelo.Historial;
import modelo.Jugador;


public class conHistorial {
	
	public static Document createDBObject(Historial historial){
		
		
		Document document = new Document("idJugador", historial.getIdJugador()).
		append("premio", historial.getPremio()).
		append("fecha", historial.getFecha());
		
		return document;
	}
	
	public static Historial crearHistorial(int premio, int id) {
		
		MongoCollection<Document> jugador = database.getCollection("jugador");
		
		FindIterable<Document> conJugador = jugador.find(new BasicDBObject("_id", id));
		
		List<String> listJugadores = new ArrayList<String>();
    	conJugador.forEach(names -> listJugadores.add(names.toJson()));
    	
    	
    	Jugador j = gson.fromJson(listJugadores.get(0), Jugador.class);
    	
		Historial h = new Historial();
		
		h.setIdJugador(j.get_id());
		h.setPremio(premio);
		h.setFecha(LocalDate.now().toString());
		return h;
	}
	
	static Conexion con = new Conexion();
	static MongoDatabase database = con.conectar(); 
	static Gson gson = new Gson();

}

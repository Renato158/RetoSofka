package controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import modelo.Preguntas;
import modelo.Conexion;
import modelo.Historial;
import modelo.Jugador;


public class Juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Juego.iniciarJuego();
		
		

	}
	
	public static void iniciarJuego() {
		
		
		int premio = 0;
		int continuar = 0;
		int id  = Integer.parseInt((JOptionPane.showInputDialog("Ingrese su numero id")));
		Jugador jugador = ConJugador.crearJugador(id);
		Document doc = ConJugador.createDBObject(jugador);
		
		MongoCollection<Document> jugadorC = database.getCollection("jugador");
		jugadorC.insertOne(doc);
		
		while(continuar == 0) {
		
			System.out.println("\n Nivel 1 \n");
			
			Preguntas p = Juego.nivel1();
			
	    	System.out.println(p.getPregunta());
	    	
	    	for(int i = 0; i<4; i++) {
	    		
	    		System.out.println(i+1 + " " + p.getOpcionesRespuesta().get(i));
	    	}
	    	
	    	int respuestaCorrecta = Integer.parseInt((JOptionPane.showInputDialog("Ingrese la opcion correcta")));
	    	
	
	    	
	    	if(Juego.comprobarRespuesta(p.getRespuestaCorrecta(),respuestaCorrecta, 1)) {
	    		
	    		premio = 500;
	    		
	    		System.out.println("Llevas un premio de: "+ premio+" dolares");
	    		
            	continuar = JOptionPane.showConfirmDialog(null, "Deseas continuar jugando y seguir acomulando el premio");
            	
            	if(continuar == 1) {
            		
            		System.out.print("Terminaste el juego, premio: "+ premio);
            		
            		Historial historial = conHistorial.crearHistorial(premio, id);
            		Document doc1 = conHistorial.createDBObject(historial);
            		
            		MongoCollection<Document> historialC = database.getCollection("historial");
            		historialC.insertOne(doc1);
            		
            		break;
            	}
	    				
	    		System.out.println("\n Nivel 2 \n");
	    		
	    		Preguntas p2 = Juego.nivel2();
	    		
	        	System.out.println(p2.getPregunta());
	        	
	        	for(int i = 0; i<4; i++) {
	        		
	        		System.out.println(i+1 + " " + p2.getOpcionesRespuesta().get(i));
	        	}
	        	
	        	int respuestaCorrecta2 = Integer.parseInt((JOptionPane.showInputDialog("Ingrese la opcion correcta")));
	        	
	
	        	
	        	if(Juego.comprobarRespuesta(p2.getRespuestaCorrecta(),respuestaCorrecta2, 2)) {
	        		
	        		premio = 1200;
	        		
	        		System.out.println("Llevas un premio de: "+ premio+" dolares");
	        		
	            	continuar = JOptionPane.showConfirmDialog(null, "Deseas continuar jugando y seguir acomulando el premio");
	            	
	            	if(continuar == 1) {
	            		
	            		System.out.print("Terminaste el juego, premio: "+ premio);
	            		
	            		
	            		Historial historial = conHistorial.crearHistorial(premio, id);
	            		Document doc1 = conHistorial.createDBObject(historial);
	            		
	            		MongoCollection<Document> historialC = database.getCollection("historial");
	            		historialC.insertOne(doc1);
	            		
	            		break;
	            	}
	        		
	        		System.out.println("\n Nivel 3 \n");
	        		
	        		Preguntas p3 = Juego.nivel3();
	        		
	            	System.out.println(p3.getPregunta());
	            	
	            	for(int i = 0; i<4; i++) {
	            		
	            		System.out.println(i+1 + " " + p3.getOpcionesRespuesta().get(i));
	            	}
	            	
	            	int respuestaCorrecta3 = Integer.parseInt((JOptionPane.showInputDialog("Ingrese la opcion correcta")));
	            	
	
	            	if(Juego.comprobarRespuesta(p3.getRespuestaCorrecta(),respuestaCorrecta3, 3)) {
	            		
	            		premio = 2300;
	            		
	            		System.out.println("Llevas un premio de: "+ premio+" dolares");
	            		
		            	continuar = JOptionPane.showConfirmDialog(null, "Deseas continuar jugando y seguir acomulando el premio");
		            	
		            	if(continuar == 1) {
		            		
		            		System.out.print("Terminaste el juego, premio: "+ premio);
		            		
		            		Historial historial = conHistorial.crearHistorial(premio, id);
		            		Document doc1 = conHistorial.createDBObject(historial);
		            		
		            		MongoCollection<Document> historialC = database.getCollection("historial");
		            		historialC.insertOne(doc1);
		            		
		            		break;
		            	}
	            		
	            		System.out.println("\n Nivel 4 \n");
	            		
	            		Preguntas p4 = Juego.nivel4();
	            		
	                	System.out.println(p4.getPregunta());
	                	
	                	for(int i = 0; i<4; i++) {
	                		
	                		System.out.println(i+1 + " " + p4.getOpcionesRespuesta().get(i));
	                	}
	                	
	                	int respuestaCorrecta4 = Integer.parseInt((JOptionPane.showInputDialog("Ingrese la opcion correcta")));
	                	
	                	
	                	if(Juego.comprobarRespuesta(p4.getRespuestaCorrecta(),respuestaCorrecta4, 4)) {
	                		
	                		premio = 3500;
	                		
	                		System.out.println("Llevas un premio de: "+ premio+" dolares");
	                		
			            	continuar = JOptionPane.showConfirmDialog(null, "Deseas continuar jugando y seguir acomulando el premio");
			            	
			            	if(continuar == 1) {
			            		
			            		System.out.print("Terminaste el juego, premio: "+ premio);
			            		
			            		Historial historial = conHistorial.crearHistorial(premio, id);
			            		Document doc1 = conHistorial.createDBObject(historial);
			            		
			            		MongoCollection<Document> historialC = database.getCollection("historial");
			            		historialC.insertOne(doc1);
			            		
			            		break;
			            	}
	                		
	                		System.out.println("\n Nivel 5 \n");
	                		
	                		Preguntas p5 = Juego.nivel5();
	                		
	                    	System.out.println(p5.getPregunta());
	                    	
	                    	for(int i = 0; i<4; i++) {
	                    		
	                    		System.out.println(i+1 + " " + p5.getOpcionesRespuesta().get(i));
	                    	}
	                    	
	                    	int respuestaCorrecta5 = Integer.parseInt((JOptionPane.showInputDialog("Ingrese la opcion correcta")));
	                    	
	                    	if(Juego.comprobarRespuesta(p5.getRespuestaCorrecta(),respuestaCorrecta5, 5)) {
	                    		
	                    		premio = 5000;
	                    		System.out.print("Ganaste el juego, tu premio es de:  "+ premio +" dolares" );
	                    		
	    	            		Historial historial = conHistorial.crearHistorial(premio, id);
	    	            		Document doc1 = conHistorial.createDBObject(historial);
	    	            		
	    	            		MongoCollection<Document> historialC = database.getCollection("historial");
	    	            		historialC.insertOne(doc1);
	    	            		
	    	            		break;
	    	            		
	                    	}else {
	                    		premio = 0;
	                    		
	                    		System.out.println("Fin del juego, perdiste");
	                    		
	    	            		Historial historial = conHistorial.crearHistorial(premio, id);
	    	            		Document doc1 = conHistorial.createDBObject(historial);
	    	            		
	    	            		MongoCollection<Document> historialC = database.getCollection("historial");
	    	            		historialC.insertOne(doc1);
	    	            		
	                    		break;
	                    	}
	                		
	                	}else {
	                		
	                		premio = 0;
	                		System.out.println("Fin del juego, perdiste");
	                		
		            		Historial historial = conHistorial.crearHistorial(premio, id);
		            		Document doc1 = conHistorial.createDBObject(historial);
		            		
		            		MongoCollection<Document> historialC = database.getCollection("historial");
		            		historialC.insertOne(doc1);
		            		
	                		break;
	                	}
	            		
	            	}else {
	            		
	            		premio = 0;
	            		System.out.println("Fin del juego, perdiste");
	            		
	            		Historial historial = conHistorial.crearHistorial(premio, id);
	            		Document doc1 = conHistorial.createDBObject(historial);
	            		
	            		MongoCollection<Document> historialC = database.getCollection("historial");
	            		historialC.insertOne(doc1);
	            		
	            		break;
	            	}
	        	}else {
	        		premio = 0;
	        		System.out.println("Fin del juego, perdiste");
	        		
            		Historial historial = conHistorial.crearHistorial(premio, id);
            		Document doc1 = conHistorial.createDBObject(historial);
            		
            		MongoCollection<Document> historialC = database.getCollection("historial");
            		historialC.insertOne(doc1);
            		
	        		break;
	        	}
	        	
	    	}else {
	    		premio = 0;
	    		System.out.println("Fin del juego, perdiste");
	    		
        		Historial historial = conHistorial.crearHistorial(premio, id);
        		Document doc1 = conHistorial.createDBObject(historial);
        		
        		MongoCollection<Document> historialC = database.getCollection("historial");
        		historialC.insertOne(doc1);
        		
	    		break;
	    	}
	    	
		}
		
	}
		
	
	public static boolean comprobarRespuesta(int respuestaCorrecta, int respuesta, int nivel) {
		
		boolean valor = false;
		
		switch(nivel) {
		
			case 1: if(respuesta == respuestaCorrecta) {
						valor =  true;
					}
					break;
			
			case 2: if(respuesta == respuestaCorrecta) {
						valor =  true;
					}
					break;	
					
			case 3: if(respuesta == respuestaCorrecta) {
						valor =  true;
					}
					break;
					
			case 4: if(respuesta == respuestaCorrecta) {
						valor =  true;
					}
					break;
					
			case 5: if(respuesta == respuestaCorrecta) {
						valor =  true;
					}
					break;
					
		}
		
		return valor;
		
	}
	
	
	
	public static int numeroAleatorio() {
		
		int minimo = 0;
		int maximo  = 4;
		
        return ThreadLocalRandom.current().nextInt(minimo, maximo );
		
		
	}
	
	public static Preguntas nivel1() {
		
		MongoCollection<Document> preguntas = database.getCollection("preguntas");
		
		int indice = numeroAleatorio();
		
		FindIterable<Document> conPreguntas = preguntas.find(new BasicDBObject("categoria", 1));
		
		List<String> listPreguntas = new ArrayList<String>();
    	conPreguntas.forEach(names -> listPreguntas.add(names.toJson()));
    	
    	
    	Preguntas p = gson.fromJson(listPreguntas.get(indice), Preguntas.class);
   
    	
    	return p;
    	
		
	}
	
	public static Preguntas nivel2() {
		
		MongoCollection<Document> preguntas = database.getCollection("preguntas");
		
		int indice = numeroAleatorio();
		
		FindIterable<Document> conPreguntas = preguntas.find(new BasicDBObject("categoria", 2));
		
		List<String> listPreguntas = new ArrayList<String>();
    	conPreguntas.forEach(names -> listPreguntas.add(names.toJson()));
    	
    	
    	Preguntas p = gson.fromJson(listPreguntas.get(indice), Preguntas.class);
    	
    	return p;
		
		
	}
	
	public static Preguntas nivel3() {
		
		MongoCollection<Document> preguntas = database.getCollection("preguntas");
		
		int indice = numeroAleatorio();
		
		FindIterable<Document> conPreguntas = preguntas.find(new BasicDBObject("categoria", 3));
		
		List<String> listPreguntas = new ArrayList<String>();
    	conPreguntas.forEach(names -> listPreguntas.add(names.toJson()));
    	
    	
    	Preguntas p = gson.fromJson(listPreguntas.get(indice), Preguntas.class);
    	
    	return p;
		
		
	}
	
	public static Preguntas nivel4() {
		
		MongoCollection<Document> preguntas = database.getCollection("preguntas");
		
		int indice = numeroAleatorio();
		
		FindIterable<Document> conPreguntas = preguntas.find(new BasicDBObject("categoria", 4));
		
		List<String> listPreguntas = new ArrayList<String>();
    	conPreguntas.forEach(names -> listPreguntas.add(names.toJson()));
    	
    	
    	Preguntas p = gson.fromJson(listPreguntas.get(indice), Preguntas.class);
    	
    	return p;		
		
		
	}
	
	public static Preguntas nivel5() {
		
		MongoCollection<Document> preguntas = database.getCollection("preguntas");
		
		int indice = numeroAleatorio();
		
		FindIterable<Document> conPreguntas = preguntas.find(new BasicDBObject("categoria", 5));
		
		List<String> listPreguntas = new ArrayList<String>();
    	conPreguntas.forEach(names -> listPreguntas.add(names.toJson()));
    	
    	
    	Preguntas p = gson.fromJson(listPreguntas.get(indice), Preguntas.class);
    	
    	return p;
		
	}
	
	static Conexion con = new Conexion();
	static MongoDatabase database = con.conectar(); 
	static Gson gson = new Gson();
	


}

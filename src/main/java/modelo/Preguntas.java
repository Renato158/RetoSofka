package modelo;

import java.util.ArrayList;

public class Preguntas {
	
	
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public ArrayList<String> getOpcionesRespuesta() {
		return opcionesRespuesta;
	}
	public void setOpcionesRespuesta(ArrayList<String> opcionesRespuesta) {
		this.opcionesRespuesta = opcionesRespuesta;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	public int getRespuestaCorrecta() {
		return respuestaCorrecta;
	}
	public void setRespuestaCorrecta(int respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}
	
	@Override
	public String toString() {
		return "Preguntas [_id=" + _id + ", pregunta=" + pregunta + ", opcionesRespuesta=" + opcionesRespuesta + ", "
				+ "respuestaCorrecta=" + respuestaCorrecta + "categoria=" + categoria + "]";
	}
	
	private int _id;
	private String pregunta;
	private ArrayList<String> opcionesRespuesta;
	private int categoria;
	private int respuestaCorrecta;

}

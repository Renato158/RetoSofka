package modelo;

public class Jugador {
	

	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@Override
	public String toString() {
		return "Jugador [_id=" + _id + ", nombre=" + nombre + "]";
	}
	
	private int _id;
	private String nombre;

}

package modelo;

public class Historial {
	
	
	
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public int getIdJugador() {
		return idJugador;
	}
	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}
	public int getPremio() {
		return premio;
	}
	public void setPremio(int premio) {
		this.premio = premio;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "Historial [_id=" + _id + ", idJugador=" + idJugador + ", premio=" + premio +
				", fecha=" + premio+ "]";
	}
	
	private int _id;
	private int idJugador;
	private int premio;
	private String fecha;
	
	

}

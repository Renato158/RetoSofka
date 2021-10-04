package modelo;

public class Historial {
	

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
		return "Historial [idJugador=" + idJugador + ", premio=" + premio +
				", fecha=" + premio+ "]";
	}
	
	private int idJugador;
	private int premio;
	private String fecha;
	
	

}

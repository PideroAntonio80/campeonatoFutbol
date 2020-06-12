package campeonatofutbol.model;

public class Jugador {

	private String nombre;
	private int numDorsal;
	public Jugador(String nombre, int numDorsal) {
		super();
		this.nombre = nombre;
		this.numDorsal = numDorsal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumDorsal() {
		return numDorsal;
	}
	public void setNumDorsal(int numDorsal) {
		this.numDorsal = numDorsal;
	}
	
	
		
}

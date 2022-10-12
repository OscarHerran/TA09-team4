package ej2;

public class Videojuego implements Entregable {
	protected String titulo;
	protected int h_estimadas;
	protected boolean entregado;
	protected String genero;
	protected String compañia;
	protected String VideojuegoArray[] = new String[5];

	public Videojuego() {
		super();
		this.titulo = "";
		this.h_estimadas = 10;
		this.entregado = false;
		this.genero = "";
		this.compañia = "";
	}

	public Videojuego(String titulo, int h_estimadas) {
		super();
		this.titulo = titulo;
		this.h_estimadas = h_estimadas;
		this.entregado = false;
		this.genero = "";
		this.compañia = "";
	}

	public Videojuego(String titulo, int h_estimadas, String genero, String compañia) {
		super();
		this.titulo = titulo;
		this.h_estimadas = h_estimadas;
		this.entregado = false;
		this.genero = genero;
		this.compañia = compañia;
	}

	// Getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getH_estimadas() {
		return h_estimadas;
	}

	public void setH_estimadas(int h_estimadas) {
		this.h_estimadas = h_estimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	// Metodos interficie entregable
	public void entregar() {
		entregado = true;
	}

	public void devolver() {
		entregado = false;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public boolean compareTo(Object a) {
		if(this.h_estimadas > ((Videojuego) a).getH_estimadas()){
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "Videojuego titulo=" + titulo + ", h_estimadas=" + h_estimadas + ", entregado=" + entregado + ", genero="
				+ genero + ", compañia=" + compañia;
	}

}
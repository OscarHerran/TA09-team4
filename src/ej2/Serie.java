package ej2;

public class Serie implements Entregable {
	protected String titulo;
	protected int n_temp;
	protected boolean entregado;
	protected String genero;
	protected String creador;

	public Serie() {
		this.titulo = "";
		this.n_temp = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.n_temp = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}

	public Serie(String titulo, int n_temp, String genero, String creador) {
		this.titulo = titulo;
		this.n_temp = n_temp;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	// Getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getN_temp() {
		return n_temp;
	}

	public void setN_temp(int n_temp) {
		this.n_temp = n_temp;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
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
		if(this.n_temp > ((Serie) a).getN_temp()){
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "Serie titulo=" + titulo + ", n_temp=" + n_temp + ", entregado=" + entregado + ", genero=" + genero
				+ ", creador=" + creador;
	}
}
package clases;

public class Pelicula {

	final private String TITULO_POR_DEFECTO = "";
	final private int DURACION_POR_DEFECTO = 0; // en minutos
	final private String DIRECTOR_POR_DEFECTO = "";
	final private int EDAD_MINIMA_POR_DEFECTO = 0;

	private String titulo;
	private int duracion; // en minutos
	private String director;
	private int edad_minima;

	public Pelicula() {
		this.director = this.DIRECTOR_POR_DEFECTO;
		this.duracion = this.DURACION_POR_DEFECTO;
		this.edad_minima = this.EDAD_MINIMA_POR_DEFECTO;
		this.titulo = this.TITULO_POR_DEFECTO;
	}

	public Pelicula(String titulo, int duracion, String director, int edad_minima) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.director = director;
		this.edad_minima = edad_minima;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public String getDirector() {
		return director;
	}

	public int getEdad_minima() {
		return edad_minima;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setEdad_minima(int edad_minima) {
		this.edad_minima = edad_minima;
	}

}

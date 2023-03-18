package clases;

import utils.CustomParser;
import java.util.Random;

public class Cine {
	final private int FILAS = 8;
	final private int COLUMNAS = 9;
	final private double PRECIO_POR_DEFECTO = 8; // son Euros

	private Pelicula pelicula; // El cine sólo tiene una sala por lo que sólo se retransmite una película
	private Asiento[][] asientos;
	private double precio;

	public Cine() {
		this.pelicula = new Pelicula();
		this.asientos = new Asiento[this.FILAS][this.COLUMNAS];
		this.precio = this.PRECIO_POR_DEFECTO;
	}

	public Cine(Pelicula pelicula, double precio) {
		super();
		this.pelicula = pelicula;
		this.precio = precio;
	}

	public void asignaEspectadorAAsiento(Espectador espectador) {

		if (isTodoLleno()) {
			System.out.println("No hay sitio");
		} else {
			Random rnd = new Random();
			int fila_aleatoria = rnd.nextInt(this.FILAS - 1); // Se empieza a contar desde el 0
			int columna_aleatoria = rnd.nextInt(this.COLUMNAS - 1); // Se empieza a contar desde el 0

			while (!this.asientos[fila_aleatoria][columna_aleatoria].isOcupado()) {
				fila_aleatoria = rnd.nextInt(this.FILAS - 1);
				columna_aleatoria = rnd.nextInt(this.COLUMNAS - 1);
			}

		}

	}

	public boolean isTodoLleno() {
		boolean todo_ocupado = true;
		int i = 0;
		int j = 0;
		while ((i < this.FILAS) && todo_ocupado) {
			j = 0;
			while (j < this.COLUMNAS && todo_ocupado) {
				todo_ocupado = this.asientos[i][j].isOcupado();
				j++;
			}
			i++;
		}
		return todo_ocupado;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public Asiento[][] getAsientos() {
		return asientos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public void setAsiento(Espectador espectador, int fila, char columna) {
		// hacemos que se tenga que introducir la fila 1 que un usuario lo entiene más
		// que no empezar por 0
		this.asientos[fila - 1][CustomParser.columnParser(columna)].setEspectador(espectador);
		this.asientos[fila - 1][CustomParser.columnParser(columna)].setOcupado(true);
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}

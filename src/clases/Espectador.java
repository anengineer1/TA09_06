package clases;

public class Espectador {
	final private String NOMBRE_POR_DEFECTO = "John Doe";
	final private int EDAD_POR_DEFECTO = 25;
	final private double DINERO_POR_DEFECTO = 0.0;

	private String nombre;
	private int edad;
	private double dinero;

	public Espectador() {
		this.nombre = this.NOMBRE_POR_DEFECTO;
		this.edad = this.EDAD_POR_DEFECTO;
		this.dinero = this.DINERO_POR_DEFECTO;
	}

	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public double getDinero() {
		return dinero;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

}

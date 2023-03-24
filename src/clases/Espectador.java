package clases;

public class Espectador {
	final private String NOMBRE_POR_DEFECTO = "";
	final private int EDAD_POR_DEFECTO = 0;
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
	
	public static boolean sePuedeSentar(Espectador espectador, Cine cine, Pelicula pelicula) {
		boolean sePuedeSentar = true;
		
		if(espectador.dinero < cine.getPrecio()) {
			System.out.println("El espectador " + espectador.nombre + " no puede pagar la entrada");
			sePuedeSentar = false;
		} else if (espectador.edad < pelicula.getEdad_minima()) {
			System.out.println("El espectador " + espectador.nombre  + " no eiene la edad suficiente para ver la pelicula");
			sePuedeSentar = false;
		} else if(cine.isTodoLleno() == true) {
			System.out.println("El espectador " + espectador.nombre  + " no puede entrar porque el cine esta todo lleno");
			sePuedeSentar = false;
		}
		return sePuedeSentar;
	}

	@Override
	public String toString() {
		return ("Nombre: " + this.nombre + "\n" + "Edad: " + this.edad + "\n" + "Cash: " + this.dinero);
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

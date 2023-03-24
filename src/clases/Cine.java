
package clases;

import java.util.ArrayList;
import java.util.Random;

import utils.CustomParser;

public class Cine {
	final private int FILAS = 8;
	final private int COLUMNAS = 9;
	final private double PRECIO_POR_DEFECTO = 8; // son Euros

	private Pelicula pelicula; // El cine sólo tiene una sala por lo que sólo se retransmite una película
	private char[][] asientos =  new char[this.FILAS][this.COLUMNAS];
	private double precio;
	private ArrayList<int[]> AsientosAsignados =  new ArrayList<int[]>();

	public Cine() {
		this.pelicula = new Pelicula();
		this.asientos = new char[this.FILAS][this.COLUMNAS];
		this.precio = this.PRECIO_POR_DEFECTO;
	}

	public Cine(Pelicula pelicula, double precio) {
		super();
		this.pelicula = pelicula;
		this.precio = precio;
	}

	//Asignamos una fila y columna al espectador
	public void asignaEspectadorAAsiento(Espectador espectador) {
		Random rnd = new Random();
		int fila_aleatoria;
		int columna_aleatoria;
		int[] Asignado = new int[2];
		boolean AsientoOcupado = false;
		
		fila_aleatoria = rnd.nextInt(this.FILAS - 1); // Se empieza a contar desde el 0
		columna_aleatoria = rnd.nextInt(this.COLUMNAS - 1); // Se empieza a contar desde el 
		
		Asignado[0]=fila_aleatoria;
		Asignado[1]=columna_aleatoria;
		this.AsientosAsignados.add(Asignado);
		
    	for(int j=0; j<(this.AsientosAsignados.size()-1); j++ ) {
    		if(this.AsientosAsignados.size()>1) {
    			//Si la fila y columna asignada al usuario que queremos sentar, es igual a la
    			//que se le asigno a otro de los espectadores, lo volveremos a asignar a otro asiento
    			if(this.AsientosAsignados.get((AsientosAsignados.size()-1))[0] == this.AsientosAsignados.get(j)[0]
    					&& this.AsientosAsignados.get((AsientosAsignados.size()-1))[1] == this.AsientosAsignados.get(j)[1]) {
    				AsientoOcupado = true;
    				this.AsientosAsignados.remove((AsientosAsignados.size()-1));
    				asignaEspectadorAAsiento(espectador);
    			}
			}
   		}
    	
    	if(AsientoOcupado == false) {
	    	//Imprimimos por pantalla la fila y la columna del especatdor
	    	System.out.println("El espectador " + espectador.getNombre() + " se sienta en [" + CustomParser.invertirNum((this.AsientosAsignados.get((AsientosAsignados.size()-1))[0]+1))  
	    			+ "-" + CustomParser.numToLetra(this.AsientosAsignados.get((AsientosAsignados.size()-1))[1]) + "]");
    	}
	}
		
	//Método que imprime la sala con los asientos que estan llenos
	public void mostrarSala() {
		int IndicadorFila = (this.asientos.length);
	
		System.out.println(" \n\u001B[34m     A   B   C   D    E    F   G    H   I\u001B[30m");
		System.out.println("  ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		for (int x=0; x < this.asientos.length; x++){
			System.out.print("\u001B[34m" + (IndicadorFila--) + " \u001B[30m");
	        for (int y=0; y < this.asientos[x].length; y++) {
	        	this.asientos[x][y]='◯';
	        	
	        	for(int j=0; j<this.AsientosAsignados.size(); j++ ) {
	        		if(this.asientos[AsientosAsignados.get(j)[0]][AsientosAsignados.get(j)[1]] == '◯') {
	        			this.asientos[AsientosAsignados.get(j)[0]][AsientosAsignados.get(j)[1]]='⚫';
	        		} 
	        	}
        		if(this.asientos[x][y] != '◯') {
	        		System.out.print("┃" + "\u001B[32m " +(this.asientos[x][y])+ " \u001B[30m");
	        	} else {
	            	System.out.print("┃ " + this.asientos[x][y]+ " ");  
	        	}
	        }
	        System.out.print("┃ ");
	        System.out.println();
			System.out.println("  ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		}
	}

	//Método que mira si esta toto lleno 
	public boolean isTodoLleno() {
		boolean todo_ocupado = false;
		
		for (int x=0; x < this.asientos.length; x++){
	        for (int y=0; y < this.asientos[x].length; y++) {
	        	//Para comprobar que si esta todo lleno no se puede sentar al espectador
	        	//this.asientos[x][y]='⚫';
        		if(this.asientos[x][y] == 1) {
        			todo_ocupado = true;
        		} 
	        	
	        }
		}
		return todo_ocupado;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public char[][] getAsientos() {
		return asientos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public ArrayList<int[]> getAsientosAsignados() {
		return AsientosAsignados;
	}

	public void setAsientosAsignados(ArrayList<int[]> asientosAsignados) {
		this.AsientosAsignados = asientosAsignados;
	}

}
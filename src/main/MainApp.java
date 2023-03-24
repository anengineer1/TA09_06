package main;

import java.util.ArrayList;
import java.util.Collections;

import clases.Cine;
import clases.Espectador;
import clases.Pelicula;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Pelicula Pelicula = new Pelicula("The Avengers", 143, "Joss Whedon", 7);
		Cine Cine = new Cine(Pelicula, 8);
		
		//Creamos todos los espectadores que se quieran sentar
		ArrayList<Espectador> Espectadores = new ArrayList<Espectador>();
		Espectador Espectador1 = new Espectador("Andrea", 25, 40);
		Espectador Espectador2 = new Espectador("Raúl", 21, 5);
		Espectador Espectador3 = new Espectador("Yolanda", 56, 82);
		Espectador Espectador4 = new Espectador("Maria", 5, 30);
		Collections.addAll(Espectadores, Espectador1, Espectador2, Espectador3, Espectador4);
		
		System.out.println("        ┎──────────────┒\n        ┃\u001B[34m SALA DE CINE\u001B[30m ┃\n        ┖──────────────┚ \n"
				+ "La película de hoy es: " + Cine.getPelicula().getTitulo()
				+ "\nEl precio de la entrada es: " + Cine.getPrecio()
				+ " €\n \n\u001B[34mSentando a espectadores... \u001B[30m \n ");		

		//Recorremos todos los espectadores que hay para sentar y comprobamos si se pueden sentar. Si es asi, les asignamos un sitio 
		for(int i=0; i< Espectadores.size(); i++)  {
			if(Espectador.sePuedeSentar(Espectadores.get(i), Cine, Pelicula) == true)  {
				Cine.asignaEspectadorAAsiento(Espectadores.get(i));
			}
		}
		
		Cine.mostrarSala();
	}

}

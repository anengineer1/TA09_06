package utils;

public class CustomParser {
	
	public static char numToColumnParser(int columna) {
		// Pasamos un número del 0 a numtotal-1
		char col = 0;
		switch (columna) {
		case 0:
			col = 'A';
			break;

		case 1:
			col = 'B';
			break;

		case 2:
			col = 'C';
			break;

		case 3:
			col = 'D';
			break;

		case 4:
			col = 'E';
			break;

		case 5:
			col = 'F';
			break;

		case 6:
			col = 'G';
			break;

		case 7:
			col = 'H';
			break;

		case 8:
			col = 'I';
			break;

		default:
			break;
		}
		return col;
	}

	public static int columnParser(char columna) {
		// Pasamos un letra y devuelve su correspondiente posición
		// para una tabla
		int col = 0;
		switch (Character.toLowerCase(columna)) {
		case 'a':
			col = 0;
			break;

		case 'b':
			col = 1;
			break;

		case 'c':
			col = 2;
			break;

		case 'd':
			col = 3;
			break;

		case 'e':
			col = 4;
			break;

		case 'f':
			col = 5;
			break;

		case 'g':
			col = 6;
			break;

		case 'h':
			col = 7;
			break;

		case 'i':
			col = 8;
			break;

		default:
			break;
		}
		return col;
	}
}

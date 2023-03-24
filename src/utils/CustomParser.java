package utils;

public class CustomParser {
	
	public static String numToLetra(int NumColumna) {
		// Pasamos un número del 0 a numtotal-1
		String LetraColumna = "";
		switch (NumColumna) {
		case 0:
			LetraColumna = "A";
			break;

		case 1:
			LetraColumna = "B";
			break;

		case 2:
			LetraColumna = "C";
			break;

		case 3:
			LetraColumna = "D";
			break;

		case 4:
			LetraColumna = "E";
			break;

		case 5:
			LetraColumna = "F";
			break;

		case 6:
			LetraColumna = "G";
			break;

		case 7:
			LetraColumna = "H";
			break;

		case 8:
			LetraColumna = "I";
			break;

		default:
			break;
		}
		return LetraColumna;
	}
	
	public static int invertirNum(int NumFila) {
		// Pasamos un número del 0 a numtotal-1
		int NumFilaInvertido = 0;
		switch (NumFila) {
		case 1:
			NumFilaInvertido = 8;
			break;

		case 2:
			NumFilaInvertido = 7;
			break;

		case 3:
			NumFilaInvertido = 6;
			break;

		case 4:
			NumFilaInvertido = 5;
			break;

		case 5:
			NumFilaInvertido = 4;
			break;

		case 6:
			NumFilaInvertido = 3;
			break;

		case 7:
			NumFilaInvertido = 2;
			break;

		case 8:
			NumFilaInvertido = 1;
			break;
			
		default:
			break;
		}
		return NumFilaInvertido;
	}
}

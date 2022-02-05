package ejercicio5;

import Ejercicio2.Keyboard;

public class Ejemplo3 {

	public static void main(String[] args) {
		System.out.println("Ingresa la expresion:");
		String expresion = Keyboard.readString();
		
		System.out.println("Expresion "+expresion);
		System.out.println("Expresion postfija "+ ejmplo111.concat(ejmplo111.conpostfija(expresion)));
		System.out.println("Expresion postfija resuelta "+ ejmplo111.resultados(ejmplo111.conpostfija(expresion)));

	}

}

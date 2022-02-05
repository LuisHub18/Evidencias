package ejercicios1;
public class ejercicio1 {

	public static void main(String[] args) {
		int nuevo = 5;
		int viejo = 2;
		Pila pila = new Pila();
		
		pila.apilar(2);
		pila.apilar(7);
		pila.apilar(6);
		pila.apilar(2);
		pila.apilar(4);
		
		reemplazar(pila, nuevo, viejo);
		pila.listar();
		
	}
	
	public static void reemplazar(Pila pila, int nuevo, int viejo) {
		pila.editar(viejo, nuevo);
	}
}

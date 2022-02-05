package pila_cola_tarea;
/*
                                                                                            CLASE PILA
                                                                            |-------------------------------------------|
                                                                            |				Integrantes			        |
                                                                            |-------------------------------------------|
                                                                            |-Angulo Lopez Jose Alberto                 |
                                                                            |-------------------------------------------|
                                                                            |-Cristofer Jahir Bohorquez Espinoza        |
                                                                            |-------------------------------------------|
                                                                            |-Esmeralda Gadalupe Montoya Gastelum       |
                                                                            |-------------------------------------------|
                                                                            |-Eduardo Tellez Quiñonez                   |                   
                                                                            |-------------------------------------------|
                                                                            |-Jesus Elias Grande Orozco                 |                   
                                                                            |-------------------------------------------|
*/
public class Pila<T> implements Cloneable {
    private int max;
    private T[] arreglo;
    private T dr;
    private int tope;
    private int longitud;
    public Pila() {
        this(5);
    }
    @SuppressWarnings("unchecked")
    public Pila(int max) {
        this.max = max;
        arreglo = (T[]) new Object[max];
        tope = -1;
        longitud = 0;
    }
    public boolean add(T a) {
        if (llena())
            return false;
        longitud++;
        tope++;
        arreglo[tope] = a;
        return true;
    }
    public boolean remove() {
        if (vacia())
            return false;
        longitud--;
        dr = arreglo[tope];
        arreglo[tope] = null;
        tope--;
        return true;
    }
    public boolean vacia() {
        return tope == -1;
    }
    public boolean llena() {
        return tope == max - 1;
    }
    public T getDr() {
        return dr;
    }
    public void mostrar(){
        for (int i = 0; i <longitud ; i++) {
            System.out.println(arreglo [i]);
        }
    }
}

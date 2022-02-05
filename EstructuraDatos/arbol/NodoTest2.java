public class NodoTest2 {
    //Atributos
    private int valor;
    private static NodoTest2 padre;
    private NodoTest2 hojaIzquierda;
    private NodoTest2 hojaDerecha;

    //Constructor
    public NodoTest2 (int valor) {
        this.valor = valor;
    }

    //Metodos
    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public NodoTest2 getPadre() {
        return padre;
    }

    public void setPadre(NodoTest2 p) {
            padre = p;
    }

    public NodoTest2 getHojaIzquierda() {
        return hojaIzquierda;
    }

    public void setHojaIzquierda(NodoTest2 hojaIzquierda) {
        this.hojaIzquierda = hojaIzquierda;
    }

    public NodoTest2 getHojaDerecha() {
        return hojaDerecha;
    }

    public void setHojaDerecha(NodoTest2 hojaDerecha) {
        this.hojaDerecha = hojaDerecha;
    }


    @Override
    public String toString() {
        String aux = Integer.toString(valor);
        return aux;
    }
}

//Autor: Eduardo Téllez.
public class Padre {
    private int valor;
    public Padre(int v){
        valor=v;
    }
    public int getValor(){
        return valor;
    }
    public void setValor(int v){
        valor=v;
    }
    public String toString(){
        return "El valor es: "+valor;
    } 
}

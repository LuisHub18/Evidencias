// Autor: Eduardo Tellez.
public class Cuadrado extends Object {
// atributos
int lado;
// constructor
public Cuadrado(int lado){
this.lado = lado;
}
public int getLado(){
return lado; }
public void setLado(int nuevoLado){
lado = nuevoLado; 
}
public String toString(){
return "Cuadrado con lado= "+lado;
 }
// método para calcular el área del cuadrado
public int area () {
return lado * lado;
}
public int perimetro (){
return lado *4;
}
}

//Autor: Eduardo Tellez
public class ColorPoint extends Point{
 private String color="Rojo";
 public void setColor(String c){
     color=c;
 }
 public String getColor(){
     return color;
 }
 //Metodo equals para ColorPoint
 public boolean equals(Object o){
    if(o instanceof ColorPoint){
        ColorPoint cP=(ColorPoint)o;
        return (super.equals(cP)&& color.equals(cP.color));
    }
    return false;
 }
 public String toString(){
     return super.toString()+","+color;
 }
}

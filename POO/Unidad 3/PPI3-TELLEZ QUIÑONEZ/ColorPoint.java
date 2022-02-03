//Autor: Eduardo Tellez
public class ColorPoint extends Point{
 private String color="Rojo";
 public void setColor(String c){
     color=c;
 }
 public String getColor(){
     return color;
 }
 public String toString(){
     return super.toString()+","+color;
 }
}

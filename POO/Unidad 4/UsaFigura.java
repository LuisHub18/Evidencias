//Autor:Eduardo Tellez.
import java.util.ArrayList;

public class UsaFigura {
    public static void main(String [] args){
        ArrayList<FiguraGeometrica> listaFiguras=new ArrayList<FiguraGeometrica>();
        System.out.println("<---------------------------FIGURAS GEOMETRICAS--------------------------->");
        System.out.println("1.-CUADRADO\n2.-CIRCULO\n3.-TRIANGULO");
        String tipoFigura,color;
        int x,lado,radio,base,altura;
        System.out.print("Cuantas figuras agregara?");
        x=Keyboard.readInt();
        // INICIO AÑADIR FIGURAS
        for(int i=0;i<x;i++){
            System.out.print("Que figura desea añadir?");
            tipoFigura=Keyboard.readString().toUpperCase();
            switch(tipoFigura){
                case "CUADRADO":
                    System.out.println("----------CUADRADO----------");
                    System.out.print("Cuanto mide su lado?");
                    lado=Keyboard.readInt();
                    System.out.print("De que color es?");
                    color=Keyboard.readString();
                    System.out.println("-----------------------------");
                    listaFiguras.add(new Cuadrado(color, tipoFigura, lado));
                    break;
                case "CIRCULO":
                    System.out.println("-----------CIRCULO-----------");
                    System.out.print("Cuanto mide su radio?");
                    radio=Keyboard.readInt();
                    System.out.print("De que color es?");
                    color=Keyboard.readString();
                    System.out.println("-----------------------------");
                    listaFiguras.add(new Circulo(color, tipoFigura, radio));
                    break;
                case "TRIANGULO":
                    System.out.println("----------TRIANGULO----------");
                    System.out.print("Cuanto mide su base?");
                    base=Keyboard.readInt();
                    System.out.print("Cuanto mide su altura?");
                    altura=Keyboard.readInt();
                    System.out.print("De que color es?");
                    color=Keyboard.readString();
                    System.out.println("-----------------------------");
                    listaFiguras.add(new Triangulo(color, tipoFigura, base, altura));
                    break;
                default:
                    System.out.println("Esa Figura No Esta Disponible");
            }
        }// FIN AÑADIR FIGURAS
        System.out.println("<---------------------------IMPRIMIR FIGURAS--------------------------->");
        //IMPRIMIR LA LISTA DE FIGURAS
        System.out.println("Tipo de figura\tAtributos\tArea\tPerimetro");
        for(int i=0;i<listaFiguras.size();i++){
            System.out.println(listaFiguras.get(i).toString());
        }
        System.out.println("<---------------------COLOR FIGURA CON AREA MAYOR--------------------->");
        //FIGURA CON MAYOR AREA
        double may=0.0;
        int posicion=0;
        for(int i=0;i<listaFiguras.size();i++){
            if(may<listaFiguras.get(i).calcularArea()){
                posicion=i;
            }
        }
        System.out.println("------>"+listaFiguras.get(posicion).getColor());
    }
}

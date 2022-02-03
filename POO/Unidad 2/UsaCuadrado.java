//Usa la clase Cuadrado
//Autor: Eduardo Tellez
public class UsaCuadrado {
    public static void main(String [] args){
        Cuadrado a;
        System.out.println("--------CUADRADO---------");
        System.out.print("Cual es la medida del lado?");
        int l=Keyboard.readInt();
        a=new Cuadrado(l);
        System.out.println(a.toString());
        System.out.println("El area del cuadrado es de: "+a.area());
        System.out.println("El perimetro del cuadrado es de: "+a.perimetro());
    }
    
}

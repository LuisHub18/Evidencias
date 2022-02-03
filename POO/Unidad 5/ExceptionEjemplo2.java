//Autor: Eduardo Téllez.
import java.util.Arrays;
import java.util.Random;
public class ExceptionEjemplo2 {
    public static void main(String [] args){
        int r=0;
        int posicion;
        int[] a=new int[10];
        Random numeros=new Random();
        System.out.println("<-----------ArrayIndexOutOfBoundsException-------->");
        while(r<3){
            try {
                //Generar y llenar arreglo con numeros random
                for(int i=0;i<a.length;i++){
                    a[i]=numeros.nextInt(10)+1;
                }
                //Imprimir el arreglo
                System.out.println(Arrays.toString(a));
                //Leer posicion del arreglo que quiere ver el usuario
                System.out.print("Que posicion del arreglo desea ver?");
                posicion=Keyboard.readInt();
                System.out.println(a[posicion]);
                a[posicion]=1;
                r++;
                System.out.println("<------------------------------------------------>");
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBounds");
                System.out.println("<------------------------------------------------>");
            }
        }
    }
}

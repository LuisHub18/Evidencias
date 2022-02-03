//Programa que usa metodos de la clase punto para realizar operacion con los mismos.
//Autor: Eduardo Tellez
import java.util.*;
public class UsaPunto {
	public static void main(String[] args){
		Punto[] puntos=new Punto[3];
		String c;
		int x, y,p;
		
		//Lectura del teclado de los puntos
		for (int i=0;i<puntos.length;i++){
				System.out.println("PUNTO "+(i+1));
		 		System.out.print("Dame la X del punto: ");
		 		x=Keyboard.readInt();
		 		System.out.print("Dame la Y del punto: ");
		 		y=Keyboard.readInt();
		 		puntos[i]=new Punto(x,y);
		}
		//Imprime el arreglo puntos completo
		//No funciona
		for(int i=0;i<puntos.length;i++){
			System.out.print(puntos.toString());
		}
		System.out.println();
		//Mover a una nueva posicion (X,Y) un punto
		do{
		System.out.print("Desea cambiar de posicion algun punto? (Si o No)");
		c=Keyboard.readString();
		c=c.toUpperCase();
		if (c.equals("SI")){
			//Validar que el punto sea real
			do{
			System.out.print("Que punto desea cambiar?");
			p=Keyboard.readInt();
			}while(p<0 ||p>10);
			//Leer los valores de X y Y del punto
			System.out.print("Dame la X del punto: ");
		 	x=Keyboard.readInt();
	 		System.out.print("Dame la Y del punto: ");
	 		y=Keyboard.readInt();
			puntos[p-1].setX(x);
			puntos[p-1].setY(y);
			//Imprimir con el punto modificado
			System.out.println(Arrays.toString(puntos));
		}
		}while(c.equals("SI"));
		
		//Dice el total de puntos creados
		System.out.println("Puntos creados: "+Punto.getTotalPuntos());
	}
}

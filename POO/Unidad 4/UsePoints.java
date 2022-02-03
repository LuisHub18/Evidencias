//Autor: Eduardo Téllez.
import java.util.*;
public class UsePoints {
   public static void main(String  [] args){  
      ArrayList<Point> lista = new ArrayList<Point>();
      D3Point punto;
      int x,y,z;
       //Usos de D3Point
       System.out.print("Cuantos puntos seran?");
       int numero=Keyboard.readInt();
            for(int i=0;i<numero;i++){
               System.out.print("Que valor tendra en X?");
               x=Keyboard.readInt();
               System.out.print("Que valor tendra en Y?");
               y=Keyboard.readInt();
               System.out.print("Que valor tendra en Z?");
               z=Keyboard.readInt();
               System.out.println("----------------------");
               punto=new D3Point(x,y,z);
               lista.add(punto);
            }
            //Como el ArrayList es de puntos podemos guardar tantos objetos D3Point como
             lista.add(new Point());
             lista.add(new ColorPoint());
             System.out.println(lista);
             System.out.println(Point.totalPuntos);
             System.out.println("Este es el primer punto "+lista.get(0)+"\n"+"Este es el segundo punto"+lista.get(1));
             System.out.println("El punto medio es:"+lista.get(0).medio(lista.get(1)));
         
         Point p0 = new Point();
         Point p1 = new Point();
         ColorPoint cp = new ColorPoint();
         ColorPoint cp2 = new ColorPoint();
         System.out.println("1.-"+p0.equals(p1)+"\n"+"2.-"+p0.equals(cp)+"\n"+"3.-"+cp.equals(p1)+"\n"+"4.-"+cp.equals(cp2));
   }
}

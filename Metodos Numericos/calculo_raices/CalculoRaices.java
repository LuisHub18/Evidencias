//Programa que utiliza los metodos de la secante y de newton raphson para el calculo de raices de una ecuacion.
//Autor: Eduardo Téllez.
package calculo_raices;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class CalculoRaices {
    public static void main(String[] args) {
            int opcion=0;
            pantallaInicio();
            menu();
            do{
                System.out.print("¿Cual es su opción? ");
                opcion=Keyboard.readInt();
                switch(opcion){
                    case 1: 
                        metodoSecante();
                        break;  
                    case 2:
                        metodoNewtonRaphson();
                        break;
                    case 10:
                        System.out.println("----------------------Fin Del Programa-------------------------");
                        break;
                    default:
                        System.out.println("#OpcionInvalida");
                }
            }while(opcion!=10);
    }
    //Pantalla de Inicio
    public static void pantallaInicio(){
        System.out.println("\t\t  Instituto Tecnológico de Culiacán");
        System.out.println("\t\t  Ing. En Sistemas Computacionales. ");
        System.out.println("Téllez Quiñonez Luis Eduardo. ");
        System.out.println("Raíces de una Ecuación. ");
        System.out.println("De 12:00 a 13:00 horas. ");
        System.out.println("Este programa ejecuta el progreso de cálculo de Raices de \n        una ecuación utilizando diversos métodos.");
        System.out.println("--------------------------------------------------------------");
    }
    //Menu del programa   
    public static void menu(){
        System.out.println("\tMétodos Numéricos\n"+"Solución de Ecuaciones");
        System.out.println("1.-Método de la Secante");
        System.out.println("2.-Método de Newton Raphson");
        System.out.println("10.-FIN");
    }
    //Solucion de Ecuaciones por metodo de la secante
    public static void metodoSecante(){
        double x1=0,x2=0,error=0,fx1=0,fx2=0,x3=0,fx3=0;
        int n=0,iteraciones=0;
        String problema="";
        System.out.println("¿Cuál es el problema a resolver?");
        problema=Keyboard.readString();
        System.out.println("Método de la secante \nCaptura los métodos necesarios del problema:");
        System.out.print("X1=");
        x1=Keyboard.readDouble();
        System.out.print("X2= ");
        x2=Keyboard.readDouble();
        System.out.print("Error=");
        error=Keyboard.readDouble();
        System.out.print("Iteraciones=");
        iteraciones=Keyboard.readInt();
        fx1 = x1 - (5*Math.cos(2*x1))+5;
        fx2 = x2 - (5 * Math.cos(2 * x2)) + 5;
        x3 = x1 -((x1-x2)*fx1)/(fx1-fx2);
        fx3 = x3 - (5 * Math.cos(2 * x3)) + 5;
        System.out.println("Problema: "+problema);
        System.out.println("\t\t\t\t\t\t\t\t|Tabla de Datos|");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("N" +"\tX1\t\t\tf(X1)\t\t\tX2\t\t\tf(X2)\t\t\tX3\t\t\tf(X3)");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println ( (n+1) +"\t" + new BigDecimal(x1).setScale(15, RoundingMode.HALF_UP) + "\t" + new BigDecimal(fx1).setScale(15, RoundingMode.HALF_UP) + 
        "\t" +  new BigDecimal(x2).setScale(15, RoundingMode.HALF_UP) + "\t" + new BigDecimal(fx2).setScale(15, RoundingMode.HALF_UP) + "\t"  +  new BigDecimal(x3).setScale(15, RoundingMode.HALF_UP) + 
        "\t"  +  new BigDecimal(fx3).setScale(15, RoundingMode.HALF_UP));
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
        n++;
        while(Math.abs(fx3)>=error || iteraciones==n){
            x1 = x2;
            x2 = x3;
            fx1 = x1 - (5 * Math.cos(2 * x1)) + 5;
            fx2 = x2 - (5 * Math.cos(2 * x2)) + 5;
            x3 = x1 - ((x1 - x2) * fx1) / (fx1 - fx2);
            fx3 = x3 - (5 * Math.cos(2 * x3)) + 5;
            System.out.println ( (n+1) +"\t" + new BigDecimal(x1).setScale(15, RoundingMode.HALF_UP) + "\t" + new BigDecimal(fx1).setScale(15, RoundingMode.HALF_UP) + 
            "\t" +  new BigDecimal(x2).setScale(15, RoundingMode.HALF_UP) + "\t" + new BigDecimal(fx2).setScale(15, RoundingMode.HALF_UP) + 
            "\t"  +  new BigDecimal(x3).setScale(15, RoundingMode.HALF_UP) + "\t"  +  new BigDecimal(fx3).setScale(15, RoundingMode.HALF_UP));
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
            n++;
        }
        System.out.println("La solución de la ecuación es: "+ x3);
    }
    //Solucion de Ecuaciones por metodo de Newton Raphson
    public static void metodoNewtonRaphson(){
        double x1=0,error=0,fx1=0,fdx1=0,x2=0,fx2=0;
        int iteraciones=0,n=0;
        String problema="";
        System.out.println("¿Cuál es el problema a resolver?");
        problema=Keyboard.readString();
        System.out.println("Método de Newton Raphson \nCaptura los métodos necesarios del problema:");
        System.out.print("X1=");
        x1=Keyboard.readDouble();
        System.out.print("Error=");
        error=Keyboard.readDouble();
        System.out.print("Iteraciones=");
        iteraciones=Keyboard.readInt();
        fx1= x1-( 5*(Math.cos(2*x1))) + 5;
        fdx1= 1 + ( 10*(Math.sin(2*x1)));
        x2 = x1-(fx1 / fdx1);
        fx2= x2-( 5*(Math.cos(2*x2))) + 5;
        System.out.println("Problema: "+problema);
        System.out.println("\t\t\t\t\t|Tabla de datos|");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("N" + "\tX1\t\t\tf(X1)\t\t\tf'(X1)\t\tX2\t\t\tf(X2)");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println((n + 1) +"\t"  + new BigDecimal(x1).setScale(5, RoundingMode.HALF_UP) + "\t\t"  + new BigDecimal(fx1).setScale(5, RoundingMode.HALF_UP) + 
        "\t\t"  +new BigDecimal(fdx1).setScale(5, RoundingMode.HALF_UP)+"\t\t"+  new BigDecimal(x2).setScale(5, RoundingMode.HALF_UP) + "\t\t" 
         +  new BigDecimal(fx2).setScale(5, RoundingMode.HALF_UP));
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        n++;
        while((Math.abs(fx2)>=error) ||  (iteraciones<n)){
           x1=x2;
           fx1= x1-( 5*(Math.cos(2*x1))) + 5;
           fdx1= 1 + ( 10*(Math.sin(2*x1)));
           x2 = x1-(fx1 / fdx1);
           fx2= x2-( 5*(Math.cos(2*x2))) + 5;
           System.out.println((n + 1) +"\t"  + new BigDecimal(x1).setScale(5, RoundingMode.HALF_UP) + "\t\t"  + new BigDecimal(fx1).setScale(5, RoundingMode.HALF_UP) + 
           "\t\t"  +new BigDecimal(fdx1).setScale(5, RoundingMode.HALF_UP)+"\t\t"+  new BigDecimal(x2).setScale(5, RoundingMode.HALF_UP) + "\t\t"  
           +  new BigDecimal(fx2).setScale(5, RoundingMode.HALF_UP));           
           System.out.println("--------------------------------------------------------------------------------------------------------------");
           n++;
        }
        System.out.println("La solución de la ecuación es: "+ x2);
    }
}

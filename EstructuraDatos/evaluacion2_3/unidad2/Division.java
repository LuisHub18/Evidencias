package unidad2;
public class Division {
    public static void main(String[] args) {
        //Variables
        int dividendo, divisor;

        //Entrada
        System.out.println("Ingresar dividendo:");
        dividendo = Keyboard.readInt();

        System.out.println();

        System.out.println("Ingresar divisor:");
        divisor= Keyboard.readInt();

        System.out.println();

        //Salida
        System.out.println(dividendo + "/" + divisor + ": " + dividir(dividendo, divisor));

    }

    public static int dividir(int dividendo, int divisor){
        if(dividendo == divisor){ //Regresara 1 si ambas variables son igual a 1
            return 1;
        }
        else if(dividendo < divisor){ //Regresara 0 si el dividendo es menor al divisor
            return 0;
        }
        else{ //Llamara al metodo dividir y sumara 1
            return dividir(dividendo - divisor, divisor) + 1;
        }
    }
}

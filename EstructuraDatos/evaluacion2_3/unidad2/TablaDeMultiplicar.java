package unidad2;
public class TablaDeMultiplicar {
    public static void main(String[] args) {
        //variable
        int t;

        //Entrada
        System.out.println("Ingresa la tabla que deseas mostrar:");
        t = Keyboard.readInt();

        System.out.println();

        //Salida
        System.out.println("Tabla del " + t + ":");
        System.out.println(tabla(10, t));
    }

    //Regresara la tabla de multiplicar del numero t
    public static String tabla(int a, int t){
        if(a == 1){ //Regresara el resultado de multiplicar t X 1
            return t + " X " + 1 + " = " + t + "\n";
        }
        else{ //Llamara al metodo tabla y multiplicara t X b
            int b = a;
            return tabla(a - 1, t) + t + " X " + b + " = " + (t*b) + "\n";
        }
    }
}

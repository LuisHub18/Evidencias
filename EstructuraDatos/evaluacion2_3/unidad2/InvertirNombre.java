package unidad2;
public class InvertirNombre {
    public static void main(String[] args) {
        

        //Variable
        String nombre;

        //Entrada 
        System.out.println("Ingresar nombre:");
        nombre = Keyboard.readString();

        System.out.println();

        //Salida
        System.out.println("Nombre invertido: " + invertirString(nombre, nombre.length() - 1));
    }

    //Regresara un String invertido
    public static String invertirString(String nombre, int longitud){
        if(longitud == 0){ //Regresara el caracter en la posicion 0
            return nombre.charAt(longitud) + "";
        }
        else{ //Regresara el caracter en la posicion longitud y llamamra al metodo invertirString
            return nombre.charAt(longitud) + invertirString(nombre, longitud - 1);
        }
    }
}

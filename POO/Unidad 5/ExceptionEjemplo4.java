//Autor: Eduardo Téllez.
public class ExceptionEjemplo4 {
    public static void main(String [] args){
        String texto="";
        int posicion=0,i=0;
        char caracter;
        System.out.println("<----------------String Index Out Of Bound Exception--------------->");
        while(i<3){
            try {
                //Leer el texto
                System.out.print("Escribe un texto: ");
                texto=Keyboard.readString();
                //Tamaño de la cadena
                System.out.println("El tamaño de la cadena es de "+texto.length());
                //Leer posicion del caracter
                System.out.print("En que posicion esta el caracter que desea ver?");
                posicion=Keyboard.readInt();
                //Ver el caracter que esta en la posicion dada por el usuario
                caracter=texto.charAt(posicion);
                System.out.println("--->"+caracter);
                i++;
                System.out.println("<---------------------------------------------------------------->");
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("StringIndexOutofBoundsException");
                System.out.println("<---------------------------------------------------------------->");
            }
        } 
    }
}

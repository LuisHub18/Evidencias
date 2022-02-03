//Autor: Eduardo Téllez.
public class ExceptionEjemplo3 {
    public static void main(String [] args){    
        int i=0,numero=0;
        String cadena="";
        System.out.println("<---------------------Number Format Exception-------------------->");
        while(i<3){
            try {
                //Leer cadena con numeros
                System.out.print("Dame una cadena con numeros para convertirla a entero: ");
                cadena=Keyboard.readString();
                //Intentamos convertir a entero los numeros de la cadena
                numero=Integer.parseInt(cadena);
                System.out.println(numero);
                i++;
                System.out.println("<---------------------------------------------------------------->");
            }catch(NumberFormatException e) {
                System.out.println("Number format exception occurred");
                System.out.println("<---------------------------------------------------------------->");
            }
        }
    }
}


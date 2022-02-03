//Autor: Eduardo Téllez.
public class ExceptionEjemplo1 {
    public static void main(String [] args){
        int i=0;
        System.out.println("<-----------Arithmetic Exception-------->");
        while(i<5){
            try {
                int num1,num2,salida;
                //Leer los 2 numeros para dividir
                System.out.print("Primer número: ");
                num1=Keyboard.readInt();
                System.out.print("Segundo número: ");
                num2=Keyboard.readInt();
                //Intentar dividirlos
                salida=num1/num2;
                System.out.println("Resultado: "+salida);
                i++;
                System.out.println("<---------------------------------------->");
            } catch (ArithmeticException e) {
                System.out.println("You Shouldn't divide a number by zero");
                System.out.println("<---------------------------------------->");
            }
        }
        
    }
}

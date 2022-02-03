// Ejemplo de http://www.cica.es/formacion/JavaTut/Cap6/excep.html
// Capturando una excepción en un método
class Testcap {
        static int slice0[];
        static void uno(int x) {
            try {
                slice0[x] = 0; //linea #8
            } catch( NullPointerException e ) {
                System.out.println( "Captura una excepción diferente" );
            }
            /*catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Indice fuera de rango del array");
            }*/
        }
        public static void main( String a[] ) {
            try {
                int posicion,i=0;
                System.out.println("-----------EJERCICIO 1-----------");
                while(i<5){
                    System.out.print("Dame una posicion: ");
                    posicion=Keyboard.readInt();
                    uno(posicion); //linea # 16
                    i++;
                }
            } catch( Exception e ) {
                System.out.println( "Captura de la excepción en main()" );
                e.printStackTrace();
            }
        }
}

//Autor: Eduardo Téllez 
public class ProductCodes {
public static void main( String[] args ) {
        String code;
        char zone;
        int district, valid=0, banned=0;
        System.out.print("Código de producto (XXX para salir):");
        code = Keyboard.readString();
        while (!code.equals("XXX")) {
            try {
                zone = code.charAt(9);
                district = Integer.parseInt(code.substring(3,7));
                //System.out.println(district+""+code.length()+""+zone);
                if (zone == 'R' && district > 2000) banned++;
                else valid++;
            }
            catch (StringIndexOutOfBoundsException e){
                System.out.println ("Longitud invalida "+code);
            }
            catch (NumberFormatException e){
                System.out.println ("El distrito no es numérico "+code);
            }
            System.out.print("Código de producto (XXX para salir):");
            code = Keyboard.readString();
        }
        System.out.println( "Total de códigos válidos "+valid);
        System.out.println( "Total de códigos prohibidos "+banned );
    }
}
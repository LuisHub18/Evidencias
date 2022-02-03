/*
    Programa con Ejercicios de Metodos (Pag 42 y 45)
    Autor: Eduardo Tellez.
*/
import java.util.*;
public class EjecutarEjercicios{
    public static void main(String [] args){
        int opcion=0,numero;
        char x;
        String frase;
        boolean eje=true;
        int[]a={1,2,3,4,5};
        int[]b={6,7,8,9,10};
        System.out.println("------------------------MENU---------------------------");
        System.out.println("1.-cuentaLetras \t 2.-caracteresDigitos\n3.-esPar        \t 4.-esPrimo\n5.-numLetras        \t 14.-numDecenas");
        System.out.println("15.-pesoDolar     \t 16.-dolarPeso\n17.-rangoNumero \t 18.-esPalindromo");
        System.out.println("19.-numeroPalabras \t 20.-valorEntre\n21.-divisoresNumero \t 22.-sumaArreglos");
        System.out.println("---------------------------------------------------------");
        System.out.println("--Da un numero no disponible para finalizar el programa--");
        do{
            System.out.print("Cual programa desea ejecutar?");
            opcion=Keyboard.readInt();
            switch(opcion){
                case 1:
                    System.out.println("Dame una frase: ");
                    frase=Keyboard.readString();
                    System.out.print("Que letra deseas buscar?");
                    x=Keyboard.readChar();
                    System.out.println("Se encontraron "+cuentaLetras(frase,x)+ "letras "+x);
                    System.out.println("<><><><><><><><><><><><><><><><><><><><>");
                    break;
                case 2:
                    System.out.print("Escriba una frase, si tiene numeros se le regresara la cantidad:");
                    frase=Keyboard.readString();
                    System.out.println("Se encontraron "+caracteresDigitos(frase)+" en la frase");
                    System.out.println("<><><><><><><><><><><><><><><><><><><><>");
                    break;
                case 3:
                    System.out.print("Dame un numero par:");
                    numero=Keyboard.readInt();
                    System.out.println("El numero "+numero+" es par="+esPar(numero));
                    System.out.println("<><><><><><><><><><><><><><><><><><><><>");
                    break;
                case 4:
                    System.out.print("Dame un numero primo:");
                    numero=Keyboard.readInt();
                    System.out.println("El numero "+numero+" es primo="+esPrimo(numero));
                    System.out.println("<><><><><><><><><><><><><><><><><><><><>");
                    break;
                case 5:
                    System.out.print("Dame un numero del 0 al 100:");
                    numero=Keyboard.readInt();
                    System.out.println("El numero es "+numLetras(numero));
                    System.out.println("<><><><><><><><><><><><><><><><><><><><>");
                    break;
                case 14:
                    System.out.print("Dame un numero:");
                    numero=Keyboard.readInt();
                    System.out.println("El numero tiene "+numDecenas(numero)+" decenas");
                    System.out.println("<><><><><><><><><><><><><><><><><><><><>");
                    break;
                case 15:
                    System.out.print("Dame una cantidad en pesos:");
                    numero=Keyboard.readInt();
                    System.out.println(numero + " pesos son"+pesoDolar(numero)+"dolares");
                    System.out.println("<><><><><><><><><><><><><><><><><><><><>");
                    break;
                case 16:
                    System.out.print("Dame una cantidad en dolares: ");
                    numero=Keyboard.readInt();
                    System.out.println(numero+" dolares son "+dolarPeso(numero)+ " pesos");
                    System.out.println("<><><><><><><><><><><><><><><><><><><><>");
                    break;
                case 17:
                    System.out.print("Dame un numero entre 0 y 100: ");
                    numero=Keyboard.readInt();
                    System.out.println(rangoNumero(numero));
                    System.out.println("<><><><><><><><><><><><><><><><><><><><>");
                    break;
                case 18:
                    System.out.print("Dame un palindromo:");
                    frase=Keyboard.readString();
                    System.out.println(esPalindromo(frase));
                    System.out.println("<><><><><><><><><><><><><><><><><><><><>");
                    break;
                case 19:
                    System.out.print("Dame una frase: ");
                    frase=Keyboard.readString();
                    System.out.println("La frase tiene "+numeroPalabras(frase)+" palabras");
                    System.out.println("<><><><><><><><><><><><><><><><><><><><>");
                    break;
                case 20:
                    System.out.println("Numero Aleatorio="+valorEntre());
                    System.out.println("<><><><><><><><><><><><><><><><><><><><>");
                    break;
                case 21:
                    System.out.print("Dame un numero: ");
                    numero=Keyboard.readInt();
                    System.out.println(Arrays.toString(divisoresNumero(numero)));
                    System.out.println("<><><><><><><><><><><><><><><><><><><><>");
                    break;
                case 22:
                    System.out.println("Suma de 2 arreglos\n"+Arrays.toString(sumaArreglos(a, b)));
                    System.out.println("<><><><><><><><><><><><><><><><><><><><>");
                    break;
                default:
                    eje=false;
                    System.out.println("<------El metodo no se encuentra en esta clase----->");
                    System.out.println("Fin del programa");

              }
        }while(eje);
        
    }
    // 1.- Escribe un método que obtenga el número de letras x que contiene un String (x es
    //     un parámetro de tipo char).
    public static int cuentaLetras(String frase,char x){
        int n=0;
        for(int i=0;i<frase.length();i++){
            if(frase.charAt(i)==x)n++;
        }
        return n;
    }
    // 2.- Escribe un método que reciba como parámetro un String y obtenga el total de
    //     caracteres que son dígitos.
    public static int caracteresDigitos(String texto){
        int c=0;
        for(int i=0;i<texto.length();i++){
            if(Character.isDigit(texto.charAt(i)))c++;
        }
        return c;
    }
    // 3.- Escribe un método que reciba como parámetro un número entero y obtenga como
    //     resultado un valor boolean, verdadero si el número es par y falso si es impar.
    public static boolean esPar(int numero){
        return numero%2==0;
    } 
    // 4.- Escribe un método que reciba como parámetro un entero y determine si este es o no
    //     un número primo.
    public static boolean esPrimo(int numero){
        return numero%2!=0;
    }
    // 5. -Escribe un método que reciba un número del 0 al 100 y regrese como resultado el
    //     número en letras.
    public static String numLetras(int numero){
        String [] resultados={"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez",
                              "one","doce","trece","catorce","quince","dieciseis","diecisiete","dieciocho","diecinueve","veinte",
                              "veintiuno","veintidos","veintitres","veinticuatro","veinticinco","veintiseis","veintisiete","veintiocho","veintinueve","treinta",
                              "treinta y uno","treinta y dos","treinta y tres","treinta y cuatro","treinta y cinco","treinta y seis","treinta y siete", "treinta y ocho", "treinta y nueve", "cuarenta",
                              "cuarenta y uno", "cuarenta y dos","cuarenta y tres", "cuarenta y cinco","cuarenta y seis"," cuarenta y siete", "cuarenta y ocho","cuarenta y nueve","cincuenta",
                              "cincuenta y uno","cincuenta y dos","cincuenta y tres","cincuenta y cuatro","cincuenta y cinco","cincuenta y seis","cincuenta y siete","cincuenta y ocho","cincuenta y nueve","sesenta",
                              "sesenta y uno","sesenta y dos", "sesenta y tres","sesenta y cuatro","sesenta y cinco","sesenta y seis","sesenta y siete","sesenta y ocho","sesenta y nueve","setenta",
                              "setenta y uno","setenta y dos", "setenta y tres","setenta y cuatro","setenta y cinco","setenta y seis","setenta y siete","setenta y ocho","setenta y nueve","ochenta",
                              "ochenta y uno","ochenta y dos","ochenta y tres","ochenta y cuatro","ochenta y cinco","ochenta y seis","ochenta y siete","ochenta y ocho","ochenta y nueve","noventa",
                              "noventa y uno","noventa y dos","noventa y tres","noventa y cuatro","noventa y cinco","noventa y seis","noventa y siete","noventa y ocho","noventa y nueve","cien"
                            };
        return resultados[numero];
    }
    // 14.-Escribe un método que reciba como parámetro un entero entre 0 y 99 y obtenga el
    //     de decenas que contiene.
    public static int numDecenas(int numero){
        int decenas=0;
        if(numero>=0 && numero<=99){
            decenas=(int)(numero/10);
            return decenas;
        }
        else{
            decenas=0;
            return decenas;
        }
    }
    // 15.-Escribe un método que reciba como parámetro una cantidad en pesos y regrese
    //     como resultado la cantidad en dólares, el tipo de cambio es 12.17 pesos por dólar.
    public static double pesoDolar(int pesos){
        double pesosDolares;
        pesosDolares=pesos/12.17;
        return pesosDolares;
    }
    // 16.-Escribe un método que reciba como parámetro una cantidad en dólares y regrese
    //     como resultado la cantidad en pesos, el tipo de cambio es 12.17 pesos por dólar
    public static double dolarPeso(int dolar){
        double dolarPesos;
        dolarPesos=dolar*12.17;
        return dolarPesos;
    }
    // 17.-Escribe un método que reciba un entero como parámetro y regrese un booleano
    //     indicando si el parámetro esta en el rango de 0 a 100.
    public static boolean rangoNumero(int numero){
        return (numero<100 && numero>0);
    }
    // 18.-Escribe un método que reciba como parámetro un String y regrese un valor bolean
    //     indicando si el String es un palíndromo.
    public static boolean esPalindromo(String frase){
        frase = frase.toLowerCase();
        frase=frase.replaceAll("\\s","");
        for (int i = 0, j = frase.length() -1; i <= j; i++,j--) {
            if (frase.charAt(i) != frase.charAt(j)){
                return false;
            }
            
        }
        return true;
    }
    // 19.-Escribe un método que reciba como parámetro un String y obtenga como resultado
    //     el número de palabras que contiene (las palabras están separadas por espacio).
    public static int numeroPalabras(String frase){
        int palabras=0;
        char c;
        frase=frase.trim();
        if(frase.isEmpty()){
            palabras=0;
            return palabras;
        }
        else{
            for(int i=0;i<frase.length();i++){
                c=frase.charAt(i);
                if(c==' '){palabras++;};
            }
            palabras=palabras+1;
            return palabras;
        }
       
       
    }
    // 20.-Escribe un método que regrese como resultado un valor aleatorio entre 1 y 6.
    public static int valorEntre(){
        Random genera=new Random();
        return genera.nextInt(6)+1;
    }
    // 21.-Escribe un método que reciba un número entero como parámetro y regrese como
    //     resultado un arreglo de números enteros con todos sus divisores.
    public static int[] divisoresNumero(int numero){
        int a=0,p=0;
        for(int i=1; i<=numero;i++){ 
            if(numero%i==0)a++;
        }
        int divisores[]=new int [a];

        for(int i=1; i<=numero;i++){ 
            if(numero%i==0){divisores[p]=i;p++;}
        }
        return divisores;
    }
    // 22.-Escribe un método que reciba como parámetro dos arreglos de datos enteros y
    //     obtenga como resultado un arreglo con la suma de los dos parámetros.
    public static int [] sumaArreglos(int[]a, int[]b){
        int t=a.length;
        int [] c=new int[t];
        if (a.length==b.length){
            for(int i=0;i<a.length;i++)c[i]=a[i]+b[i];
            return c;
        }else{
            for(int i=0;i<a.length;i++)c[i]=0;
            return c;
        }
    }
}
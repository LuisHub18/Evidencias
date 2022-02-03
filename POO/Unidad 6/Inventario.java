import java.io.*;
import java.util.StringTokenizer;
public class Inventario {
public static void main(String[] args) {
Articulo [] inventario = new Articulo[100]; // alamcenará los artículos
StringTokenizer tokenizer ;
String linea, desc, entrada = "inventario.txt";
int cant, contador =0;
float prec;
try{
FileReader file = new FileReader(entrada);
BufferedReader archivoEntrada = new BufferedReader(file);
linea = archivoEntrada.readLine();
while (linea != null){
tokenizer = new StringTokenizer(linea);
desc = tokenizer.nextToken();
try { cant = Integer.parseInt(tokenizer.nextToken());
prec = Float.parseFloat(tokenizer.nextToken());
inventario[contador++] = new Articulo(desc, cant, prec);
} catch(NumberFormatException formatoNumero){
System.out.println("Linea erronea, sera ignorada: \r "+linea); }
linea = archivoEntrada.readLine();
}
archivoEntrada.close();
for (int i=0; i<contador; i++) System.out.println(inventario[i]);
}
catch (FileNotFoundException excepcion){
System.out.println("el archivo "+entrada+" no fue encontrado"); }
catch (IOException excepcion){ System.out.println(excepcion); }
}
}
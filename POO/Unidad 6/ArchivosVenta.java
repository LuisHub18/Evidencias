//Autor: Eduardo Tellez.
import java.io.*;
import java.util.StringTokenizer;

public class ArchivosVenta {
    public static void main(String[] args) {
        Producto [] inventario = new Producto[8]; 
        StringTokenizer tokenizer ;
        String linea, cod,desc, entrada = "C:\\Users\\holal\\Desktop\\txt\\ventasDia.txt";
        int cant, contador =0;
        int[] cantidades=new int[10];
        double prec;
        try{
        FileReader file = new FileReader(entrada);
        BufferedReader archivoEntrada = new BufferedReader(file);
        linea = archivoEntrada.readLine();
        int i=0;
        while (linea != null){
            tokenizer = new StringTokenizer(linea);
            cod = tokenizer.nextToken();
            try { 
                desc=tokenizer.nextToken();
                prec = Double.parseDouble(tokenizer.nextToken());
                while(tokenizer.hasMoreTokens()){
                    
                }
                cantidades[i++]=Integer.parseInt(tokenizer.nextToken());
            

            } catch(NumberFormatException formatoNumero){
            System.out.println("Linea erronea, sera ignorada: \r "+linea); }
            linea = archivoEntrada.readLine();
            }
            archivoEntrada.close();
        for (int j=0; j<contador; j++) System.out.println(inventario[i]);
        }
        catch (FileNotFoundException excepcion){
        System.out.println("el archivo "+entrada+" no fue encontrado"); }
        catch (IOException excepcion){ System.out.println(excepcion); }
        }

}
        

import java.io.*;
// usa stream de caracteres
public class CopiarArchivo{
public static void main (String [] args) throws IOException{
    
        try {
             // define los archivos fisicos
            File archivoEntrada = new File("C:\\Users\\holal\\Desktop\\txt\\ventasDia.txt");
            File archivoSalida = new File("C:\\Users\\holal\\Desktop\\txt\\ventasSemana.txt");
            // Define los flujos de datos usando los archivos físicos
            FileReader in = new FileReader(archivoEntrada);
            FileWriter out = new FileWriter(archivoSalida);
            PrintWriter file = new PrintWriter(out);
            int c;
            while ((c=in.read()) != -1) out.write(c);
            // cierra los archivos
            in.close();
            file.println("Total del dia viernes");
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        }
       
       
    }
}
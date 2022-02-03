public class UsaLibro {
    public static void main(String [] args){
        Libro [] libros=new Libro[3];
        String titulo, autor, editorial;
        int clasificacion, ano;
        //Agregar libro
        for(int i=0;i<libros.length;i++){
            System.out.print("Cual es el titulo del libro? ");
            titulo=Keyboard.readString();
            System.out.print("Cual es el autor del libro?");
            autor=Keyboard.readString();
            System.out.print("Cual es el editorial del libro?");
            editorial=Keyboard.readString();
            do{
                System.out.print("En que año se publico el libro?");
                ano=Keyboard.readInt();
                if(ano<0)System.out.println("Valor incorrecto!");
            }while(ano<0);
            do{
                System.out.print("De que clasificacion es el libro?");
                clasificacion=Keyboard.readInt();
                if(clasificacion<0 ||clasificacion>9)System.out.println("Valor incorrecto!");
            }while(clasificacion<0 ||clasificacion>9);
            libros[i]=new Libro(titulo,autor,editorial,ano,clasificacion);
        }
            numeroLibrosClasificacion(libros);
    }
    //  24.-Escribe un método que reciba como parámetro un arreglo de objetos tipo Libro y 
    //      obtenga el número de libros de cada clasificación.
    public static String numeroLibrosClasificacion(Libro [] a){
        int tipo0=0,tipo1=0,tipo2=0,tipo3=0,tipo4=0,tipo5=0,tipo6=0,tipo7=0,tipo8=0,tipo9=0;   
         for(int i=0;i<a.length;i++){
            if(a[i].getClasificacion()==0)tipo0++;
            else if(a[i].getClasificacion()==1)tipo1++;
            else if(a[i].getClasificacion()==2)tipo2++;
            else if(a[i].getClasificacion()==3)tipo3++;
            else if(a[i].getClasificacion()==4)tipo4++;
            else if(a[i].getClasificacion()==5)tipo5++;
            else if(a[i].getClasificacion()==6)tipo6++;
            else if(a[i].getClasificacion()==7)tipo7++;
            else if(a[i].getClasificacion()==8)tipo8++;
            else if(a[i].getClasificacion()==9)tipo9++;
        }
        return "Numero de libros de cada clasificacion\n"+"Tipo 0: "+tipo0+"\nTipo 1:"+tipo1+"\nTipo 2: "+tipo2+
        "\nTipo 3:"+tipo3+"\nTipo 4:"+tipo4+"\nTipo 5: "+tipo5+"\nTipo 6:"+tipo6+"\nTipo 7: "+tipo7+"\nTipo 8: "+tipo8+"Tipo 9: "+tipo9;
    }
}

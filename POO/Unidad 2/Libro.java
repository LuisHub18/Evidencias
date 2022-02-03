//Autor:Eduardo Tellez.
    //  23.-Escribe una clase libro con los atributos titulo, autor, editorial, año, clasificación
    //      (0..9) y los métodos get/set necesarios para manipular los atributos.

public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private int ano;
    private int clasificacion;
    //Constructor
    public Libro(String t,String a,String e,int an,int c){
        titulo=t;
        autor=a;
        editorial=e;
        ano=an;
        clasificacion=c;
    }
    //Metodos get
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public String getEditorial(){
        return editorial;
    }
    public int getAno(){
        return ano;
    }
    public int getClasificacion(){
        return clasificacion;
    }
    //Metodos set
    public void setTitulo(String t){
        titulo=t;
    }
    public void setAutor(String a){
        autor=a;
    }
    public void setEditorial(String e){
        editorial=e;
    }
    public void setAno(int an){
        ano=an;
    }
    public void setClasificacion(int c){
        clasificacion=c;
    }
        
    

}

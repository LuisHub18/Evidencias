//Autor: Eduardo Téllez.
public class Animal {
    private String especie;
    protected String nombre;
    public Animal(String especie,String nombre){
        this.especie=especie;
        this.nombre=nombre;
    }
    public String getEspecie(){
        return especie;
    }
    public void printMensaje(){
        System.out.println("Soy Animal de especie "+ especie);
    }
    public String toString(){   
        return "Animal "+especie;
    }
}

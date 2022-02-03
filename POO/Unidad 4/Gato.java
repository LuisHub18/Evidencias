//Autor: Eduardo Téllez.
public class Gato extends Animal{
    private String raza;
    public Gato(String nombre,String raza){
        super("Gato",nombre);
        this.raza=raza;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String toString(){
        return super.toString()+" me llamo "+this.nombre+" y soy de la raza "+raza;
    }
}
